package com.example.dell.slider;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class pagefragment extends Fragment {
TextView textView;

    public pagefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.page_fragment_layout, container, false);
        textView=(TextView)view.findViewById(R.id.textView);
        Bundle bundle=getArguments();
        int pagescount=bundle.getInt("count1");
        String Messege=bundle.getString("count");
        textView.setText(Messege);









        return view;
    }

}
