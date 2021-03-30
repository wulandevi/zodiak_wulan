package com.example.zodiak;

import android.os.Parcel;
import android.os.Parcelable;

public class Zodiak implements Parcelable {

    private String name;
    private String detail;
    private int photo;

    public Zodiak(){

    }

    protected Zodiak(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Zodiak> CREATOR = new Creator<Zodiak>() {
        @Override
        public Zodiak createFromParcel(Parcel in) {
            return new Zodiak(in);
        }

        @Override
        public Zodiak[] newArray(int size) {
            return new Zodiak[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
