package com.example.manuelsanchez.appportfolio;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View.OnClickListener toastOnclickListener = toastOnClickListener();

        Button musicStreamerBtn = (Button) findViewById(R.id.streamer);
        musicStreamerBtn.setOnClickListener(toastOnclickListener);

        Button duoBtn = (Button) findViewById(R.id.super_duo);
        duoBtn.setOnClickListener(toastOnclickListener);

        Button buildItBtn = (Button) findViewById(R.id.build_it_bigger);
        buildItBtn.setOnClickListener(toastOnclickListener);

        Button readerBtn = (Button) findViewById(R.id.reader);
        readerBtn.setOnClickListener(toastOnclickListener);

        Button capstoneBtn = (Button) findViewById(R.id.capstone);
        capstoneBtn.setOnClickListener(toastOnclickListener);

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

    private View.OnClickListener toastOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) v;
                Toast.makeText(MainActivity.this, "This button will launch my " + textView.getText() + " app!", Toast.LENGTH_SHORT).show();
            }
        };
    }

}
