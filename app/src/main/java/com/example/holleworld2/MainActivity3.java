package com.example.holleworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Log.i("MainActivity3","调用onCreate()");
        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity3.this, NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtn = findViewById(R.id.start_dialog_activity);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity3.this, DialogActivity.class);
                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity3","调用onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity3","调用onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity3","调用onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity3","调用onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity3","调用onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity3","调用onRestart()");
    }
}
