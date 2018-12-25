package com.example.rathana.servercommunication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button=findViewById(R.id.btnShowProgress);
        button.setOnClickListener(v->{
            new LoadingDialogAsyncTask(MainActivity.this).execute();

        });
    }
}
