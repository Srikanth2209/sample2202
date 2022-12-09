package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Navigating to my colleague module in Aspire portal
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

public class My_Colleague extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(My_Colleague.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public My_Colleague(Browser browser)
    {
        this.browser = browser;
    }
    public void my_colleague()
    {
        //navigating to my colleague
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_56));
        report.info("Clicking My_Colleague");
        String My_Colleague_Page_Title = browser.getCurrentPageTitle();
        Verify.verifyString("Know your colleague - Aspire HR Portal",My_Colleague_Page_Title," My_Colleague_Page_Title");
        report.info("Verifying My_ColleaguePage Title");

        //......Verifying header elements....//
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
    }
}
