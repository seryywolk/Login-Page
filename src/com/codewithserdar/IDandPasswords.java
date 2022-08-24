package com.codewithserdar;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Serdar","pizzaman");
        logininfo.put("Pizzaman","PASSWORD");
        logininfo.put("Moon","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
