package com.example.hp_pc.recyclerviewgridviewproduct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ProductGridActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    private ProductGridViewAdapter gridAdapter;
    private List<Product> products = new ArrayList<>();
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_grid);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        gridAdapter = new ProductGridViewAdapter(products, this);
        recyclerView.setAdapter(gridAdapter);

        //imageView = findViewById(R.id.imageProduct);


        getData();

      /* imageView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onClick(v);

           }
       });*/

    }
        private void getData() {
            for (int i = 0; i < 20; i++) {
                this.products.add(new Product(
                        "http://ae01.alicdn.com/kf/HTB1rSM_CgaTBuNjSszfq6xgfpXab.jpg",
                        34.0
                ));
                this.products.add(new Product(
                        "http://ae01.alicdn.com/kf/HTB1wzuBNVXXXXXAXFXXq6xXFXXXV.jpg_350x350q90.jpg",
                        100.0
                ));
                this.products.add(new Product(
                        "http://ae01.alicdn.com/kf/HTB1qtsGByCYBuNkSnaVq6AMsVXaC.jpg_350x350q90.jpg",
                        6.0
                ));


            }

            gridAdapter.updateProducts(this.products);


        }

  /* public void onClick(View view) {
        Intent intent_browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        startActivity(intent_browser);

    }*/


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater inflater =getMenuInflater();
            inflater.inflate(R.menu.option_grid_product,menu);
            return super.onCreateOptionsMenu(menu);
        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id=item.getGroupId();
       /* switch (item.getItemId()){
            case R.id.new_product_grid_menu:
                break;

        }*/
            if(id==R.id.new_product_grid_menu){
                //start add post
               // startActivity(new Intent(ProductGridActivity.this,AddPostProductActivity.class));
            }

            return true;

    }
}
