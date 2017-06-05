package com.example.chapmac.fitnessapp.myfitnessapp.Data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chapmac.fitnessapp.myfitnessapp.R;

import java.util.List;

/**
 * Created by chapmac on 6/5/2017 AD.
 */

public class Adapter extends BaseAdapter{

    private List<Workout> workoutList;
    private LayoutInflater layoutInflater;

    public Adapter(Context context,List<Workout> workoutList){
        this.workoutList = workoutList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    static class ViewHolder{
        TextView title;
        ImageView img;
    }

    @Override
    public int getCount() {
        return workoutList.size();
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

        holder.title.setText(workoutList.get(position).getTitle());
        holder.img.setImageResource(workoutList.get(position).getIcon());

        return view;
    }
}
