package com.bear.control;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.DescriptorKey;

public class ActionControl {
	

//	@DescriptorKey("main")
	public static void main(String[] args) {
	 
	 String date1 =	new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
	 
	 System.out.println(date1);
 
		
	}
	
	
}
