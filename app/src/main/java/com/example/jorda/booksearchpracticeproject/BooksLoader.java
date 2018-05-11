package com.example.jorda.booksearchpracticeproject;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;

import java.util.ArrayList;

/**
 * Created by jorda on 5/11/2018.
 */

public class BooksLoader extends AsyncTaskLoader<ArrayList<Book>> {

    private String searchString;

    public BooksLoader(Context context, String searchString) {
        super(context);
        this.searchString = searchString;
    }

    @Override
    public ArrayList<Book> loadInBackground() {
        ArrayList<Book> books = Utils.fetchVolumesFromJson(searchString);
        return books;
    }
}
