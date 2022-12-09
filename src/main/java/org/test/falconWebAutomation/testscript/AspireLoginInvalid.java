package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Aspire
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

public class AspireLoginInvalid extends SampleTestSuiteBase {
    private ReportLogService report = new ReportLogServiceImpl(AspireLoginInvalid.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public AspireLoginInvalid(Browser browser) {
        this.browser = browser;}
    public void login(String os, String osVersion, String br, String browserVersion) {
        report.info("Opening browser: " + br);
        browser.openURL(getLocatorValue(filePath, LocatorKeyContainer.INPUT_49), os, osVersion, br, browserVersion);
        report.info("------------Opening Aspire ---------------");
        report.info("Maximizing browser window");
        browser.maximizeWindow();
        browser.getTextField().enterTextField(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_50), "testuser26@atmecs.com");
        browser.getTextField().enterTextField(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_51), "Atmecs@");
        browser.getClick().performClick(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_52));
        boolean alert_message = browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_53))).isDisplayed();

        if (alert_message == true) {
            report.info("valid credentials ");
            browser.getFindFromBrowser().findElementByXpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_50)).clear();
            browser.getTextField().enterTextField(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_50), "testuser26@atmecs.com");
            browser.getTextField().enterTextField(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_51), "Atmecs@123");
            browser.getClick().performClick(LocatorType.XPATH, getLocatorValue(filePath, LocatorKeyContainer.INPUT_52));
            String HomePage_Title = browser.getCurrentPageTitle();
            Verify.verifyString("Dashboard - Aspire HR Portal", HomePage_Title, "Verifying Home_Page Title");
            report.info("Verifying HomePage Title");
        }
    }
}
