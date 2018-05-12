package com.example.jorda.booksearchpracticeproject;

import android.util.Log;

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


    /**
     * Single method used to fetch API data. Call this method in worker thread.
     * Handles nuances by calling other methods.
     * @param searchString
     * @return ArrayList of Books
     */
    public static ArrayList<Book> fetchBookData(String searchString){

        // Build URL
        URL url=null;
        try{
            url = new URL(searchString);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        // Fetch and parse JSON
        String jsonResponse;
        ArrayList<Book> books=null;
        try {
            jsonResponse = makeHttpRequest(url);
            books = getBooksFromJson(jsonResponse);
        }catch (IOException e){
            e.printStackTrace();
        }

        return books;
    }


    /**
     * Parse JSON into ArrayList of Books
     * @param searchInput JSON response after making an HttpUrlConnection request
     * @return ArrayList of Book objects
     */
    private static ArrayList<Book> getBooksFromJson(String searchInput){

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


    /**
     * Using URL object, establish server connection and return response as String
     * @param url URL object used to instantiate HttpUrlConnection
     * @return String of the Http response
     * @throws IOException Method throws IOException due to inputStream.close()
     */
    private static String makeHttpRequest(URL url)throws IOException{
        HttpURLConnection httpURLConnection = null;
        String jsonResponse=null;
        InputStream inputStream=null;
        try{
            // Get HttpObject
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            // Connect success?
            if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
                // Read connection response
                inputStream = httpURLConnection.getInputStream();
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

    /**
     * Bytes-->characters using InputStreamReader. Characters-->String chunks using BufferedReader.
     * String chunks-->entire String using StringBuilder.
     * @param inputStream Object from which InputStreamReader and BufferedReader subsequently read from
     * @return Response from InputStream as one entire String
     * @throws IOException Method throws IOException due to bufferedReader.readLine()
     */
    private static String readFromStream(InputStream inputStream) throws IOException{
        // Init readers and string builder
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // Read each line and append to StringBuilder
        String line = bufferedReader.readLine();
        while(line!=null){
            stringBuilder.append(line);
            line = bufferedReader.readLine();
        }

        return stringBuilder.toString();
    }
}




















