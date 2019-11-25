package cn.zbf.rabbitmq;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {

    @Autowired
    MsgProducer msgProducer;
    @Test
    void contextLoads()throws Exception {
        for(int i=0;i<50;i++){
            msgProducer.sendMsg("这是第"+i+"个消息");
            Thread.sleep(200);
        }
    }


}
