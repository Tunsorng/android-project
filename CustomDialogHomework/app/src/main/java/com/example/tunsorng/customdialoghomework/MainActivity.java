package com.example.tunsorng.customdialoghomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.tunsorng.customdialoghomework.Util.MessageDialogFragment;

public class MainActivity extends AppCompatActivity implements MessageDialogFragment.OnSendDataListener {
    Button btnImport;
    TextView txtID,txtName,txtPrice,txtDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtID=findViewById(R.id.tvID);
        txtName=findViewById(R.id.tvName);
        txtPrice=findViewById(R.id.tvPrice);
        txtDate=findViewById(R.id.tvDate);
        btnImport=findViewById(R.id.btnImportPro);
        btnImport.setOnClickListener(v -> {

            MessageDialogFragment dialog =new MessageDialogFragment();
            dialog.setMessage("Input your product");
            dialog.setOnSendDataListener(this);
            dialog.show(getSupportFragmentManager(),"Dialog");

        });
    }

    @Override
    public void onGetData(String ID, String Name, String Price, String Date) {
        txtID.setText("Product ID : "+ID);
        txtName.setText("Product Name : "+Name);
        txtPrice.setText("Product Price : "+Price);
        txtDate.setText("Product date Import : "+Date);


    }
}
