package com.android.habitapp.motivational_msg.beans;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Hitesh on 10/20/2016.
 */

public class MsgSingle implements Parcelable{

    private String habit_id;
    private String habit_name;
    private String habit_desciption;
    private String habit_users;

    public MsgSingle() {
    }

    public MsgSingle(String habit_id, String habit_name, String habit_desciption, String habit_users) {
        this.habit_id = habit_id;
        this.habit_name = habit_name;
        this.habit_desciption = habit_desciption;
        this.habit_users = habit_users;
    }

    protected MsgSingle(Parcel in) {
        habit_id = in.readString();
        habit_name = in.readString();
        habit_desciption = in.readString();
        habit_users = in.readString();
    }

    public static final Creator<MsgSingle> CREATOR = new Creator<MsgSingle>() {
        @Override
        public MsgSingle createFromParcel(Parcel in) {
            return new MsgSingle(in);
        }

        @Override
        public MsgSingle[] newArray(int size) {
            return new MsgSingle[size];
        }
    };

    public String getHabit_id() {
        return habit_id;
    }

    public void setHabit_id(String habit_id) {
        this.habit_id = habit_id;
    }

    public String getHabit_name() {
        return habit_name;
    }

    public void setHabit_name(String habit_name) {
        this.habit_name = habit_name;
    }

    public String getHabit_desciption() {
        return habit_desciption;
    }

    public void setHabit_desciption(String habit_desciption) {
        this.habit_desciption = habit_desciption;
    }

    public String getHabit_users() {
        return habit_users;
    }

    public void setHabit_users(String habit_users) {
        this.habit_users = habit_users;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(habit_id);
        parcel.writeString(habit_name);
        parcel.writeString(habit_desciption);
        parcel.writeString(habit_users);
    }
}





