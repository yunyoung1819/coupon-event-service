package com.zero.couponconsumer;

import com.zero.couponcore.CouponCoreConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(CouponCoreConfiguration.class)
@SpringBootApplication
public class CouponConsumerApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-core,application-consumer");
        SpringApplication.run(CouponConsumerApplication.class, args);
    }
}
