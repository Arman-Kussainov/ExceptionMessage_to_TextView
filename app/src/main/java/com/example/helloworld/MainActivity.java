package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String message;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        // you can cut and paste it to the writelistfunction
        int[] g = new int[5];
        try{
            for (int i = 0; i < 10; i++) {
                g[i]=0;
            }
        }catch (IndexOutOfBoundsException e){
            MainActivity.message = String.valueOf(e)+"zzzz...";
            //text_to_display= String.valueOf(e);
            Log.e("MainActivity","*->"+ message+ "<-*");

        }
        finally {}
        text = (TextView)findViewById(R.id.text_field);
        text.setText(MainActivity.message);
    }
    public void writeList() {
    }

}