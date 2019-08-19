package com.stackroute.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
  @RabbitListener(queues="${jsa.rabbitmq.queue}")
  public void receivedMessage(String msg) {
    System.out.println("Received Message: " + msg);
  }
}
