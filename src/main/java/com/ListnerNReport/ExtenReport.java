package com.ListnerNReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtenReport {

	
		static ExtentReports reports;
		static ExtentTest logger;
	public static void main(String[] args) {
			
		
		String spath = System.getProperty("user.dir")+"//ExtentReport//Report.html";
		reports = new ExtentReports(spath);
		
		}
	

}
