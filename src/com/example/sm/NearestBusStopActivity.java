package com.example.sm;


import android.support.v4.app.Fragment;



public class NearestBusStopActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new FragmentNearestBusStop();
	}	

}
