package com.example.demo.Schedulling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TaskScheduling {

    Logger logger =  LoggerFactory.getLogger(TaskScheduling.class);

    @Scheduled(cron = "0 0/1 * * * *")
    public void reportCurrentTime() {
       logger.info("hello");

    }
}
