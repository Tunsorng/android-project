package com.example.admin.adapterdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.adapterdemo.R;
import com.example.admin.adapterdemo.entity.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    List<Product> prodocts;

    public GridViewAdapter(List<Product> products) {
        this.prodocts=products;

    }

    @Override
    public int getCount() {
        return prodocts.size();
    }

    @Override
    public Object getItem(int position) {
        return prodocts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =null;
        if(convertView==null)
            view=LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.gird_view_item_layout,parent,false);
        else
            view=convertView;

        //bind data
        Product product=prodocts.get(position);
        ImageView thumb=view.findViewById(R.id.thumb);
        ImageView btnFavorite=view.findViewById(R.id.btnFavorite);
        TextView price=view.findViewById(R.id.price);


        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(),"Favorite clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Picasso.get()
                .load(product.getImage())
                .centerCrop()
                .resize(100,100)
                .into(thumb);

        price.setText(product.getPrice()+"$");

        return view;
    }

    public void setData(List<Product> products) {
        this.prodocts.addAll(products);
        notifyDataSetChanged();
    }
}
