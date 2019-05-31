package com.xiekong.springrocketmqcluster.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author XieKong
 * @date 2019/5/31 18:00
 */
@Data
@AllArgsConstructor
public class OrderPaidEvent implements Serializable {
    private String orderId;

    private BigDecimal paidMoney;
}