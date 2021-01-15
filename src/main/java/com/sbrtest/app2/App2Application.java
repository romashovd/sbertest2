package com.sbrtest.app2;

import com.sbrtest.app2.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

//@EnableRetry
@EnableCaching
//@EnableHystrix
@SpringBootApplication
public class App2Application {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(App2Application.class, args);
        /*MessageService siteService = ctx.getBean(MessageService.class);
        System.out.println("RecivedMessages:");
        siteService.findAllRecivedMessage().forEach(site -> System.out.println(site.getBody()));
        siteService.findAllRecivedMessage().forEach(site -> System.out.println(site.getName()));
        siteService.findAllRecivedMessage().forEach(site -> System.out.println(site.getSecondName()));
        siteService.findAllRecivedMessage().forEach(site -> System.out.println(site.getSecondName()));*/

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy kk:mm:ss");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));


        Thread.sleep(5000);
    }

}

