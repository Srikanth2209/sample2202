package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Practice
*/

import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;

public class AspireLogin extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(AspireLogin.class);
    String filePath = FilePathConstants.ASPIRE;
    @Test
    @Parameters({ "os", "osVersion", "browser", "browserVersion" })
    public void aspire(String os, String osVersion, String br, String browserVersion)
    {
        report.info("Opening browser: " + br);
        browser.openURL(getLocatorValue(filePath, LocatorKeyContainer.INPUT_49), os, osVersion, br, browserVersion);
        report.info("------------Opening Aspire ---------------");
        report.info("Maximizing browser window");
        browser.maximizeWindow();

        //Login
        browser.getTextField().enterTextField(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_50),"testuser26@atmecs.com");
        report.info("Entering Email");
        browser.getTextField().enterTextField(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_51),"Atmecs@123");
        report.info("Entering Password");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_52));
        report.info("Clicking Login");
        String HomePage_Title = browser.getCurrentPageTitle();
        Verify.verifyString("Dashboard - Aspire HR Portal",HomePage_Title,"Verifying Home_Page Title");
        report.info("Verifying HomePage Title");


        //navigating to My_Colleague
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_56));
        report.info("Clicking My_Colleague");
        String My_Colleague_Page_Title = browser.getCurrentPageTitle();
        Verify.verifyString("Know your colleague - Aspire HR Portal",My_Colleague_Page_Title," My_Colleague_Page_Title");
        report.info("Verifying My_ColleaguePage Title");

        //......header....//
        boolean aspire_logo = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_95))).isDisplayed();
        Verify.verifyTrue(aspire_logo,"Verifying aspire logo");
        boolean emergency_contacts = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_96))).isDisplayed();
        Verify.verifyTrue(emergency_contacts,"Verifying Emergency_contacts");
        boolean contact_number = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_97))).isDisplayed();
        Verify.verifyTrue(contact_number,"Verifying Contact_number");
        String contact_num = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_97));
        Verify.verifyString("+91 40 6768 1210",contact_num,"Contact_number");
        boolean hr_email = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_98))).isDisplayed();
        Verify.verifyTrue(hr_email,"Verifying hr_email");
        String Hr_email = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_98));
        Verify.verifyString("hr.hyd@atmecs.com",Hr_email,"HR_Email_Id");
        boolean profile = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_99))).isDisplayed();
        Verify.verifyTrue(profile,"Verifying profile icon");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_99));
        report.info("Clicking on profile icon ");
        boolean my_profile_icon = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_100))).isDisplayed();
        Verify.verifyTrue(my_profile_icon,"Verifying my_profile_icon");
        boolean my_profile = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_101))).isDisplayed();
        Verify.verifyTrue(my_profile,"Verifying my_profile");
        boolean Logout_icon = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_104))).isDisplayed();
        Verify.verifyTrue(Logout_icon,"Verifying Logout_icon");
        boolean Logout = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_105))).isDisplayed();
        Verify.verifyTrue(Logout,"Verifying Logout");
        boolean atmecs_logo = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_106))).isDisplayed();
        Verify.verifyTrue(atmecs_logo,"Verifying Logout");

        //change password
        boolean change_password_icon = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_102))).isDisplayed();
        Verify.verifyTrue(change_password_icon,"Verifying change_password_icon");
        boolean change_password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_103))).isDisplayed();
        Verify.verifyTrue(change_password,"Verifying change_password");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_103));
        boolean update_Password_header = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_111))).isDisplayed();
        Verify.verifyTrue(update_Password_header,"Verifying update_Password_header");
        boolean old_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_112))).isDisplayed();
        Verify.verifyTrue(old_Password,"Verifying old_Password");
        boolean new_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_113))).isDisplayed();
        Verify.verifyTrue(new_Password,"Verifying new_Password");
        boolean conform_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_114))).isDisplayed();
        Verify.verifyTrue(conform_Password,"Verifying conform_Password");
        boolean reset_Password = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_115))).isDisplayed();
        Verify.verifyTrue(reset_Password,"Verifying reset_Password");
        browser.getNavigate().back();

        // checking grid view, list view, search icon buttons
        boolean grid_View=browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_57))).isDisplayed();
        Verify.verifyTrue(grid_View,"Verifying Grid_View Button");
        report.info("verifying Grid View Button");
        boolean list_View=browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_58))).isDisplayed();
        Verify.verifyTrue(list_View,"Verifying List_View Button");
        report.info("verifying List View Button");
        boolean searchIcon=browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_59))).isDisplayed();
        Verify.verifyTrue(searchIcon,"Verifying SearchIcon");
        report.info("verifying SearchIcon Button");

        //checking emp details showing or not
        boolean emp1_name = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_80))).isDisplayed();
        Verify.verifyBoolean(emp1_name,true,"Verifying Emp Name" );
        boolean emp1_id = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_81))).isDisplayed();
        Verify.verifyBoolean(emp1_id,true,"Verifying Emp Id" );
        boolean emp1_email = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_82))).isDisplayed();
        Verify.verifyBoolean(emp1_email,true,"Verifying Emp Email" );
        boolean emp1_designation = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_83))).isDisplayed();
        Verify.verifyBoolean(emp1_designation,true,"Verifying Emp designation" );
        boolean emp1_project = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_84))).isDisplayed();
        Verify.verifyBoolean(emp1_project,true,"Verifying Emp project" );
        boolean emp1_reporting_to = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_85))).isDisplayed();
        Verify.verifyBoolean(emp1_reporting_to,true,"Verifying Emp Reporting to " );


        //moving to next page and verifying
        boolean next = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_66))).isDisplayed();
        Verify.verifyBoolean(next,true,"Verifying next button " );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_66));
        report.info("Next button checked and clicked");
        boolean second_page_first_name = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_68))).isDisplayed();
        Verify.verifyBoolean(second_page_first_name,true,"verifying first emp name of second page " );
        String sec_name = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_68));
        Verify.verifyString("Chidananda H S",sec_name,"verifying second page name");
        report.info("verifying navigation to next page");

        //moving to previous page and verifying
        boolean previous = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_67))).isDisplayed();
        Verify.verifyBoolean(previous,true,"verifying previous button " );
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_67));
        report.info("Previous button checked and clicked");
        String first_page_first_name = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_69));
        Verify.verifyString("Yohendra Raja Rasu",first_page_first_name,"verifying second page name");
        report.info("verifying navigation to previous page");

        //view more-->About me
        boolean view_more = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_86))).isDisplayed();
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
        Verify.verifyString("Know your colleague - Aspire HR Portal",My_Colleague_Page_Title," My_Colleague_Page_Title");
        report.info("Verifying My_ColleaguePage Title");

        //search actions
        //search by name
        boolean search=browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_59))).isDisplayed();
        Verify.verifyTrue(search,"Verifying SearchIcon");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_59));
        report.info("performing click on search icon");
        browser.getTextField().enterTextField(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_134),"kareti");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_135));
        String search_text = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_136));
        Verify.verifyString(search_text,"Search Results for \"kareti\"","Verifying search content");
        System.out.println(search_text);

        //search  by id
        browser.getFindFromBrowser().findElementByXpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_134)).clear();
        browser.getTextField().enterTextField(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_134),"1931");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_135));
        String search_id = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_136));
        Verify.verifyString(search_id,"Search Results for \"1931\"","Verifying search content");
        System.out.println(search_id);


    }
}


//browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_54));
//browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_55));