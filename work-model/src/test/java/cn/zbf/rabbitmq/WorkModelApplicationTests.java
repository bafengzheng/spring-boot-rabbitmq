package cn.zbf.rabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WorkModelApplicationTests {
    @Autowired
    MsgProducer msgProducer;
    @Test
    void contextLoads() {
        for (int i = 0; i < 50; i++) {
            msgProducer.sendMsg("第"+i+"个消息");
        }
    }

}
