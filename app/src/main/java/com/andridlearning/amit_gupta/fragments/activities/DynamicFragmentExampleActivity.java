package com.andridlearning.amit_gupta.fragments.activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.andridlearning.amit_gupta.fragments.R;
import com.andridlearning.amit_gupta.fragments.activities.fragments.DynamicFragment1;
import com.andridlearning.amit_gupta.fragments.activities.fragments.DynamicFragment2;
import com.andridlearning.amit_gupta.fragments.activities.fragments.DynamicFragment3;
import com.andridlearning.amit_gupta.fragments.activities.fragments.DynamicFragment4;

public class DynamicFragmentExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment_example);

        if(findViewById(R.id._placeholder1) != null) {
            if (savedInstanceState != null) {
                return;
            }

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(R.id._placeholder1, new DynamicFragment1());
//        ft.commit();
            //ft.replace(R.id._placeholder2, new Fragment2());
            ft.commit();

            Button b = (Button) findViewById(R.id.button4);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder1);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder1, new DynamicFragment2(), "TAG");
                    }else{
                        ft.add(R.id._placeholder1, new DynamicFragment2(), "TAG");
                    }
                    ft.commit();
                }
            });
            Button b7 = (Button) findViewById(R.id.button8);
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder2);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder2, new DynamicFragment2(), "TAG");
                    }else{
                        ft.add(R.id._placeholder2, new DynamicFragment2(), "TAG");
                    }
                    ft.commit();
                }
            });
            Button b1 = (Button) findViewById(R.id.button5);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder1);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder1, new DynamicFragment3(), "TAG");
                    }else{
                        ft.add(R.id._placeholder1, new DynamicFragment3(), "TAG");
                    }
                    ft.commit();
                }
            });
            Button b6 = (Button) findViewById(R.id.button9);
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder2);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder2, new DynamicFragment3(), "TAG");
                    }else{
                        ft.add(R.id._placeholder2, new DynamicFragment3(), "TAG");
                    }
                    ft.commit();
                }
            });

            Button b2 = (Button) findViewById(R.id.button6);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder1);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder1, new DynamicFragment4(), "TAG");
                    }else{
                        ft.add(R.id._placeholder1, new DynamicFragment4(), "TAG");
                    }
                    ft.commit();
                }
            });

            Button b5 = (Button) findViewById(R.id.button10);
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder2);
                    if(fragment != null) {
                        ft.replace(R.id._placeholder2, new DynamicFragment4(), "TAG");
                    }else{
                        ft.add(R.id._placeholder2, new DynamicFragment4(), "TAG");
                    }
                    ft.commit();
                }
            });
            Button b3 = (Button) findViewById(R.id.button7);
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                  Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder1);
                    if(fragment != null) {
                        ft.remove(fragment);
                        ft.commit();
                    }
                }
            });

            Button b4 = (Button) findViewById(R.id.button11);
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    Fragment fragment = getFragmentManager().findFragmentById(R.id._placeholder2);
                    if(fragment != null) {
                        ft.remove(fragment);
                        ft.commit();
                    }
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dynamic_fragment_example, menu);
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
}
