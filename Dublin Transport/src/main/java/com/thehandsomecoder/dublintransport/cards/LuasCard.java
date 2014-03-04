package com.thehandsomecoder.dublintransport.cards;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.thehandsomecoder.dublintransport.R;

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

    @Override
    public void setupInnerViewElements(ViewGroup parent, View view) {


    }
}
