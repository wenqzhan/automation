package com.steps.orgCustSerachTest;

import com.actions.OpenBrowserAction;
import com.actions.matrix.LoginAction;
import com.driver.$;
import com.pageObject.matrix.orgCust.OrgCustList;
import com.utils.log.LoggerController;
import io.cucumber.java.Before;

public class Hooks extends $ {
    private final static LoggerController log = LoggerController.getLogger(Hooks.class);

    @Before("@Automation")
    public void initialise() {
        OpenBrowserAction.open("chrome");

        LoginAction.login();
        $.get(OrgCustList.matrixOrgCustList);
    }

}


