package com.example.bijay.myapp_gridview_imagetext;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bijay on 18-05-2016.
 */
public class GridAdapter extends ArrayAdapter<AndroidV>
{
    Context context;
    int layoutResourceId;
    ArrayList<AndroidV> data= new ArrayList<>();

    public GridAdapter(Context context, int layoutResourceId, ArrayList<AndroidV> data) {
        super(context,layoutResourceId,data);
        this.context =context;
        this.layoutResourceId=layoutResourceId;
        this.data=data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        convertView =inflater.inflate(layoutResourceId,null);

        ImageView iv=(ImageView) convertView.findViewById(R.id.imageView);
        TextView tv=(TextView)convertView.findViewById(R.id.textView);

        AndroidV andv=data.get(position);
        iv.setImageBitmap(andv.getImage());
        tv.setText(andv.getName());
        return convertView;
    }
}