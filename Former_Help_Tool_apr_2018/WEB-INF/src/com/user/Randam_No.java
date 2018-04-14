/**
 * 
 */
package com.user;

import java.util.Random;

/**
 * @author bharath
 *
 */
public class Randam_No 
{
public static String genarate_Random () {
	Random rand = new Random();

	String no = new Integer(rand.nextInt(12345)).toString();
	
	System.out.println(no);
	return no;
}
}
