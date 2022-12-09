package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: verifying body elements of my colleague module
*/

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.falconWebAutomation.constant.FilePathConstants;
import org.test.falconWebAutomation.constant.LocatorKeyContainer;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import java.util.List;
import static com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler.getLocatorValue;

public class My_Colleague_Body_Elements extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(My_Colleague_Body_Elements.class);
    String filePath = FilePathConstants.ASPIRE;
    Browser browser;
    public My_Colleague_Body_Elements(Browser browser)
    {
        this.browser = browser;
    }
    public void my_colleague_body_elements()
    {
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

        browser.getClick().performClick(LocatorType.XPATH,getLocatorValue(filePath,LocatorKeyContainer.INPUT_58));
        List<WebElement> table_headers = browser.getDriver().findElements(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_137)));
        int column_count = table_headers.size();
        Verify.verifyInteger(column_count,6,"Verifying number of columns");
//        for(int columns=0;columns < table_headers.size();columns++)
//        {
//            WebElement column_names = table_headers.get(columns);
//            String column_headers = column_names.getText();
//            System.out.println(column_headers);
//        }
        List<WebElement> table_data = browser.getDriver().findElements(By.xpath(getLocatorValue(filePath,LocatorKeyContainer.INPUT_138)));
        int row_count = table_data.size();
        Verify.verifyInteger(row_count,1095,"Verifying number of rows");
//        for(int rows=0;rows < table_data.size();rows++) {
//            WebElement column_data = table_data.get(rows);
//            String data = column_data.getText();
//            System.out.println(data);
//        }
        browser.getDriver().navigate().back();
    }
}

