package org.test.falconWebAutomation.testscript;/*
User: srikanth
Description: Calling all methods of my colleague module
*/


import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import org.test.falconWebAutomation.testsuite.SampleTestSuiteBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.test.falconWebAutomation.testscript.AspireLoginInvalid;

public class Run_My_Colleague extends SampleTestSuiteBase
{
    private ReportLogService report = new ReportLogServiceImpl(Run_My_Colleague.class);
    @Test
    @Parameters({ "os", "osVersion", "browser", "browserVersion" })
    public void run()
    {
        AspireLoginInvalid aspireLoginInvalid = new AspireLoginInvalid(browser);
        My_Colleague my_colleague = new My_Colleague(browser);
        Change_Password change_password = new Change_Password(browser);
        My_Colleague_Body_Elements my_colleague_body_elements = new My_Colleague_Body_Elements(browser);
        View_More_In_Emp_profile view_more_in_emp_profile = new View_More_In_Emp_profile(browser);
        Search_Actions search_actions = new Search_Actions(browser);

        aspireLoginInvalid.login( "windows","7","chrome","99");
        my_colleague.my_colleague();
        change_password.change_password();
        my_colleague_body_elements.my_colleague_body_elements();
        view_more_in_emp_profile.employee_details();
        search_actions.search();

    }
}
