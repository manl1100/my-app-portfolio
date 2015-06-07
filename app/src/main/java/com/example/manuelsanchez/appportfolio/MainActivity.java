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
    }

    public void displayAppLauncherToast(View view) {
        TextView textView = (TextView) view;
        Toast.makeText(MainActivity.this, "This button will launch my " + textView.getText() + " app!", Toast.LENGTH_SHORT).show();
    }

}
