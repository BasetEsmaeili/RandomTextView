package com.baset.randomtv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewHolderTextLists extends RecyclerView.ViewHolder {
    private TextView textView;

    public ViewHolderTextLists(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView1);
    }

    public void bindData(ArrayList<String> textList) {
        textView.setText(textList.get(getAdapterPosition()));
    }
}
