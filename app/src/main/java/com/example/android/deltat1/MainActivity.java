package com.example.android.deltat1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int r=0,g=0,b=0;

    public void background()
    {
        RelativeLayout rel = (RelativeLayout) findViewById(R.id.activity_main);
        rel.setBackgroundColor(Color.rgb(r,g,b));
        TextView redval = (TextView) findViewById(R.id.redValue);
        TextView greenval = (TextView) findViewById(R.id.greenValue);
        TextView blueval = (TextView) findViewById(R.id.blueValue);
        redval.setText("" + r);
        greenval.setText("" + g);
        blueval.setText("" + b);

    }


    public void redCounter(View v1) {
        r = r + 1;
        if(r>255)
            reset();
        background();
    }

    public void greenCounter(View v2) {
        g = g + 1;
        if(g>255)
            reset();
        background();
    }

    public void blueCounter(View v3) {
        b = b + 1;
        if(b>255)
            reset();
        background();
    }

    public void reset(){
        r=0;g=0;b=0;
        background();
    }

    public void resetCounter(View v4){
        r=0;g=0;b=0;
        background();
    }

}
