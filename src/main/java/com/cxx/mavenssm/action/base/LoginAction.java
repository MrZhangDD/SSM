package com.cxx.mavenssm.action.base;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "login";
    }
}
