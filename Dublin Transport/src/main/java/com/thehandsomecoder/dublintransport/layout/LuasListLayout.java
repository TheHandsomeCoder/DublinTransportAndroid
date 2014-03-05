package com.thehandsomecoder.dublintransport.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.thehandsomecoder.dublintransport.adapters.LuasTimeListAdapter;

/**
 * Created by Scott on 05/03/14.
 */
public class LuasListLayout extends LinearLayout implements
        View.OnClickListener {

    private LuasTimeListAdapter mList;
    private View.OnClickListener mListener;
    private View view;

    public LuasListLayout(Context context) {
        super(context);
    }

    public LuasListLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LuasListLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setAdapter(LuasTimeListAdapter list) {
        this.mList = list;
        setOrientation(VERTICAL);

        //Popolute list
        if (mList != null) {
            for (int i = 0; i < mList.getCount(); i++) {
                view = mList.getView(i, null, null);
                this.addView(view);
            }
        }
    }

    public void setListener(View.OnClickListener listener) {
        this.mListener = listener;
    }

    @Override
    public void onClick(View v) {

    }


}