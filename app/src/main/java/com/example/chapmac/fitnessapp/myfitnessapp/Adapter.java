package com.example.chapmac.fitnessapp.myfitnessapp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class Adapter extends BaseAdapter{

    private List<Posture> postureList;
    private LayoutInflater layoutInflater;

    public Adapter(Context context,List<Posture> postureList){
        this.postureList = postureList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    static class ViewHolder{
        TextView title;
        ImageView img;
    }

    @Override
    public int getCount() {
        return postureList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;

        if(view == null){
            view = layoutInflater.inflate(R.layout.row_layout,parent,false);
            holder = new ViewHolder();

            holder.title = (TextView)view.findViewById(R.id.txtTitle);
            holder.img = (ImageView)view.findViewById(R.id.icon);
            view.setTag(holder);
        }else{
            holder = (ViewHolder)view.getTag();
        }

        holder.title.setText(postureList.get(position).getTitle());
        holder.img.setImageResource(postureList.get(position).getIcon());

        return view;
    }
}
