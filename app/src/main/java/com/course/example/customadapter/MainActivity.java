package com.course.example.customadapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    ArrayList<MyData> arrayList = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        //attach listener
        listView.setOnItemClickListener(this);

        //create ArrayList values
        arrayList.add(new MyData(1, " Allison","9875764435"));
        arrayList.add(new MyData(2, " Robert","8787576768"));
        arrayList.add(new MyData(3, " Jason","6575765765"));
        arrayList.add(new MyData(4, " Mary","6595765999"));
        arrayList.add(new MyData(5, "Elizabeth","7188904376"));

        //create custom adapter and connect to ListView
        adapter = new MyAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }

    //create toast and open dialer for the person selected
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

        String name = arrayList.get(position).getName();
        Toast.makeText(this, "Hello, " + name, Toast.LENGTH_LONG).show();

        String phone = arrayList.get(position).getMobileNumber();

        //open dialer with implicit intent
        Uri uri = Uri.parse("tel:" + phone);
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

}
