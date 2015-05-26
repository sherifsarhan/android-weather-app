package com.example.sherif.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment
{

    public DetailActivityFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView =  inflater.inflate(R.layout.fragment_detail, container, false);

//        final String LOG_TAG = DetailActivityFragment.class.getSimpleName();
        Intent detailIntent = getActivity().getIntent();
        if(detailIntent != null && detailIntent.hasExtra(Intent.EXTRA_TEXT))
        {
            String weatherInfo = detailIntent.getStringExtra(Intent.EXTRA_TEXT);
            TextView view = (TextView) rootView.findViewById(R.id.detailed_weather_textview);
            view.setText(weatherInfo);
        }
        return rootView;
    }
}
