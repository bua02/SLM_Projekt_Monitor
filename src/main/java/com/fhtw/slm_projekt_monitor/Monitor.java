package com.fhtw.slm_projekt_monitor;

import java.text.SimpleDateFormat;

public class Monitor {
    private static final String EVERYTHING_WORKS_AS_EXPECTED_MESSAGE = "Everything works as expected";
    private static final String OK_MESSAGE = "ok";

    private String monitorMessage;
    private String lastUpdate;

    public Monitor() {
        this.monitorMessage = "";
    }

    public Monitor(String monitorMessage) {
        this.monitorMessage = monitorMessage;
    }

    public String set(String monitorMessage) {

        this.monitorMessage = monitorMessage;
        this.lastUpdate = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());

        return OK_MESSAGE + "\n" + this.lastUpdate;
    }

    public String reset() {

        this.monitorMessage = "";
        this.lastUpdate = new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());

        return OK_MESSAGE;
    }

    public String getMonitorMessage() {

        if (this.monitorMessage.length() == 0) {
            return EVERYTHING_WORKS_AS_EXPECTED_MESSAGE;
        }

        return this.monitorMessage;
    }
}
