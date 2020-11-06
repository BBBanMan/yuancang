package com.example.holleworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.app.Activity.RESULT_OK;

public class SecondAcitivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Button button2 = findViewById(R.id.start_dialog_activity);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            Intent intent = new Intent();
            intent.putExtra("msg","data from SecondActivity");
            setResult(RESULT_OK,intent);
            finish();
         }
    });
    }
}