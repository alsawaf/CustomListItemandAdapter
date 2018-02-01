package com.example.android.customlistitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    ArrayList<Person> myArray;
    PersonAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView)findViewById(R.id.myListView);
        myArray = new ArrayList<Person>();

        for(int i=0; i<100; i++){
        myArray.add(new Person("Omar", 20));
        myArray.add(new Person("Ahmed", 21));
        }
        //we write android when it's android built in
        myAdapter = new PersonAdapter(MainActivity.this ,R.layout.person_list_item, myArray);

        myListView.setAdapter(myAdapter);


    }
}
