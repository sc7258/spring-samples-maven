package com.example.scheduler.domain.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Slf4j
@Component
public class CronScheduler {
    @Scheduled(cron = "0 0/1 * * * ?") // 매분 0초마다 실행
    public void scheduleTask() {
        System.out.println("Cron task executed at: " + System.currentTimeMillis());

        RestClient restClient = RestClient.create();

        String response = restClient.get()
                .uri("https://jsonplaceholder.typicode.com/posts/1")
                .retrieve()
                .body(String.class);

        System.out.println(response);
    }
}
