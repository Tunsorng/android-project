package com.example.tunsorng.adapterlistviewhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tunsorng.adapterlistviewhomework.adapter.CustomAdapter;
import com.example.tunsorng.adapterlistviewhomework.entity.Item;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    ListView listView;
    TextView ChannelName,Title,Time;
    ImageView Thumnail;
    String massege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView=findViewById(R.id.listView);
        Title=findViewById(R.id.txtTitle);
        ChannelName=findViewById(R.id.txtChannelName);
        Time=findViewById(R.id.txtTime);
        Thumnail=findViewById(R.id.imgthumnail);


        List<Item> items=new ArrayList();

            items.add(new Item("a","tutu","13h ago",R.drawable.a));
            items.add(new Item("b","Mshares","2 day ago",R.drawable.b));
            items.add(new Item("c","B2B","1h ago",R.drawable.c));
            items.add(new Item("d","Page","13h ago",R.drawable.d));
            items.add(new Item("e","Fan","13h ago",R.drawable.e));
            items.add(new Item("f","tutu","13h ago",R.drawable.a));
            items.add(new Item("g","Mshares","2 day ago",R.drawable.b));
            items.add(new Item("h","B2B","1h ago",R.drawable.c));
            items.add(new Item("i","Page","13h ago",R.drawable.d));
            items.add(new Item("j","Fan","13h ago",R.drawable.e));

        CustomAdapter customAdapter=new CustomAdapter(items);
        listView.setAdapter(customAdapter);



        listView.setOnItemClickListener((parent,view,position,id)->{

//            String title = Title.getText().toString();
//            String channel=ChannelName.getText().toString();
//            String postTime=Time.getText().toString();
//            int img=Thumnail.getImageAlpha();
//            Intent intent = new Intent(ListViewActivity.this,PlayActivity.class);
//
//            intent.putExtra("title",title);
//            intent.putExtra("channel",channel);
//            intent.putExtra("postTime",postTime);
//            intent.putExtra("img",img);
//            startActivity(intent);






            startActivity(new Intent(this,PlayActivity.class));

//            Item item = getItem();
//            Intent intent = new Intent(ListViewActivity.this,PlayActivity.class);
//
//            Bundle b = new Bundle();
//            b.putParcelable("data",item);
//            intent.putExtras(b);
//            startActivity(intent);
         });


//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
//
//                    Intent intent = new Intent(getApplicationContext(),PlayActivity.class);
//                   // intent.putExtras("Position",pos);
//                    startActivity(intent);
//
//                }
//            });



    }

//    private Item getItem() {
//        Item item = new Item();
//        item.setChannelName(ChannelName.getText().toString());
//        item.setTitle(Title.getText().toString());
//        item.setTime(Time.getText().toString());
//        item.setThumnail(Thumnail.getImageAlpha());
//
//        return item;
//
//    }
}
