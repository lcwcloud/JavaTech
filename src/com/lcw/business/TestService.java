package com.lcw.business;

/**
 * Service for Providing
 */
public class TestService {
    TestAction testAction = new TestAction();

    public String login(String ctx) {
        if(testAction.login(ctx)) {
            return "success";
        } else {
            return "failure";
        }
    }
}
