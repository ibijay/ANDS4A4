package com.example.bijay.myapp_gridview_imagetext;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AndroidV> gridArray = new ArrayList<AndroidV>();
    GridAdapter ga;
    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap ccIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.cupcake);
        Bitmap dnIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.donought);
        Bitmap enIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.enclair);
        Bitmap frIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.froyo);
        Bitmap gbIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.gingerboard);
        Bitmap hcIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.honeycomb);
        Bitmap icIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.icecream);
        Bitmap jbIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.jellybin);
        Bitmap kkIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.kitkat);
        Bitmap lpIcon = BitmapFactory.decodeResource(this.getResources(),R.drawable.lollypop);

        gridArray.add(new AndroidV(ccIcon,"Cup Cake"));
        gridArray.add(new AndroidV(dnIcon,"Donought"));
        gridArray.add(new AndroidV(enIcon,"Enclair"));
        gridArray.add(new AndroidV(frIcon,"Froyo"));
        gridArray.add(new AndroidV(gbIcon,"GingerBoard"));
        gridArray.add(new AndroidV(hcIcon,"HoneyComb"));
        gridArray.add(new AndroidV(icIcon,"IceCream"));
        gridArray.add(new AndroidV(jbIcon,"JellyBean"));
        gridArray.add(new AndroidV(kkIcon,"KitKat"));
        gridArray.add(new AndroidV(lpIcon,"Lollypop"));

        gv =(GridView) findViewById(R.id.gridView);

        ga = new GridAdapter(this, R.layout.grid_viewlayout, gridArray);
        gv.setAdapter(ga);
    }
}
