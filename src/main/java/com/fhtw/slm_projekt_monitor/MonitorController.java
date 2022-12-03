package com.fhtw.slm_projekt_monitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    private Monitor monitor = new Monitor();

    @GetMapping("/api/message")
    public String getMessage(){
        return monitor.getMtnmessage();
    }

    @GetMapping("/api/message/reset")
    public String reset(){
        return monitor.reset();
    }

    @GetMapping("/api/message/set")
    public String setMessage(@RequestParam(name="m") String mtnMessage){
        return monitor.set(mtnMessage);
    }
}
