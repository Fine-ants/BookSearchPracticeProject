package com.example.jorda.booksearchpracticeproject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorda on 5/9/2018.
 */

public class Utils {

    public static ArrayList<Book> fetchBookData(String searchString){

        // Build url string
        String url = "https://www.googleapis.com/books/v1/volumes?q=";
        url += "&q=" + searchString;

        // Fetch JSON
        String jsonResponse=null;
        try {
            jsonResponse = makeHttpRequest(url);
        }catch (IOException e){
            e.printStackTrace();
        }

        // Parse JSON into ArrayList
        ArrayList<Book> books=null;
        if(jsonResponse!=null){
            books = getBooksFromJson(jsonResponse);
        }

        return books;
    }

    public static ArrayList<Book> getBooksFromJson(String searchInput){

        ArrayList<Book> books = new ArrayList<>();
        try {
            // Get JSON root
            JSONObject jsonRoot = new JSONObject(searchInput);

            // Items JSON array
            JSONArray jsonItems = jsonRoot.getJSONArray("items");


            String title;
            String author;
            double price;
            for(int i=0; i<jsonItems.length(); i++){
                // Book volume
                JSONObject volume = jsonItems.getJSONObject(i);

                // Volume info
                JSONObject volumeInfo = volume.getJSONObject("volumeInfo");
                title = volumeInfo.getString("title");
                author = volumeInfo.getJSONArray("authors").getString(0);
                books.add(new Book(title, author, 34.99));
            }
        }catch (JSONException e){
            e.printStackTrace();
        }


        // Return ArrayList of books
        return books;
    }

    public static String makeHttpRequest(String urlString)throws IOException{

        // Get URL object
        URL url;
        HttpURLConnection httpURLConnection = null;
        String jsonResponse=null;
        InputStream inputStream=null;
        try{
            // Get HttpObject
            url = new URL(urlString);
            httpURLConnection = (HttpURLConnection) url.openConnection();

            // Define connection parameters
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");

            // Connect
            httpURLConnection.connect();

            // Connection successful?
            if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
                // Init InputStream
                inputStream = httpURLConnection.getInputStream();

                // Read from inputStream
                jsonResponse = readFromStream(inputStream);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            // Disconnect HttpUrlConnection
            if(httpURLConnection!=null){httpURLConnection.disconnect();}

            // Close InputStream
            if(inputStream!=null){inputStream.close();}
        }

        return jsonResponse;
    }


    public static String readFromStream(InputStream inputStream) throws IOException{
        // Init readers and string builder
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Read each line and append to StringBuilder
        String line = bufferedReader.readLine();
        while(!line.isEmpty()){
            stringBuilder.append(line);
            line = bufferedReader.readLine();
        }

        return stringBuilder.toString();
    }
}




















