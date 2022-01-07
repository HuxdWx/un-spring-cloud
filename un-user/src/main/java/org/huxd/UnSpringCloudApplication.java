package org.huxd;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/7 15:21
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huxd
 * @version 1.0
 * @description: TODO
 * @date 2022/1/6 15:35
 */
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class UnSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(UnSpringCloudApplication.class, args);
    }
}
