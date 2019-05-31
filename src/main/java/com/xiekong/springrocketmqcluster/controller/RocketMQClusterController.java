package com.xiekong.springrocketmqcluster.controller;

import com.xiekong.springrocketmqcluster.bean.OrderPaidEvent;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author XieKong
 * @date 2019/5/17 12:56
 */
@RestController
@RequestMapping("/rocketmq")
public class RocketMQClusterController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/send")
    public void sendMsg() {
        rocketMQTemplate.convertAndSend("test-topic-1", "Hello, World!");
        rocketMQTemplate.send("test-topic-1", MessageBuilder.withPayload("Hello, World! I'm from spring message").build());
        rocketMQTemplate.convertAndSend("test-topic-2", new OrderPaidEvent("T_001", new BigDecimal("88.00")));
    }
}
