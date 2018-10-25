package com.baset.randomtv;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.Random;

public class RandomTextView extends AppCompatTextView {
    private Random random;

    public RandomTextView(Context context) {
        super(context);
        init(context, null);
    }

    public RandomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        random = new Random();
    }

    public RandomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public void setTextList(String[] textList) {
        this.setText(textList[random.nextInt(textList.length)]);
    }

    public void setTextList(ArrayList<String> textList) {
        this.setText(textList.get(random.nextInt(textList.size())));
    }
}
