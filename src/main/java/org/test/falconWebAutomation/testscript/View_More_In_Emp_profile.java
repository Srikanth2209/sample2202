package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Verifying view_more  or more details of  employee 
*/

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import org.openqa.selenium.By;
import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;

public class View_More_In_Emp_profile extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(View_More_In_Emp_profile.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public View_More_In_Emp_profile(Browser browser)
    {
        this.browser = browser;
    }
    public void employee_details()
    {
        //view more-->About me
        boolean view_more = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_86))).isDisplayed();
        Verify.verifyBoolean(view_more,true,"verifying view more link " );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_86));
        report.info("Clicking view more");
        boolean profile_pic = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_116))).isDisplayed();
        Verify.verifyBoolean(profile_pic,true,"verifying profile pic " );
        boolean emp_details_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_117))).isDisplayed();
        Verify.verifyBoolean(emp_details_field,true,"verifying employee details field " );
        boolean experience_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_118))).isDisplayed();
        Verify.verifyBoolean(experience_field,true,"verifying experience_field" );
        boolean current_project_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_119))).isDisplayed();
        Verify.verifyBoolean(experience_field,true,"verifying Current_project_field" );
        boolean skills_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_120))).isDisplayed();
        Verify.verifyBoolean(skills_field,true,"verifying skills_field" );
        boolean certifications_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_121))).isDisplayed();
        Verify.verifyBoolean(certifications_field,true,"verifying certifications_field" );
        boolean about_me_field = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_122))).isDisplayed();
        Verify.verifyBoolean(about_me_field,true,"verifying about_me_field" );

        //view more--->project  history
        boolean project_History = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_126))).isDisplayed();
        Verify.verifyBoolean(project_History,true,"verifying about_me_field" );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_126));
        boolean timeline_badge = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_127))).isDisplayed();
        Verify.verifyBoolean(timeline_badge,true,"verifying timeline_badge" );
        boolean date_info = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_128))).isDisplayed();
        Verify.verifyBoolean(date_info,true,"verifying date_info" );
        boolean timeline_panel = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_129))).isDisplayed();
        Verify.verifyBoolean(timeline_panel,true,"verifying timeline_panel" );

        //view more--->Team
        boolean team = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_131))).isDisplayed();
        Verify.verifyBoolean(team,true,"verifying Team" );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_131));
        boolean team_member_heading = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_132))).isDisplayed();
        Verify.verifyBoolean(team_member_heading,true,"verifying Team_member_header" );
        boolean back_to_list = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_133))).isDisplayed();
        Verify.verifyBoolean(back_to_list,true,"verifying back_to_list" );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_133));
        String My_Colleague_Page_Title = browser.getCurrentPageTitle();
        Verify.verifyString("Know your colleague - Aspire HR Portal",My_Colleague_Page_Title," My_Colleague_Page_Title");
        report.info("Verifying My_ColleaguePage Title");
    }
}
