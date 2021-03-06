package com.videofragment.videofragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSuma extends Fragment {

    private Callback callBack;
    Button buttonSuma;
    public FragmentSuma() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        callBack = (Callback) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_suma, container, false);
        buttonSuma = (Button) v.findViewById(R.id.buttonSumar);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.onSumar(1);
            }
        });
        return v;
    }
    public interface  Callback {
        public void onSumar(int val);
    }

}
