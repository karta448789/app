package com.example.keis.test_hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    private static final int Menu_back = Menu.FIRST + 1;
    private static final int Menu_1 = Menu.FIRST + 2;
    private static final int Menu_Exit = Menu.FIRST + 3;

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add(0, Menu_back, 0, "Back");
        menu.add(0, Menu_1, 1, "A activity");
        menu.add(0, Menu_Exit, 2, "Exit");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case Menu_1:
                Intent intent_2 = new Intent();
                intent_2.setClass(Main3Activity.this, Main2Activity.class);
                startActivity(intent_2);
                return true;
            case Menu_Exit:
                finish();
                return true;
            case Menu_back:
                onBackPressed();
                return true;

        }
        return super.onOptionsItemSelected(item);

    }
}
