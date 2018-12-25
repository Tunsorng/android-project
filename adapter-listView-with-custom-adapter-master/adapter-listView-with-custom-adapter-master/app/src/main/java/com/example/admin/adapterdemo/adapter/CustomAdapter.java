package com.example.admin.adapterdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.adapterdemo.R;
import com.example.admin.adapterdemo.entity.Contact;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<Contact>  contacts;

    public CustomAdapter( List<Contact>  contacts){
        this.contacts=contacts;
    }

    // count item in array or arrayList
    @Override
    public int getCount() {
        return contacts.size();
    }

    //return item
    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //convert layout from xml and bind data
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        if(convertView==null)
            view =LayoutInflater.from(parent.getContext()).inflate(R.layout.phone_item_custom_adaper_layout,
                parent,false);
        else
            view=convertView;

        //bind data
        Contact contact= contacts.get(position);
        //create view Object
        ImageView image=view.findViewById(R.id.image);
        TextView phone=view.findViewById(R.id.text1);

        image.setImageResource(contact.getImage());
        phone.setText(contact.getPhone());

        return view ;
    }
}
