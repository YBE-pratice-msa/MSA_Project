package com.example.service2.Service;

import org.springframework.stereotype.Service;

@Service
public class Service2Service {

    public String findName(String id) {
        switch (id) {
            case "1":
                return "서비스2 시작";
            case "2":
                return "서비스2 중간";
            default:
                return "서비스2 마지막";
        }
    }
}
