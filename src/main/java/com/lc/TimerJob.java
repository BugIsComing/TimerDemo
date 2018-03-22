package com.lc;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @Author:LC
 * @Date:Created in 21:53 2018/3/22
 * @Modifyed by:
 */

/**
 * 必须有类注解service、component、controller等
 * @author LC
 */
@Service
public class TimerJob {
    public TimerJob() {

    }

    /**
     * 每5秒执行一次
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void run() {
        System.out.println(System.currentTimeMillis());
    }
}
