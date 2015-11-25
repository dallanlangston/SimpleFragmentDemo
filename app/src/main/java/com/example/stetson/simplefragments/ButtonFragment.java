package com.example.stetson.simplefragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonFragment extends Fragment {

    ButtonFragmentInterface buttonFragmentInterface;

    public interface ButtonFragmentInterface {
        public void updateText(String t);
    }

    @Override
    public void onAttach(Activity activity) {
        Log.i("ButtonFragment.java", "onAttach(...)");
        super.onAttach(activity);

        buttonFragmentInterface = (ButtonFragmentInterface) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("ButtonFragment.java", "onCreateView(...)");
        View view = inflater.inflate(R.layout.button_fragment, container, false);
        Button button = (Button) view.findViewById(R.id.fragmentButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonFragmentInterface.updateText("Updated");
            }
        });
        return view;
    }
}
