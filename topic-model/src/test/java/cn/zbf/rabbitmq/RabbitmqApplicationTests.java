package cn.zbf.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {
    @Autowired
    MsgProducer msgProducer;
    @Test
    void contextLoads() throws Exception{
        for (int i = 0; i < 10; i++) {
            msgProducer.sendMsg("第"+i+"个消息");
            Thread.sleep(500);
        }
    }

}
