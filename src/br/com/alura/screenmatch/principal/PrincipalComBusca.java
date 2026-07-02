package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o Filme que deseja buscar: ");
        var busca = sc.nextLine();
        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=efcd57bb";
        try{
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb meutituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meutituloOmdb);
            Titulo meutitulo = new Titulo(meutituloOmdb);
            System.out.println("Titulo convertido.");
            System.out.println(meutitulo);
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro.");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro na sua busca, verifique.");
            System.out.println(e.getMessage());
        }

    }
}