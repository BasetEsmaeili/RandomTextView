package com.baset.randomtv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AdapterTextLists extends RecyclerView.Adapter<ViewHolderTextLists> {
    private ArrayList<String> textList;

    AdapterTextLists(ArrayList<String> textList) {
        this.textList = textList;
    }

    @NonNull
    @Override
    public ViewHolderTextLists onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_view_item, viewGroup, false);
        return new ViewHolderTextLists(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTextLists viewHolderTextLists, int i) {
        viewHolderTextLists.bindData(textList);
    }

    @Override
    public int getItemCount() {
        return textList.size();
    }
}
