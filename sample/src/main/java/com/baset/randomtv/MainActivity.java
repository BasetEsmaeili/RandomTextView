package com.baset.randomtv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RandomTextView randomTextView;
    private ArrayList<String> textList = new ArrayList<>();
    private RecyclerView rvTextList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupArrayList();
        setupVIews();
        setupRandomTextView();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        rvTextList.setLayoutManager(new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false));
        rvTextList.setAdapter(new AdapterTextLists(textList));
    }

    private void setupArrayList() {
        textList.add("JAVA");
        textList.add("PHP");
        textList.add("JavaScript");
        textList.add("Python");
        textList.add("Objective-C");
        textList.add("Ruby");
        textList.add("Perl");
        textList.add("C, C++ and C#");
        textList.add("SQL");
        textList.add("Swift");
    }

    private void setupRandomTextView() {
        randomTextView.setTextList(textList);
    }

    private void setupVIews() {
        randomTextView = findViewById(R.id.randomtv);
        rvTextList = findViewById(R.id.textLists);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.select_btn:
                setupRandomTextView();
                break;
        }
    }
}
