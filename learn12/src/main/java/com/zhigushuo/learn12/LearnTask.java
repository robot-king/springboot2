package com.zhigushuo.learn12;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class LearnTask {


    // 每一秒执行一次
    @Scheduled(fixedRate = 1000)
    public void firstJob() throws IOException {

        String currentTime = String.valueOf(new Date().getTime());
        System.out.println("firstJob 每1秒执行一次:" + currentTime);
    }

    @Async
    @Scheduled(cron = "0/1 * * * * *")
    public void scheduled1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("scheduled1 每1秒执行一次：{" + LocalDateTime.now() + "}");
    }


}
