package com.example.hp_pc.recyclerviewgridviewproduct;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductGridViewAdapter extends RecyclerView.Adapter<ProductGridViewAdapter.ViewHolder>  {



    List<Product> products;
    Context context;




    public ProductGridViewAdapter(List<Product> prouducts, Context context) {
        this.products = prouducts;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_pruduct_gridview,parent,false);
        return new ViewHolder(view);

    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Product product =products.get(position);
        Picasso.get()
                .load(product.getImage())
                .resize(200, 200)
                .centerCrop()
                .placeholder(R.drawable.loading_image)
                .into(viewHolder.image_product);
        viewHolder.price.setText(""+product.getPrice());



    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder  {
        ImageView image_product;
        TextView price;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);


            image_product=itemView.findViewById(R.id.imageProduct);
            price=itemView.findViewById(R.id.price);




        }



    }
    //update product

    public void updateProducts(List<Product>products){
        this.products.addAll(products);
        notifyDataSetChanged();
    }



}
