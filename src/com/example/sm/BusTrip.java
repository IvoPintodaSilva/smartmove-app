package com.example.sm;

import java.util.Date;
import java.util.UUID;

import android.location.Location;
import android.text.format.Time;

public class BusTrip {
	
	// Attributes
	private UUID id;
	private int line;
	private int busId;
	private Date entryDate;
	private Date exitDate;
	private Time entryTime;
	private Time exitTime;
	private Location entryLocation;
	private Location exitLocation;
	
	// Constructor
	public BusTrip(int line, int busId, Date entryDate, Time entryTime, Location entryLocation) {
		this.id = UUID.randomUUID();
		this.line = line;
		this.busId = busId;
		this.entryDate = entryDate;
		this.entryTime = entryTime;
		this.entryLocation = entryLocation;
		
		this.exitDate = null;
		this.exitTime = null;
		this.exitLocation = null;
	}
	
	public BusTrip(int line, int busId, Date entryDate, Date exitDate, Time entryTime, Time exitTime, Location entryLocation, Location exitLocation) {
		this.id = UUID.randomUUID();
		this.line = line;
		this.busId = busId;
		this.entryDate = entryDate;
		this.entryTime = entryTime;
		this.entryLocation = entryLocation;		
		this.exitDate = exitDate;
		this.exitTime = exitTime;
		this.exitLocation = exitLocation;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public Time getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Time entryTime) {
		this.entryTime = entryTime;
	}

	public Time getExitTime() {
		return exitTime;
	}

	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}

	public Location getEntryLocation() {
		return entryLocation;
	}

	public void setEntryLocation(Location entryLocation) {
		this.entryLocation = entryLocation;
	}

	public Location getExitLocation() {
		return exitLocation;
	}

	public void setExitLocation(Location exitLocation) {
		this.exitLocation = exitLocation;
	}
}
