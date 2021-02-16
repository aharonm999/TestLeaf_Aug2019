package week9.day1.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AddingImagesToExtentReports {
	
	public static void main(String[] args) {

		//Create HTML file by specifying the path
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		//To maintain the execution report we use setAppendExisting method
		html.setAppendExisting(true);
		//It erases previous execution and shows current execution report
		/*html.setAppendExisting(false);*/
		//Gives permission to HTML file
		ExtentReports extent = new ExtentReports();
		//Without attaching HTML file it does not allow to execute
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("TC001_creatLead", "Crate a new Lead");
		//Assign Author / Tester name and type of Testing Done
		test.assignAuthor("Aharon");
		test.assignCategory("Smoke");
		//inputs
		/*test.pass("demosalesmanager detailes entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png"));
		test.pass("crmssfa entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png"));
		test.pass("Login button is clicked", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png"));*/
		//Without flush code won't work, and flush erase the all memory
		extent.flush();
			
	}

}
