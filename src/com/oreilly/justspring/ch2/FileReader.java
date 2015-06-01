package com.oreilly.justspring.ch2;

import java.util.ArrayList;
import java.util.List;

import com.oreilly.justspring.ch1.IReader;

public class FileReader implements IReader{
	
	private List<Location> locations = null;
	 // This method is called give us opportuniting to custom initialize
	 public void init(){
		 System.out.println("This is init");
	 locations = new ArrayList<Location>();
	 }

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void cleanUp(){
		 System.out.println("This is destroy");
		 locations = null;
		 }

	
}
