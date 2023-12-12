package com.example.service2.Controller;

import com.example.service2.Service.Service2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequestMapping("v1/service2")
public class Service2Controller {

    Service2Service service2Service;

    @GetMapping("/find2")
    public String findName(@RequestParam String id) {
       return service2Service.findName(id);
    }
}
