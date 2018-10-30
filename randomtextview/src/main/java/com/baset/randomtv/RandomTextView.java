package com.baset.randomtv;

import android.content.Context;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import java.util.ArrayList;
import java.util.Random;

public class RandomTextView extends AppCompatTextView {
    public RandomTextView(Context context) {
        super(context);
    }

    public RandomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RandomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setTextList(@ArrayRes int arrayId) {
        try {
            setTextList(getResources().getStringArray(arrayId));
        } catch (Exception ignored) {
        }
    }

    public void setTextList(@NonNull String[] textList) {
        this.setText(textList[getRandomValue(textList.length)]);
    }

    public void setTextList(@NonNull ArrayList<String> textList) {
        this.setText(textList.get(getRandomValue(textList.size())));
    }

    public static int getRandomValue(int arraySize) {
        return new Random().nextInt(arraySize);
    }
}
