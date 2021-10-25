package com.example.goprog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class SelectCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_course);

        ImageView java_class = (ImageView) findViewById(R.id.java_class);
        java_class.setOnClickListener(v -> {
            Intent intent = new Intent(SelectCourse.this,JavaClass.class);
            startActivity(intent);
        });

        Button btnback = (Button) findViewById(R.id.btn_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectCourse.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}