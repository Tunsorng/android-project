package com.example.tunsorng.ui_control_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    ImageButton btnimageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnimageButton.setOnClickListener(this);
        btnimageButton=findViewById(R.id.imageButton);

        btnimageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Anonymous Button clicked");
            }
        });

        btnimageButton.setOnClickListener(this);


        textView=findViewById(R.id.txtView);
        demotext();

    }






     void showMessage(String msg){
         Toast.makeText(this,msg, Toast.LENGTH_SHORT ).show();

     }



    void demotext(){
       /* String text=getString(R.string.text);
        textView.setText(text);
        textView.getText().toString();
        */
    }

    @Override
    public void onClick(View v) {
        showMessage("ImageButton");
    }
}
