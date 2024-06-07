package com.siemens.customerapi.configurations;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="siemenshoodhealth")
public class SiemensHoodHealthIndicator {
    @ReadOperation
    @Bean
    public String message(){
        return "Message from Hood";
    }
}
