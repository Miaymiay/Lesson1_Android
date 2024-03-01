package com.mirea.pershinadv.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textViewStudent);
        TextView myTextView = (TextView) findViewById(R.id.textView2);
        myTextView.setText("New text in MIREA");
        Button button20 = findViewById(R.id.button20);
        button20.setText("MireaButton");
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox2.setChecked(true);
    }
}