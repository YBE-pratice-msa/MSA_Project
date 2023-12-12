package com.example.service1.Controller;

import com.example.service1.Service.Service1Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequestMapping("v1/service1")
@AllArgsConstructor
public class Service1Controller {

    Service1Service service1Service;

    @GetMapping("/find")
    public String findName(@RequestParam String id) {
        return service1Service.findName(id);
    }




}
