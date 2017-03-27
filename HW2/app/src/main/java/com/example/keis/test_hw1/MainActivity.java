package com.example.keis.test_hw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.SubMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private static final int Menu_1 = Menu.FIRST;
    private static final int Menu_2 = Menu.FIRST+2;
    private static final int Menu_Exit = Menu.FIRST+3;

    @Override


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
            menu.add(0, Menu_1, 0 ,"A activity");
            menu.add(0, Menu_2, 1 ,"B activity");
            menu.add(0,Menu_Exit,2,"Exit");

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case Menu_1:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                return true;
            case Menu_2:
                Intent intent_2 = new Intent();
                intent_2.setClass(MainActivity.this, Main3Activity.class);
                startActivity(intent_2);
                return true;
            case Menu_Exit:
                finish();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }


}
