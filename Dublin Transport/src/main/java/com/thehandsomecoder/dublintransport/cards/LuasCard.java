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

   /* public void setupInnerViewElements(ViewGroup parent, View view) {

        TextView textView = (TextView) view.findViewById(R.id.carddemo_googlenow_main_inner_lastupdate);
        textView.setText("Update 14:57, 16 September"); //should use R.string.

        StockListLayout list = (StockListLayout) view.findViewById(R.id.carddemo_googlenow_main_inner_list);
        ListStockAdapter mAdapter = new ListStockAdapter(super.getContext(), buildArrayHelper());


        list.setAdapter(mAdapter);

    }


    //------------------------------------------------------------------------------------------


    public ArrayList<Stock> buildArrayHelper() {

        Stock s1 = new Stock("GOOG", 889.07f, 0.00f, 0.00f);
        Stock s2 = new Stock("AAPL", 404.27f, 0.00f, 0.00f);
        Stock s3 = new Stock("ENI", 17.59f, 0.06f, 0.34f);
        Stock s4 = new Stock("Don Jones", 15.376f, 0.00f, 0.00f);

        ArrayList<Stock> list = new ArrayList<Stock>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        return list;
    }*/
}
