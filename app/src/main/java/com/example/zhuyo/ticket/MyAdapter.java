package com.example.zhuyo.ticket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ticketinfo.RailwayInfo;

/**
 * Created by zhuyo on 12/27/2017.
 */

public class MyAdapter extends BaseAdapter {

    private List<RailwayInfo> mList;
    private LayoutInflater mInfalter;
    //constructor
    public MyAdapter(Context context,List<RailwayInfo> list){
        mList = list;
        mInfalter = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View contextview, ViewGroup viewGroup) {
        View view = mInfalter.inflate(R.layout.item,null);
        ImageView imageView = (ImageView)view.findViewById(R.id.iv_img);
        TextView title = (TextView) view.findViewById(R.id.iv_title);
        TextView startTime = (TextView) view.findViewById(R.id.iv_starTime);
        TextView endTime = (TextView) view.findViewById(R.id.iv_endTime);

        RailwayInfo info = mList.get(i);
        imageView.setImageResource(R.mipmap.ic_launcher);
        title.setText(info.getTrain_no());
        startTime.setText(info.getStart_time());
        endTime.setText(info.getEnd_time());
        return view;
    }
}
