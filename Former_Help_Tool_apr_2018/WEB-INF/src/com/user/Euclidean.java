/**
 * 
 */
package com.user;

/**
 * @author bharath
 *
 
* The Euclidean distance in 2 dimension between two points (x1, y1) and (x2, y2
		 *
		 * java Euclidean 2.1 1 5 10.5
		 * Distance = 9.932774033471214
		 *
		 * slightly modified by sbaraty on 10/15/2011  
		 ****************************************************************/

		public class Euclidean
		{

		    public static double find(double latt,double lang,double lat1,double lang1)
		    {
		    	double earthRadius = 6371000; //meters
		        double dLat = Math.toRadians(lat1-latt);
		        double dLng = Math.toRadians(lang1-lang);
		        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		                   Math.cos(Math.toRadians(latt)) * Math.cos(Math.toRadians(lat1)) *
		                   Math.sin(dLng/2) * Math.sin(dLng/2);
		        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		        float dist = (float) (earthRadius * c);

		        return dist;  

		    }
		    
		    public static double distFrom(double lat1, double lng1, double lat2, double lng2) {
		        double earthRadius = 6371000; //meters
		        double dLat = Math.toRadians(lat2-lat1);
		        double dLng = Math.toRadians(lng2-lng1);
		        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
		                   Math.sin(dLng/2) * Math.sin(dLng/2);
		        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		        float dist = (float) (earthRadius * c);

		        return dist;
		        }
		    
		    public static void main(String[] args) 
		    {
		    	double d_lat=12.9248051297903;
		    	double d_lang=77.5930111386657;
		    	
		    	double c_lat=12.923278400916928;
		    	double c_lang=77.59573626302482;
				double outp=find(d_lat,d_lang,c_lat,c_lang);
				System.out.println(outp);
				double op=distFrom(d_lat,d_lang,c_lat,c_lang);
				System.out.println(op);
			}

		}
