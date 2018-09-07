package com.example.c4q.apotheosis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mainView;
    private Button top_right_btn, top_left_btn, bottom_right_btn, bottom_left_btn;
    String prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();


    }
    public void initialView(){
        mainView = findViewById(R.id.main_textview);
        mainView.setText(R.string.scene_one_pt1);
        top_right_btn = findViewById(R.id.top_right_button);
        top_left_btn = findViewById(R.id.top_left_button);
        bottom_left_btn = findViewById(R.id.bottom_left_button);
        bottom_right_btn = findViewById(R.id.bottom_right_button);
        top_right_btn.setText(R.string.south_option);
        top_left_btn.setText(R.string.north_option);
        bottom_right_btn.setText(R.string.west_option);
        bottom_left_btn.setText(R.string.east_option);
    }



}
