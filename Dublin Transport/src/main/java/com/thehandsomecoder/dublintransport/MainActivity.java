package com.thehandsomecoder.dublintransport;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.thehandsomecoder.dublintransport.cards.LuasCard;

import java.util.ArrayList;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardArrayAdapter;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardListView;
import it.gmariotti.cardslib.library.view.CardView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Card> cards = new ArrayList<Card>();

        for(int i = 0; i < 100; i++)
        {
         //Create a Card
         Card card = new LuasCard(this,R.layout.custom_card_layout);


         //Create a CardHeader
         CardHeader header = new CardHeader(this);
         header.setTitle("Jervis");
         //Add Header to card
         card.addCardHeader(header);
         cards.add(card);
        }

        CardArrayAdapter mCardArrayAdapter = new CardArrayAdapter(this,cards);

        CardListView listView = (CardListView) this.findViewById(R.id.cardList);
        if (listView!=null){
            listView.setAdapter(mCardArrayAdapter);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
