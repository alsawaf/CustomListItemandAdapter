package com.example.android.customlistitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by win8 on 2/1/2018.
 */

public class PersonAdapter extends ArrayAdapter {

    private Context mContext;
    private ArrayList<Person> myArray;

    public PersonAdapter (Context context , int listItem , ArrayList<Person> dataSet){

        super(context , 0 , dataSet);

        mContext = context;
        myArray = dataSet;
    }

    @Override
    public View getView (int position , View convertView , ViewGroup parentView){

        View listItem = convertView;

        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.person_list_item,parentView,false);

        Person currentPerson = myArray.get(position);

        TextView nameTextView = (TextView)listItem.findViewById(R.id.nameTextView);
        nameTextView.setText(currentPerson.Name);

        TextView ageTextView = (TextView)listItem.findViewById(R.id.ageTextView);
        ageTextView.setText(String.valueOf(currentPerson.Age));

        return listItem;
    }

}
