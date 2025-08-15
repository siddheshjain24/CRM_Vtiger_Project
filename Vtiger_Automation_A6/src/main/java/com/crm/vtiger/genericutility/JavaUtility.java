package com.crm.vtiger.genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * 
 * @author Abhijith
 *
 */
public class JavaUtility {
	/**
	 * This method will return current system date and time in string format
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will return random number within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
