package com.fhtw.slm_projekt_monitor;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.fhtw.slm_projekt_monitor.MessageUtil.EVERYTHING_WORKS_AS_EXPECTED_MESSAGE;

@Controller
public class MonitorController {
    private final Monitor monitor = new Monitor();

    @RequestMapping(value = "/api/message", method = RequestMethod.GET)
    @ResponseBody
    public String getMessage(){
        if (monitor.getMonitorMessage() == null || monitor.getMonitorMessage().isEmpty()) {
            return "No message set";
        }

        return monitor.getMonitorMessage();
    }

    @RequestMapping(value = "/api/message/reset", method = RequestMethod.GET)
    @ResponseBody
    public String reset(){
        return monitor.reset();
    }

    @RequestMapping(value = "/api/message/set", method = RequestMethod.GET)
    @ResponseBody
    public String setMessage(@RequestParam(name= "m") String monitorMessage){
        return monitor.set(monitorMessage);
    }

    @RequestMapping(value = "/",  produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String showMonitor() {
        monitor.updateTime();
        if (monitor.getMonitorMessage().equals(EVERYTHING_WORKS_AS_EXPECTED_MESSAGE)) {
            return TextContent.getGreenMonitor(monitor.getMonitorMessage(), monitor.getLastUpdate());
        }
        return TextContent.getRedMonitor(monitor.getMonitorMessage(), monitor.getLastUpdate());
    }
}
