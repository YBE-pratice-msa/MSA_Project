package com.example.service1.Controller;

import com.example.service1.Service.Service1Service;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("v1/service1")
@AllArgsConstructor
@RestController
public class Service1Controller {

    @Autowired
    private Service1Service service1Service;

    @GetMapping(value = "/services")
    public List<String> services() {
        return service1Service.getServices();
    }

}
