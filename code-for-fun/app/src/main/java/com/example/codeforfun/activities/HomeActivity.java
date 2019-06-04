package com.example.codeforfun.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.codeforfun.R;
import com.example.codeforfun.fragments.AddTodoFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {
    private RelativeLayout llMain;
    private FrameLayout flContentMain;
    private FloatingActionButton flbtAddTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        init();
        listener();
    }

    private void init() {
        flContentMain = findViewById(R.id.fl_content_main);
        llMain = findViewById(R.id.rl_content);
        flbtAddTodo = llMain.findViewById(R.id.flbt_add_todo);
    }

    private void listener() {
        flbtAddTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFragmentAddTodo();
            }
        });
    }

    private void showFragmentAddTodo() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setCustomAnimations(R.anim.slide_in_up, R.anim.slide_out_up);
        ft.add(R.id.fl_content_main, AddTodoFragment.getFragment(), AddTodoFragment.TAG);
        ft.commit();
    }
}
