package com.fhtw.slm_projekt_monitor;

import java.text.SimpleDateFormat;

import static com.fhtw.slm_projekt_monitor.MessageUtil.EVERYTHING_WORKS_AS_EXPECTED_MESSAGE;
import static com.fhtw.slm_projekt_monitor.MessageUtil.OK_MESSAGE;

public class Monitor {

    private String monitorMessage;
    private String lastUpdate = getCurrentTime();

    public Monitor() {
        this.monitorMessage = "";
    }

    public Monitor(String monitorMessage) {
        this.monitorMessage = monitorMessage;
    }

    public String set(String monitorMessage) {

        this.monitorMessage = monitorMessage;
        this.lastUpdate = getCurrentTime();

        return OK_MESSAGE + "\n" + this.lastUpdate;
    }

    public String reset() {

        this.monitorMessage = "";
        this.lastUpdate = getCurrentTime();

        return OK_MESSAGE;
    }

    public String getCurrentTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
    }

    public String getMonitorMessage() {

        if (this.monitorMessage.length() == 0) {
            return EVERYTHING_WORKS_AS_EXPECTED_MESSAGE;
        }

        return this.monitorMessage;
    }

    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public void updateTime() {
        lastUpdate = getCurrentTime();
    }
}
