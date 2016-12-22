package com.techpalle.dilogexp1;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyProgessDilog extends DialogFragment {
    ProgressDialog progressDialog;


    public MyProgessDilog() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=null;
    progressDialog=new ProgressDialog(getActivity());
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("uploading");//title
        progressDialog.setMessage("2of10 images  upload");//message
      //  progressDialog.setProgress(20);
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);//for horizontal
        d=progressDialog;
        return d;
    }

    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(20);
    }
}
