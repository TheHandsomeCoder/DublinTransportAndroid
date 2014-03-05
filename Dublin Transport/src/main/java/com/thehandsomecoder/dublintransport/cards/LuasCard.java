package com.thehandsomecoder.dublintransport.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.thehandsomecoder.dublintransport.R;
import com.thehandsomecoder.dublintransport.adapters.LuasTimeListAdapter;
import com.thehandsomecoder.dublintransport.layout.LuasListLayout;
import com.thehandsomecoder.dublintransport.luas.TramInformation;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;

/**
 * Created by Scott on 03/03/14.
 */
public class LuasCard extends Card {

    protected TextView mTitle;
    protected TextView mSecondaryTitle;

    /**
     * Constructor with a custom inner layout
     * @param context
     */
    public LuasCard(Context context) {
        this(context, R.layout.custom_card_layout);
    }

    /**
     *
     * @param context
     * @param innerLayout
     */
    public LuasCard(Context context, int innerLayout) {
        super(context, innerLayout);
        init();
    }

    /**
     * Init
     */
    private void init(){

        //No Header

        //Set a OnClickListener listener
        setOnClickListener(new OnCardClickListener() {
            @Override
            public void onClick(Card card, View view) {
                Toast.makeText(getContext(), "Click Listener card=", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void setupInnerViewElements(ViewGroup parent, View view) {


        LuasListLayout inboundList = (LuasListLayout) view.findViewById(R.id.inboundListView);
        inboundList.setAdapter(new LuasTimeListAdapter(super.getContext(), buildArrayHelper()));

        LuasListLayout outboundList = (LuasListLayout) view.findViewById(R.id.outboundListView);
        outboundList.setAdapter(new LuasTimeListAdapter(super.getContext(), buildArrayHelper()));


    }


    //------------------------------------------------------------------------------------------


    public ArrayList<TramInformation> buildArrayHelper() {

        TramInformation s1 = new TramInformation("Inbound",  "St. Stephens Green",  "Due");
        TramInformation s2 = new TramInformation("Inbound",  "Harcourt Street",  "5");
        TramInformation s3 = new TramInformation("Inbound",  "St. Stephens Green",  "10");

        ArrayList<TramInformation> list = new ArrayList<TramInformation>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        return list;
    }
}
