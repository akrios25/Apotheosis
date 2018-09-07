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






//        while (prompt != null){
//            switch(scene){
//
//            }
//
//        }
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

    public void setViews(){
        //assign textviews and Edittext Views here from resource
        //parameters include TextViews and button presses?(how are we keeping track of button pressing)

    }
    public void onButtonPress(){
        //logic for individual activity intent
        //EX: North ->switch activity
    }
    /*
    * Button names can be Top Left, Top Right, Bottom Left, Bottom Right
    * can create list of Strings that contain all the possible Button String Prompts...
    * buttonChecker perhaps? when a button is pressed, set textviews and button text
    * if topRight_Button.getText.toString().equals("")
    * Things to Note: Having a single activity display and then switching views
    * so depending on the click to the button prompt....
    * there's 2 approaches. One which involves we post up all the different activities that have buttons.
    * Each Activity has to have a button that takes a person to another page.
    * that page will be populated with each individual button press.
    * so if North is selected, we can call methods that
    *
    * for each string in list Strings,
    * use the variable to have the string value, pass that variable into button string checker
    * buttonLogic(String);
    *
    * public void ButtonLogic(String buttonOption){
    * if {
    * set textView to appropriate resource String.
    * EX: view.setText("Scene_Prompt_One")
    * set Button text to new Option prompts
    * }
    * }
    *
    *Is there a way i can write a method that loops through a list of Strings, and if a button matches that string, Set Vies and Edit Texts?
    *
    *
    * Every button has a string, we can make a switch case for every buttonText being a specific String.
    * KEEP THINKING ON: Button logic; how are we keeping track of button presses? can I make a list of button Text? and if a button, on click is a specific text....
    * research different ways you can use buttons decision trees for textview and buttontext updating
    *
    *
    * */

}
