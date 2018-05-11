package com.example.jorda.booksearchpracticeproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jorda on 5/10/2018.
 */

public class BookAdapter extends ArrayAdapter<Book> {
    public BookAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Book> objects) {
        super(context, resource, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        // Inflate recycled view if empty
        if(listItem==null){
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Retrieve book object at current index
        Book book = getItem(position);

        // Populate recycled view
        TextView title = listItem.findViewById(R.id.title);
        title.setText(book.getTitle());
        TextView author = listItem.findViewById(R.id.author);
        author.setText(book.getAuthor());


        return listItem;


    }
}
