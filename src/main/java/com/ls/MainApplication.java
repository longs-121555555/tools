package com.ls;

import com.ls.tools.base64.Base64Util;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @date 2021/07/28 11:55
 **/
@SpringBootApplication
@ComponentScan("com.ls.*")
public class MainApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MainApplication.class, args);
        String decoder = Base64Util.decoder("{\"name\":\"admin\",\"pwd\":123456}");
        System.out.println(decoder);
        String encode = Base64Util.encode(decoder);
        System.out.println(encode);
    }
}
