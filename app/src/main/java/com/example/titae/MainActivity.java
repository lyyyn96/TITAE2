package com.example.titae;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
=======
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;
>>>>>>> a5efad5... search recyclerview 구현

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD


    }
    public void onClick(View view) {

        Intent intent = new Intent(this, SearchResult.class);
        startActivity(intent);
    }
=======
        Button MTSbtn = (Button)findViewById(R.id.main_to_search_btn);
        MTSbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "to SearchActivity", Toast.LENGTH_LONG).show();
                Intent myintent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(myintent);
                finish();
            }
        });
    }

>>>>>>> a5efad5... search recyclerview 구현
}
