package com.interview.nyc;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandle {
	// How to handle the multiple windows?
	public static void getWindowHandles() {
		  WebDriver driver = null;
		String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator(); 
	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                    driver.switchTo().window(ChildWindow);
	                    driver.close();
	                    System.out.println("Child window closed");
	                 }	      
	        }        
	        //  Switch back to the main window which is the parent window.
	        driver.switchTo().window(mainWindowHandle);
	      
	}
	// How to handle the alert box/window/ pop up window 
		public static void getAlert() {
	        WebDriver driver = null;
			// Switching to Alert        
	        Alert alert = driver.switchTo().alert();		
	        		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        		
	        // Accepting alert		
	        alert.accept();		
	    }
		// How to handle the iframe? 
		public static void getIframe() {
			WebDriver driver = null;
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		}
}
