package com.techpalle.dilogexp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b1,b2,b3,b4;
    TextView tv;
    public void catchData(String date){
        tv.setText("selected:"+date);
    }
    public void catchData1(String time){
        tv.setText("selected:"+time);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.button1);
        b1= (Button) findViewById(R.id.button2);
        b2= (Button) findViewById(R.id.button3);
        b3= (Button) findViewById(R.id.button4);
        b4= (Button) findViewById(R.id.button5);

        tv= (TextView) findViewById(R.id.textview1);

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
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              MyDatePicker myDatePicker=new MyDatePicker();
                myDatePicker.show(getSupportFragmentManager(),null);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimePicker myTimePicker=new MyTimePicker();
                myTimePicker.show(getSupportFragmentManager(),null);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           MyCustomDialog myCustomDialog=new MyCustomDialog();
                myCustomDialog.show(getSupportFragmentManager(),null);
            }
        });
    }
}
