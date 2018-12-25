package com.example.hp_pc.recyclerviewgridviewproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddPostProductActivity extends AppCompatActivity  implements View.OnClickListener{
    ImageView addImage;
    EditText addPrice;
    Button btnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_post_product2);

        addImage=findViewById(R.id.AddProduct);
        addPrice=findViewById(R.id.AddPrice);
        btnUpload.setOnClickListener(this);

        //image click to choose image
      /*  addImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //upload image
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.
            }
        });*/
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnUpload){
            Product product=new Product(
                    R.drawable.images_sad,
                    addPrice.getText().toString());

            Intent intent =new Intent();
            Bundle bundle =new Bundle();
            //bundle.putParcelable("data",product);
            intent.putExtras(bundle);
            setResult(RESULT_OK,intent);
            finish();
        }

    }
}
