package com.example.sm;


import android.support.v4.app.Fragment;


public class SmartScreenActivity extends SingleFragmentActivity{

	@Override
	protected Fragment createFragment() {
		return new FragmentSmartScreen();
	}
	
}
