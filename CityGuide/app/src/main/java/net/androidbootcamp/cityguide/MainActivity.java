package net.androidbootcamp.cityguide;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String [] attraction = {"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, attraction));
    }
}
