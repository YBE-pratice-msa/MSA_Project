package com.example.service1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Service1Service {

    public String findName(String id) {
        switch (id) {
            case "1":
                return "서비스1 처음";
            case "2":
                return "서비스2 중간";
            default:
                return "서비스3 마지막";
        }

    }
}
