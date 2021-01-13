package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestConfigServerController {

    @Value("${azure.spring.cloud.config-server.health:DOWN}")
    private String configServerHealth;

    @RequestMapping("/config-server/health")
    public String configServerHealth() {
        log.info("Test config server: " + configServerHealth);
        return configServerHealth;
    }
}
