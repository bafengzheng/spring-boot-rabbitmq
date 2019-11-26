package cn.zbf.rabbitmq;

import cn.zbf.rabbitmq.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.QUEUE_C)
public class MsgCustomerC {
    @RabbitHandler
    public void process(String content) {
        System.out.println("接收处理队列C当中的消息： " + content);
    }
}
