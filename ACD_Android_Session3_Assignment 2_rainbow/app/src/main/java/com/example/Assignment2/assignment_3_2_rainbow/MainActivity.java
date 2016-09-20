package com.example.pravar_ag.assignment_3_2_rainbow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView colorRed, colorOrng, colorYlo, colorGrn, colorBl, colorInd, colorVlt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorRed=(TextView)findViewById(R.id.red_color);
        colorOrng=(TextView)findViewById(R.id.orange_color);
        colorYlo=(TextView)findViewById(R.id.yellow_color);
        colorGrn=(TextView)findViewById(R.id.green_color);
        colorBl=(TextView)findViewById(R.id.blue_color);
        colorInd=(TextView)findViewById(R.id.indigo_color);
        colorVlt=(TextView)findViewById(R.id.violet_color);

        colorRed.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorRed.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        colorOrng.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorOrng.getText().toString(), Toast.LENGTH_SHORT).show();

                return false;
            }
        });


        colorYlo.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorYlo.getText().toString(), Toast.LENGTH_SHORT).show();

                return false;
            }
        });


        colorGrn.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorGrn.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        colorBl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorBl.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        colorInd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorInd.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        colorVlt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),colorVlt.getText().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        

    }












}
