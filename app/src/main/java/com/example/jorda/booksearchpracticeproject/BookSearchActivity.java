package com.example.jorda.booksearchpracticeproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class BookSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search);


        Button searchBooks = findViewById(R.id.button_book_search);
        searchBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Edit text user input
                EditText searchText = findViewById(R.id.edittext_book_search);


                // Confirm user input exists, if none exit
                String bookSearchInput = searchText.getText().toString();
                if(bookSearchInput==null){
                    return;
                }

                // Fetch books matching user input from Google Books API
                ArrayList<Book> books = Utils.fetchVolumesFromJson(bookSearchInput);
                for(Book book: books){
                    Log.i("debugtag", book.getAuthor());
                    Log.i("debugtag", book.getTitle());
                    Log.i("debugtag", book.getPrice()+"");
                }
            }
        });


    }
}






















