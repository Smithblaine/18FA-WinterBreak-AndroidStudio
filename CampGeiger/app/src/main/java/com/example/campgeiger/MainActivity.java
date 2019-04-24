package com.example.campgeiger;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    final Context context  = this;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner activities = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.activities));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        activities.setAdapter(adapter);


        activities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String Text = String.valueOf(parent.getSelectedItem().toString());
                buildDialog(Text);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

            public void buildDialog(String text){
                if (text.equals("Help")){
                    setContentView(R.layout.custom);
                    dialog.setTitle(R.string.app_name);
                    dialog.setMessage(R.string.tester);
                    dialog.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            setContentView(R.layout.activity_main);

                            MainActivity.super.recreate();
                        }
                    });
                    dialog.create();
                    dialog.show();
                }
            }
        });
    }
}

