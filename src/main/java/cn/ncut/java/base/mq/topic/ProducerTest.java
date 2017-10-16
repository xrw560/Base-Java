package cn.ncut.java.base.mq.topic;

import javax.jms.JMSException;
import java.util.Random;


public class ProducerTest {

    public static void main(String[] args) throws JMSException, Exception {
        ProducerTool producer = new ProducerTool();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {

            Thread.sleep(random.nextInt(10) * 1000);

            producer.produceMessage("Hello, world!--" + i);
            producer.close();
        }

    }
}      

