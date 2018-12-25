package com.example.admin.adapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.admin.adapterdemo.adapter.GridViewAdapter;
import com.example.admin.adapterdemo.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    GridView gridView;
    List<Product> products=new ArrayList<>();
    GridViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        gridView=findViewById(R.id.gridView);

        setupUI();
        //create products
        getData();

    }

    private void setupUI() {
        adapter=new GridViewAdapter(products);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(ProductActivity.this,MainActivity.class));
            }
        });
    }

    private void getData(){
        for(int i =0;i<50;i++){
            this.products.add(new Product(3.45,"http://ae01.alicdn.com/kf/HTB1L7zef8smBKNjSZFsq6yXSVXa2.jpg_350x350.jpg"));
        }

        adapter.setData(this.products);
    }
}
