package com.example.stetson.simplefragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextViewFragment extends Fragment {

    TextView textView;

    @Override
    public void onAttach(Activity activity) {
        Log.i("TextViewFragment.java", "onAttach(...)");
        super.onAttach(activity);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("TextViewFragment.java", "onCreateView(...)");
        View view = inflater.inflate(R.layout.textview_fragment, container, false);

        textView = (TextView) view.findViewById(R.id.fragmentTextView);

        return view;
    }

    public String getText() {
        return textView.getText().toString();
    }

    public void setText(String t) {
        textView.setText(t);
    }
}
