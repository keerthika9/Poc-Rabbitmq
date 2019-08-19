package com.stackroute.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
  @Autowired
  private AmqpTemplate amqpTemplate;

  /**
   * @Value injects values into fields
   */
  @Value("${jsa.rabbitmq.exchange}")
  private String exchange;

  @Value("${jsa.rabbitmq.routingkey}")
  private String routingKey;

  public void produceMsg(String msg) {
    amqpTemplate.convertAndSend(exchange, routingKey, msg);
  }

}
