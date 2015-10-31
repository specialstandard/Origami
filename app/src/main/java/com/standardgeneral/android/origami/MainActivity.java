package com.standardgeneral.android.origami;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    //private ArrayAdapter<String> mAdapter;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*mAdapter =
                new ArrayAdapter<String>(
                        this,
                        R.layout.list_item,
                        R.id.list_item_textview,
                        mProjects
                );*/


        ArrayList<HashMap<String, String>> mProjects = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map;

        map = new HashMap<String, String>();
        map.put("description", "Boat");
        map.put("img", String.valueOf(R.drawable.sailboat_complete));
        mProjects.add(map);

        map = new HashMap<String, String>();
        map.put("description", "Crane");
        map.put("img", String.valueOf(R.drawable.crane_complete));
        mProjects.add(map);

        map = new HashMap<String, String>();
        map.put("description", "Cat");
        map.put("img", String.valueOf(R.drawable.cat_17));
        mProjects.add(map);

        map = new HashMap<String, String>();
        map.put("description", "Dog");
        map.put("img", String.valueOf(R.drawable.dog_14));
        mProjects.add(map);

        map = new HashMap<String, String>();
        map.put("description", "ChristmasTree");
        map.put("img", String.valueOf(R.drawable.christmas_tree_complete));
        mProjects.add(map);

        SimpleAdapter mAdapter = new SimpleAdapter (this, mProjects, R.layout.list_item,
                new String[] {"img", "description"}, new int[] {R.id.img, R.id.list_item_textview});

        final ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String mProject = mAdapter.getItem(position);
                HashMap<String, String> map = (HashMap<String, String>) listView.getItemAtPosition(position);
                String mProject = map.get("description");
                Intent intent = new Intent(MainActivity.this, DetailActivity.class).putExtra(Intent.EXTRA_TEXT, mProject);
                MainActivity.this.startActivity(intent);
            }
        });
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


