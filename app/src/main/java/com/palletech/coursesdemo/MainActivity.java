package com.palletech.coursesdemo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    String[] courseNames= new String[] {"Full Dot Net", "C# Freshers Demo Videos", "C# Exp Demo Videos", "SQL Server Fresher Demo Videos", "SQL Server Exp Demo Videos"};
    ArrayAdapter<String> arrayAdapter;
    ListView coursesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //coursesListView = (ListView) findViewById(R.id.coursesListView);
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                courseNames);
        //coursesListView.setAdapter(arrayAdapter);

        setListAdapter(arrayAdapter);
/*
        coursesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, VideoList.class);
                i.putExtra("CourseName",courseNames[position]);
                startActivity(i);
            }
        });*/
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent i = new Intent(MainActivity.this, VideoList.class);
        i.putExtra("CourseName",courseNames[position]);
        startActivity(i);
        super.onListItemClick(l, v, position, id);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
