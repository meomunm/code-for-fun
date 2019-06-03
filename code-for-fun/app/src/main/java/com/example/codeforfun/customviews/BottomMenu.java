package com.example.codeforfun.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.codeforfun.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomMenu extends FrameLayout {
    private FloatingActionButton floatingActionButton;
    private TextView textViewLeft;
    private TextView textViewRight;


    public BottomMenu(@NonNull Context context) {
        super(context);
        init();
    }

    public BottomMenu(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        inflate(getContext(), R.layout.frame_navigation_bottom, this);
        floatingActionButton =  findViewById(R.id.flbt_add_todo);
        textViewLeft = findViewById(R.id.tv_home);
        textViewRight = findViewById(R.id.tv_task);
    }


}
