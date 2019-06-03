package com.example.codeforfun.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.codeforfun.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddTodoFragment extends Fragment implements View.OnClickListener {
    public static final String TAG = AddTodoFragment.class.getSimpleName();
    private FloatingActionButton flClose;
    private EditText edtTittle;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_todo, container, false);
        init(view);

        return view;
    }

    private AddTodoFragment() {

    }

    public static AddTodoFragment getFragment() {
        return new AddTodoFragment();
    }

    private void init(View v) {
        flClose = v.findViewById(R.id.flbt_close);
        edtTittle = v.findViewById(R.id.edt_title_todo);

        flClose.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.flbt_close:
                if (getFragmentManager() != null) {
                    getFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_out_bot, R.anim.slide_in_bot).remove(AddTodoFragment.this).commit();
                }
                break;
        }
    }
}
