package com.example.bijay.myapp_gridview_imagetext;

import android.graphics.Bitmap;

/**
 * Created by Bijay on 18-05-2016.
 */
public class AndroidV {
        Bitmap image;
        String name;

        public AndroidV(){}

        public AndroidV(Bitmap image, String name){
            super();
            this.image =image;
            this.name=name;
        }
        public Bitmap getImage(){return image;}
        public void setImage(Bitmap image){this.image=image;}
        public String getName(){return name;}
        public void setName(String name){this.name=name;}
}
