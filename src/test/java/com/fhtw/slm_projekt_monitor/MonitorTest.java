package com.fhtw.slm_projekt_monitor;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MonitorTest {

    @InjectMocks Monitor monitor;

    @Mock
    Date date;


    @Test
    void setTest() {
        /*final String testMessage = "test";
        when(monitor.set())
        monitor.set(testMessage);*/

    }

    @Test
    void resetTest() {
    }

    @Test
    void getMonitorMessageTest() {
    }

    @Test
    void getLastUpdateTest() {
    }
}