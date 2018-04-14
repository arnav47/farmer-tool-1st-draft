package com.user;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;

public class Find_Seasons 
{
	public static ArrayList<String> getSeason() {

      
        final String KHARIF = "Kharif";
        final String RABI = "Rabi";
      
        final String SUMMER = "Summer";
       
      

        int month =Calendar.getInstance().get(Calendar.MONTH);
    

        ArrayList<String> seasons = new ArrayList<>();

      
        if (month == 0) {
            seasons.add(RABI);
            
        } else if (month == 1) {
            seasons.add(RABI);
           
        } else if (month == 2) {
            seasons.add(KHARIF);
            seasons.add(RABI);
        } else if (month == 3) {
            seasons.add(SUMMER);
        } else if (month == 4) {
            seasons.add(SUMMER);
        } else if (month == 5) {
            seasons.add(SUMMER);
        } else if (month == 6) {
            seasons.add(KHARIF);
        } else if (month == 7) {
            seasons.add(KHARIF);
        } else if (month == 8) {
            seasons.add(KHARIF);
        } else if (month == 9) {
            seasons.add(KHARIF);
            
        } else if (month == 10) {
            seasons.add(RABI);
           
        } else {
           
            seasons.add(RABI);
        }
        return seasons;
    }
	
	
	public static void main(String[] args) 
	{
		
		 
		String[] shortMonths = new DateFormatSymbols().getShortMonths();

		  
		  //getSeason();
		  System.out.println(shortMonths[Calendar.getInstance().get(Calendar.MONTH)+1]);
		
	}
}
