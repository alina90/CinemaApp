package com.example.cinema.cinemaapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /* Called when the user clicks the button Detalii */
    
    public void details1(View view) {
    	  Intent intent = new Intent(this, SecondActivity.class);
    	  startActivity(intent);
    	  }
    
    public void details2(View view) {
  	  Intent intent = new Intent(this, ThirdActivity.class);
  	  startActivity(intent);
  	  }
    
    public void details3(View view) {
  	  Intent intent = new Intent(this, FourthActivity.class);
  	  startActivity(intent);
  	  }
    
    public void details4(View view) {
  	  Intent intent = new Intent(this,  FifthActivity.class);
  	  startActivity(intent);
  	  }
    
    public void details5(View view) {
  	  Intent intent = new Intent(this, SixthActivity.class);
  	  startActivity(intent);
  	  }
}
