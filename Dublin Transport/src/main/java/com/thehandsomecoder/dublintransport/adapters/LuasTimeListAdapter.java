package com.thehandsomecoder.dublintransport.adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.thehandsomecoder.dublintransport.R;
import com.thehandsomecoder.dublintransport.luas.TramInformation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scott on 05/03/14.
 */
public class LuasTimeListAdapter extends ArrayAdapter<TramInformation> {

    private ArrayList<TramInformation> tramInformation;

    public LuasTimeListAdapter(Context context, ArrayList<TramInformation> objects) {
        super(context, 0, objects);
        this.tramInformation = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View v = convertView;
        if (v == null)
        {
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.luas_times_layout, null);
        }

        TramInformation tramInfo = tramInformation.get(position);
        if (tramInfo != null)
        {
            TextView stationName = (TextView) v.findViewById(R.id.station_name);
            TextView dueTime = (TextView) v.findViewById(R.id.due_time);
            if (stationName != null)
            {
                stationName.setText(tramInfo.getDestination());
            }

            if (dueTime != null)
            {
                String formattedDueTime = (tramInfo.getDueTime().equalsIgnoreCase("Due")) ? tramInfo.getDueTime() : tramInfo.getDueTime() + " min";
                dueTime.setText(formattedDueTime);
            }
        }
        return v;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }
}







