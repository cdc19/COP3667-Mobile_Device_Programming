package com.example.agedatabase;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class InsertFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_insert, container, false);
        return v;

        // Database and UI code goes here in next chapter.

    } // End onCreateView method
} // End InsertFragment class
