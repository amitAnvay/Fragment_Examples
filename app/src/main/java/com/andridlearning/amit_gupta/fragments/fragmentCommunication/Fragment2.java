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
public class Fragment2 extends Fragment {

    CommunicationListener listener;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment2_layout, container);

        textView = (TextView) view.findViewById(R.id.textView2);
        final EditText editText = (EditText)view.findViewById(R.id.editText);
        Button button = (Button) view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text  = editText.getText().toString();
                sendText2(text);

            }
        });
        view.setBackgroundColor(Color.YELLOW);
        return view;
    }

    public void sendText2(String text){
       listener.sendMessage2(text);
    }

    public void updateText(String text){
        textView.setText(text);
    }

    public interface  CommunicationListener {
        public void sendMessage2(String msg);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof Fragment2.CommunicationListener && activity != null){
            listener = (CommunicationListener) activity;
        }
    }
}
