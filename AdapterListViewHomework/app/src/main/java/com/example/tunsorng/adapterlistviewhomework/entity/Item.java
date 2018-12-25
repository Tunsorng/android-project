package com.example.tunsorng.adapterlistviewhomework.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

    private  int id;
    private  String Title;
    private  String ChannelName;
    private  String time;
    private  int Thumnail;

    protected Item(Parcel in) {
        id = in.readInt();
        Title = in.readString();
        ChannelName = in.readString();
        time = in.readString();
        Thumnail = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(Title);
        dest.writeString(ChannelName);
        dest.writeString(time);
        dest.writeInt(Thumnail);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getThumnail() {
        return Thumnail;
    }

    public Item(String title, String channelName, String time, int thumnail) {
        Title = title;
        ChannelName = channelName;
        this.time = time;
        Thumnail = thumnail;
    }

    public Item() {
    }

    public void setThumnail(int thumnail) {

        Thumnail = thumnail;
    }


}
