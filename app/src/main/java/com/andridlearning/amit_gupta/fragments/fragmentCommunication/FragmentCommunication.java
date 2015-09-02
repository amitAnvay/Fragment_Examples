package com.andridlearning.amit_gupta.fragments.fragmentCommunication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.andridlearning.amit_gupta.fragments.R;

public class FragmentCommunication extends Activity implements Fragment1.CommunicationListener, Fragment2.CommunicationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_communication);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fragment_communication, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void sendMessage(String text) {

       Fragment2 fragment = (Fragment2)getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.updateText(text);
    }

    @Override
    public void sendMessage2(String text) {

        Fragment1 fragment = (Fragment1)getFragmentManager().findFragmentById(R.id.fragment1);
        fragment.updateText(text);
    }
}
