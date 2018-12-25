package com.example.tunsorng.adapterlistviewhomework.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tunsorng.adapterlistviewhomework.R;
import com.example.tunsorng.adapterlistviewhomework.entity.Item;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<Item> items;

    public CustomAdapter( List<Item>  items){
        this.items=items;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        if(convertView==null)
            view =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custome_layout_adapter,parent,false);
        else
            view=convertView;

        Item item= items.get(position);



       ImageView thumnail=view.findViewById(R.id.imgthumnail);
        TextView title=view.findViewById(R.id.txtTitle);
        TextView channel =view.findViewById(R.id.txtChannelName);
        TextView time = view.findViewById(R.id.txtTime);



        thumnail.setImageResource(item.getThumnail());
        title.setText(item.getTitle());
        channel.setText(item.getChannelName());
        time.setText(item.getTime());

        return view ;
    }
}
