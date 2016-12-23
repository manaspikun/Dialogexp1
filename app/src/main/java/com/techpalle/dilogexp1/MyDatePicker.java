package com.techpalle.dilogexp1;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDatePicker extends DialogFragment {


    public MyDatePicker() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=null;
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int date=calendar.get(Calendar.DATE);
        DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                //this method will be called when user click s done button
                Toast.makeText(getActivity(),"selected :"+i2+"-"+i3+"-"+i4,Toast.LENGTH_LONG).show();
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.catchData(+i2+"/"+i3+"/"+i4);
            }
        }, year, month, date);
        d=datePickerDialog;
        return d;
    }
}