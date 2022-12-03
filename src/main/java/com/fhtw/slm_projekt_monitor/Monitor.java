package com.fhtw.slm_projekt_monitor;

import java.security.Timestamp;
import java.text.SimpleDateFormat;

public class Monitor {
    private String mtnmessage;

    private String lastUpdate;

    public Monitor(){
        this.mtnmessage = "";
    }
    public Monitor(String mtnmessage){
        this.mtnmessage = mtnmessage;
    }

    public String set(String mtnmessage){
        this.mtnmessage = mtnmessage;
        this.lastUpdate = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        return "ok" + "\n" + this.lastUpdate;
    }

    public String reset(){
        this.mtnmessage = "";
        this.lastUpdate = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        return "ok";
    }

    public String getMtnmessage(){
        if(this.mtnmessage.length() == 0){
            return "Everything works as expected";
        }else{
            return this.mtnmessage;
        }
    }
}
