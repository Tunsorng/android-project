package com.example.tunsorng.homeworkgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.tunsorng.homeworkgridview.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridAdapter gridAdapter;
    List<Product> products=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView=findViewById(R.id.recyclerView);
        gridAdapter = new GridAdapter(products,this);
        recyclerView.setLayoutManager(
                new GridLayoutManager(this,2)

        );
        recyclerView.setAdapter(gridAdapter);
        getData();
    }

    private void getData() {
        for (int i=0; i<20; i++){
            this.products.add(new Product(
                    "http://ae01.alicdn.com/kf/HTB1rSM_CgaTBuNjSszfq6xgfpXab.jpg",
                    50.0
            ));
            this.products.add(new Product(
                    "http://ae01.alicdn.com/kf/HTB1wzuBNVXXXXXAXFXXq6xXFXXXV.jpg_350x350q90.jpg",
                    49.0
            ));
            this.products.add(new Product(
                    "http://ae01.alicdn.com/kf/HTB1qtsGByCYBuNkSnaVq6AMsVXaC.jpg_350x350q90.jpg",
                    199.0
            ));
        }

        gridAdapter.upDateProducts(this.products);
    }
}
