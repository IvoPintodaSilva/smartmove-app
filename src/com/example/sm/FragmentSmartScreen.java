package com.example.sm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FragmentSmartScreen extends Fragment{
	private LinearLayout mLayout;
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_smartscreen, container, false);
		
		mLayout = (LinearLayout) view.findViewById(R.id.fragment_smartscreen_layout);
		
		mLayout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), MainActivity.class);
				startActivity(i);
			}
		});
		
		return view;
	}
}
