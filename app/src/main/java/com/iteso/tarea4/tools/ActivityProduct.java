package com.iteso.tarea4.tools;

import android.os.Parcel;
import android.os.Parcelable;

public class ActivityProduct implements Parcelable {
    protected ActivityProduct(Parcel in) {
    }

    public static final Creator<ActivityProduct> CREATOR = new Creator<ActivityProduct>() {
        @Override
        public ActivityProduct createFromParcel(Parcel in) {
            return new ActivityProduct(in);
        }

        @Override
        public ActivityProduct[] newArray(int size) {
            return new ActivityProduct[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
