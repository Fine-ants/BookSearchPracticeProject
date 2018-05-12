package com.example.jorda.booksearchpracticeproject;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

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
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    @Nullable
    public ArrayList<Book> loadInBackground() {
        ArrayList<Book> books = Utils.fetchBookData(searchString);
        return books;
    }
}
