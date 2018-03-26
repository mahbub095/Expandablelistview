package com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.adapter.ExpandableListAdapter;
import com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data.ExpandableListDataPump;
import com.blogspot.owntasks.nucsesyllabus17_18.Activity.Activity.data.Thirddata;
import com.blogspot.owntasks.nucsesyllabus17_18.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Third extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);


        //important
        expandableListDetail = Thirddata.getDataTh();

        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition) + " ",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}