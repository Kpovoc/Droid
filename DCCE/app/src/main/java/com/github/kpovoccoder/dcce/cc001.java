package com.github.kpovoccoder.dcce;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class cc001 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc001);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /** Called when user clicks the Greet button */
    public void greetUser(View view){
        TextView greeting = (TextView) findViewById(R.id.cc001_greeting);

        EditText eName= (EditText) findViewById(R.id.cc001_name);
        EditText eAge= (EditText) findViewById(R.id.cc001_age);
        EditText eUsername= (EditText) findViewById(R.id.cc001_username);

        String name = eName.getText().toString();
        String age = eAge.getText().toString();
        String username = eUsername.getText().toString();
        String message = "Hello " + name + ". You must be that " + age + " year old, " + username +
                ", from reddit!";
        greeting.setText(message);
    }

}
