package com.example.tunsorng.homeworkgridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tunsorng.homeworkgridview.model.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    private List<Product> products;
    private Context context;

    public GridAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_grid_view_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Product product=products.get(position);
        Picasso.get().load(product.getImage())
                .centerCrop()
                .resize(200,200)
                .placeholder(R.drawable.loading)
                .into(viewHolder.image);
        viewHolder.price.setText(""+product.getPrice());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void upDateProducts(List<Product> products) {
        this.products.addAll(products);
        notifyDataSetChanged();
    }

    class   ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.thumb);
            price = itemView.findViewById(R.id.price);
        }
    }
}
