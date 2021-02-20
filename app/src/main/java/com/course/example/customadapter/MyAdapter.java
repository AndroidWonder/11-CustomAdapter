package com.course.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
public class MyAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<MyData> arrayList;
    private TextView serialNum, name, contactNum;
    public MyAdapter(Context context, ArrayList<MyData> arrayList) {
        super(context, 0, arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //call inflater to create a View from an xml layout file
        convertView = LayoutInflater.from(context).inflate(R.layout.row, parent, false);

        //get references for row widgets
        serialNum = convertView.findViewById(R.id.serialNumber);
        name = convertView.findViewById(R.id.studentName);
        contactNum = convertView.findViewById(R.id.mobileNum);

        serialNum.setText(" " + arrayList.get(position).getNum());
        name.setText(arrayList.get(position).getName());
        contactNum.setText(arrayList.get(position).getMobileNumber());
        return convertView;
    }
}