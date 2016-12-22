package com.techpalle.dilogexp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b,b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button1);
        b1= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProgessDilog myProgessDilog=new MyProgessDilog();
                myProgessDilog.show(getSupportFragmentManager(),null);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sow alert dialog popup
                MyDilogFragment myDilogFragment=new MyDilogFragment();
                myDilogFragment.show(getSupportFragmentManager(),null);
            }
        });
    }
}
