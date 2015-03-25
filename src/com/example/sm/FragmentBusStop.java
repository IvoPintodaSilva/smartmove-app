package com.example.sm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentBusStop extends Fragment {
	private Button botaum;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_bus_stop, container, false);
			
		botaum = (Button) view.findViewById(R.id.bus_stop_button);
		botaum.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), NearestBusStopActivity.class);
				startActivity(i);				
			}
			
			
		});
		
		return view;
	}
}
