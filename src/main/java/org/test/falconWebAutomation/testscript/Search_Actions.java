package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Verifying  working of search bar 
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

public class Search_Actions extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(Search_Actions.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public Search_Actions(Browser browser)
    {
        this.browser = browser;
    }
    public void search()
    {
        boolean search=browser.getDriver().findElement(By.xpath(getLocatorValue(filePath, LocatorKeyContainer.INPUT_59))).isDisplayed();
        Verify.verifyTrue(search,"Verifying SearchIcon");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_59));
        report.info("performing click on search icon");
        browser.getTextField().enterTextField(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_134),"kareti");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_135));
        String search_text = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_136));
        Verify.verifyString(search_text,"Search Results for \"kareti\" Back","Verifying search content");
        System.out.println(search_text);

        //search  by id
        browser.getFindFromBrowser().findElementByXpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_134)).clear();
        browser.getTextField().enterTextField(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_134),"1931");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_135));
        String search_id = browser.getTextField().readTextByXPath(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_136));
        Verify.verifyString(search_id,"Search Results for \"1931\" Back","Verifying search content");
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_99));
        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath, LocatorKeyContainer.INPUT_105));
        report.info("Logging out");
    }
}
