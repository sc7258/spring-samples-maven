package com.example.scheduler.domain.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayScheduler {

    @Scheduled(fixedDelay = 5000) // 이전 실행이 끝난 후 5초 뒤에 실행
    public void scheduleTask() {
        System.out.println("Fixed delay task executed at: " + System.currentTimeMillis());
    }
}