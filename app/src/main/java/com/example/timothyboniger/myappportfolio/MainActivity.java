package com.example.timothyboniger.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Context;
import android.widget.Toast;

import java.sql.BatchUpdateException;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        /* Button Variables */
        Button spotifyButton = (Button) findViewById(R.id.button);
        Button scoresButton = (Button) findViewById(R.id.button2);
        Button libraryButton = (Button) findViewById(R.id.button3);
        Button builditButton = (Button) findViewById(R.id.button4);
        Button xyzButton = (Button) findViewById(R.id.button5);
        Button capstoneButton = (Button) findViewById(R.id.button6);

        /* Spotify OnClickListener */
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my Spotify streamer app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        /* Scores App OnClickListener */
        scoresButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my scores app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        /* Library App OnClickListener */
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my library app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        /* Build It Bigger OnClickListener */
        builditButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my build it bigger app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        /* XYZ Reader OnClickListener */
        xyzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my xyz reader app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        /* Capstone OnClickListener */
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = "This button will launch my capstone app";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
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
