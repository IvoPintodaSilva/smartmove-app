package com.example.sm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	/*  gets fragment by the selected tab  */
	@Override
	public Fragment getItem(int index) {
		switch(index){
		case 0:
			return new FragmentBusStop();
		case 1:
			return new FragmentTimetable();
		}
		return null;
	}

	/*  number of tabs  */
	@Override
	public int getCount() {
		return 2;
	}

}
