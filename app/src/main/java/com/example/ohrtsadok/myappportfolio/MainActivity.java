package com.example.ohrtsadok.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button spotify = (Button)findViewById(R.id.bSpotify);
        Button scores = (Button)findViewById(R.id.bScores);
        Button library = (Button)findViewById(R.id.bLibrary);
        Button bigger = (Button)findViewById(R.id.bBigger);
        Button xyzreader = (Button)findViewById(R.id.bReader);
        Button capstone = (Button)findViewById(R.id.bCapstone);
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
    public void openSpotifyStreamer(View view){
        String text = "This button will open the Spotify Streamer App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void openScores(View view){
        String text = "This button will open the Football Scores App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void openLibrary(View view){
        String text = "This button will open the Library App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void openBIB(View view){
        String text = "This button will open the Build It Bigger App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void openXYZReader(View view){
        String text = "This button will open the XYZ Reader App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
    public void openCapstone(View view){
        String text = "This button will open the Capstone App!";
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}
