package com.yyquan.jzh.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yyquan.jzh.R;
import com.yyquan.jzh.entity.tb_problem;

import java.util.ArrayList;
/**
 * Created by JHL on 2018/9/9.
 */
public class QuestionTitleListViewAdapter  extends BaseAdapter {

    Context context;
    ArrayList<tb_problem> list;
    public String  TAG = "QuestionTitleListViewAdapter";

    public QuestionTitleListViewAdapter(Context context, ArrayList<tb_problem> list) {
        this.context = context;
        this.list = list;
    }

    public void setList(ArrayList<tb_problem> lists){list=lists;}

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG,"getView " + position + " " + convertView);
        ViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item_question, null);
            holder = new ViewHolder();
            holder.iv_icon = (ImageView) convertView.findViewById(R.id.listview_item_imageview_icon);
            holder.tv_title = (TextView) convertView.findViewById(R.id.listview_item_textView_title);
            holder.tv_content = (TextView) convertView.findViewById(R.id.listview_item_textView_pinglun);
            convertView.setTag(holder);
        }else{
            holder =(ViewHolder) convertView.getTag();
        }
        holder.tv_title.setText( list.get(position).getProblemname());
        holder.tv_content.setText( list.get(position).getProblemcontent());

        return convertView;
    }
    private class ViewHolder {
        TextView tv_title;
        TextView tv_content;
        ImageView iv_icon;
    }
}
