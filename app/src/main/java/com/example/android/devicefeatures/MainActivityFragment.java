package com.example.android.devicefeatures;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public void onResume() {
        super.onResume();

        Context context = getActivity().getApplicationContext();

//        DisplayMetrics metrics = new DisplayMetrics();
//        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        DisplayMetrics metrics = getResources().getDisplayMetrics();

        String text = metrics.scaledDensity
                + " (" + Integer.toString(metrics.widthPixels)
                + ", " + Integer.toString(metrics.heightPixels) +")"
                + " (" + Double.toString(metrics.xdpi)
                + ", " + Double.toString(metrics.ydpi) +")"
                ;
        int duration = Toast.LENGTH_SHORT;

        Toast t = Toast.makeText(context,text, duration);
        t.show();

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
