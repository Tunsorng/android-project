package com.example.myfirstproject.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    List<Post> posts;
    Context context;

    public PostAdapter(Context context , List<Post> posts) {
        this.posts = posts;
        this.context=context;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(
                R.layout.post_item_layout,viewGroup,false

        );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder viewHolder, int i) {

        Post post=posts.get(i);
        viewHolder.imageProfile.setImageResource(post.getUserProfile());
        viewHolder.image.setImageResource(post.getImage());
        viewHolder.userName.setText(post.getUserName());
        viewHolder.content.setText(post.getContent());
        viewHolder.checkIn.setText(post.getCheckIn());
        viewHolder.btnMenu.setImageResource(post.getImage());

        viewHolder.onImageClicked();
        viewHolder.onMenuClicked();

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

     public  class  ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageProfile, image , btnMenu, btnLike, btnComment, btnShare, btnBookmark;
        TextView userName,content,checkIn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageProfile = itemView.findViewById(R.id.profile);
            image= itemView.findViewById(R.id.post);
            btnMenu= itemView.findViewById(R.id.imgMore);
            btnLike= itemView.findViewById(R.id.favorite);
            btnComment= itemView.findViewById(R.id.comment);
            btnShare= itemView.findViewById(R.id.share);
            btnBookmark= itemView.findViewById(R.id.bookMark);
            userName= itemView.findViewById(R.id.txtName);
            content= itemView.findViewById(R.id.content);
            checkIn= itemView.findViewById(R.id.txtLocation);


        }

        public void onImageClicked() {

            image.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                   context.startActivity(new Intent(context,MainActivity.class));
                }
            });
        }



         public void onMenuClicked() {

            btnLike.setOnClickListener((v)->{
             PopupMenu p =new PopupMenu(context,v);
             MenuInflater inflater = p.getMenuInflater();
             inflater.inflate(R.menu.pop_up_menu,p.getMenu());
             p.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                 @Override
                 public boolean onMenuItemClick(MenuItem item) {
                     switch (item.getItemId()) {
                         case R.id.edit:
                             Toast.makeText(context, "Edit", Toast.LENGTH_SHORT).show();
                             break;
                     }
                     return false;
                 }
             });
             p.show();

         });

         }
     }

    public void setPosts(List<Post> posts) {

        this.posts.addAll(posts);
        notifyDataSetChanged();
    }


}
