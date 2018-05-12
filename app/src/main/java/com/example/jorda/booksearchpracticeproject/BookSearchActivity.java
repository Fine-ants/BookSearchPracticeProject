package com.example.jorda.booksearchpracticeproject;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class BookSearchActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<Book>>{

    private String bookSearchInput;
    private final static int EARTHQUAKE_LOADER_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_search);


        Button searchBooks = findViewById(R.id.button_book_search);
        searchBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Retrieve user book search input
                EditText searchText = findViewById(R.id.edittext_book_search);
                bookSearchInput = searchText.getText().toString();

                // Init LoaderManager
                getSupportLoaderManager().initLoader(EARTHQUAKE_LOADER_ID, null, BookSearchActivity.this);
            }
        });


    }

    public void updateUi(ArrayList<Book> books){
        // Fetch books matching user input from Google Books API
        BookAdapter adapter = new BookAdapter(BookSearchActivity.this, R.layout.list_item, books);
        ListView booksListView = findViewById(R.id.books_list_view);
        booksListView.setAdapter(adapter);
    }

    @NonNull
    @Override
    public Loader<ArrayList<Book>> onCreateLoader(int id, @Nullable Bundle args) {
        return new BooksLoader(this, bookSearchInput);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<Book>> loader, ArrayList<Book> data) {
        // Update the UI with the newly loaded ArrayList of books
        if(data!=null){
            updateUi(data);
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<Book>> loader) {
        updateUi(new ArrayList<Book>());
    }
}






















