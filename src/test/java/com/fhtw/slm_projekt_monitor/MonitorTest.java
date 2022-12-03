package com.fhtw.slm_projekt_monitor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.fhtw.slm_projekt_monitor.MessageUtil.EVERYTHING_WORKS_AS_EXPECTED_MESSAGE;
import static com.fhtw.slm_projekt_monitor.MessageUtil.OK_MESSAGE;

class MonitorTest {

    @Test
    void setTest() {
        final String testMessage = "test";
        final Monitor monitor = new Monitor();

        Assertions.assertTrue(monitor.set(testMessage).contains(OK_MESSAGE));
    }

    @Test
    void resetTest() {
        final Monitor monitor = new Monitor();

        Assertions.assertEquals(OK_MESSAGE, monitor.reset());
        Assertions.assertEquals(EVERYTHING_WORKS_AS_EXPECTED_MESSAGE, monitor.getMonitorMessage());
    }

    @Test
    void getMonitorMessageTest_ReturnsDefaultMessage() {
        Monitor monitor = new Monitor();

        Assertions.assertEquals(EVERYTHING_WORKS_AS_EXPECTED_MESSAGE, monitor.getMonitorMessage());
    }

    @Test
    void getMonitorMessageTest_ReturnsSetMessage() {
        final String testMessage = "ALARM MESSAGE";
        Monitor monitor = new Monitor();
        monitor.set(testMessage);

        Assertions.assertEquals(testMessage, monitor.getMonitorMessage());
    }
}