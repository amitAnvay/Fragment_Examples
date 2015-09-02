package com.andridlearning.amit_gupta.fragments.fragmentCommunication;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.andridlearning.amit_gupta.fragments.R;

/**
 * Created by Amit_Gupta on 9/1/15.
 */
public class Fragment1 extends Fragment {

    Fragment1.CommunicationListener  listener;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment1_layout, container);
        textView = (TextView) view.findViewById(R.id.textView2);
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        Button button = (Button) view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  String text  = editText.getText().toString();
                  sendText(text);
            }
        });
        view.setBackgroundColor(Color.GREEN);
        return view;
    }

    public void sendText(String text){
        listener.sendMessage(text);
    }

    public void updateText(String text){
        textView.setText(text);
    }

    public interface CommunicationListener {
        public void sendMessage(String text);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof CommunicationListener && activity != null){
            listener = (CommunicationListener)activity;
        }
    }
}
