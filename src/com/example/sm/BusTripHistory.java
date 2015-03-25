package com.example.sm;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.UUID;

public class BusTripHistory {
	
	/*  linked list of the user's bus trip history  */
	private LinkedList<BusTrip> mHistory = new LinkedList<BusTrip>();
	
	/*  method that returns the linked list history  */
	public LinkedList<BusTrip> getHistory(){
		return mHistory;
	} 
	
	/*  method that returns a bus trip by its id  */
	public BusTrip getBusTrip(UUID id){
		ListIterator<BusTrip> busTripIterator = mHistory.listIterator(0);
		
		while(busTripIterator.hasNext()){
			BusTrip current = busTripIterator.next();
			
			if(current.getId().equals(id)){
				return current;
			}
		}
		
		return null;
	}
	
	
	/*  method that returns a bus trip by its position in the list  */
	public BusTrip getBusTrip(int position){
		return mHistory.get(position);
	}
	
	
}
