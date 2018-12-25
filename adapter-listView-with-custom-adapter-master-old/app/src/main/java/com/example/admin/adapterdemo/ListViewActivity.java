package com.example.admin.adapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.adapterdemo.adapter.CustomAdapter;
import com.example.admin.adapterdemo.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    String[] phoneList={"012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414","012 812 812","098 25 14 36","096 78 45 414"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView=findViewById(R.id.listView);

       /* ArrayAdapter<String> adapter=new ArrayAdapter(
               this,
                android.R.layout.simple_list_item_1 ,
                phoneList
        );*/

        //create new item layout
        /*ArrayAdapter<String> customLayoutAdapter= new ArrayAdapter(
              this,
              R.layout.phone_item_layout,
              R.id.text1,
              phoneList
        );*/

        //create customAdapter object

        List<Contact> contactList=new ArrayList();
        for (int i =0 ;i<10;i++){
            contactList.add(new Contact("012 812 81"+i,R.drawable.dag));
        }
        CustomAdapter customAdapter=new CustomAdapter(contactList);


        //set adapter
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener((parent,view,position,id)->{
            /*Toast.makeText(this, phoneList[position], Toast.LENGTH_SHORT).show();*/
            startActivity(new Intent(this,MainActivity.class));
        });

    }
}
