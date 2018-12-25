package com.example.tunsorng.adapterlistviewhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tunsorng.adapterlistviewhomework.adapter.CustomAdapter;
import com.example.tunsorng.adapterlistviewhomework.entity.Item;

import java.util.List;

public class PlayActivity extends AppCompatActivity {

    ImageView play;
    TextView Title,Channel,Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        play = findViewById(R.id.play);
        Title  = findViewById(R.id.tTitle);
        Channel = findViewById(R.id.tChannelName);
        Time= findViewById(R.id.tTime);

        Intent intent = getIntent();
        if (intent!=null) {
            String title = intent.getStringExtra("title");
            String channel = intent.getStringExtra("channel");
            String postTime = intent.getStringExtra("postTime");
            String img = intent.getStringExtra("img");
            Title.setText(title);
            Title.setText(channel);
            Title.setText(postTime);
           // Title.setText(img);


        }

//        if (intent!=null){
//            String ITE =intent.getStringExtra("item");
//            Channel.setText(ITE);
//            Title.setText(ITE);
//            Time.setText(ITE);
//
//
//
//
//            Item item=intent.getParcelableExtra("data");
//            if(item!=null){
//                Channel.setText(item.toString());
//                Title.setText(item.toString());
//                Time.setText(item.toString());
//            }
//        }

    }
}
