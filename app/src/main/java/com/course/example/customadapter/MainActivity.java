package com.course.example.customadapter;

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

        //create ArrayList valies
        arrayList.add(new MyData(1, " Allison","987-576-4435"));
        arrayList.add(new MyData(2, " Robert","878-757-6768"));
        arrayList.add(new MyData(3, " Jason","657-576-5765"));

        //create custom adapter and connect to LIstView
        adapter = new MyAdapter(this, arrayList);
        listView.setAdapter(adapter);
    }

    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        String name = arrayList.get(position).getName();
        Toast.makeText(this, "Hello, " + name, Toast.LENGTH_LONG).show();
    }

}