package com.lcw.business;

/**
 * Action Logic Process
 */
public class TestAction {
    TestDAO testDAO = new TestDAO();

    public boolean login(String ctx) {
        return testDAO.isExist(ctx);
    }

}
