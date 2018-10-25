package com.baset.randomtv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RandomTextView randomTextView;
    private ArrayList<String> textList = new ArrayList<>();
    private RecyclerView rvTextList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupArrayList();
        setupViews();
        setupRandomTextView();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        rvTextList.setLayoutManager(new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false));
        rvTextList.setAdapter(new AdapterTextLists(textList));
    }

    private void setupArrayList() {
        textList.addAll(Arrays.asList("JAVA", "PHP", "JavaScript", "Python", "Objective-C", "Ruby",
                "Perl", "C, C++ and C#", "SQL", "Swift"));
    }

    private void setupRandomTextView() {
        randomTextView.setTextList(textList);
    }

    private void setupViews() {
        randomTextView = findViewById(R.id.randomtv);
        rvTextList = findViewById(R.id.textLists);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.select_btn:
                setupRandomTextView();
                break;
        }
    }
}
