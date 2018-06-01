package cn.fay.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * Created by fay on 2018/1/8.
 */
public class Test {
    private static final String EXCHANGE_NAME = "fay-exchange";
    private static final String SEND_QUEUE_NAME = "fay-Test";
    private static final String THIS_QUEUE_NAME = "java-command";
    private static final String SEND_ROUTING_KEY = "just-routing2python";
    private static final String THIS_ROUTING_KEY = "just-routing2java";
    private static final String VIRTUAL_HOST = "aliyun1";
    private static final String HOST = "www.bestfay.top";
    private static final String USER_NAME = "admin";
    private static final String PASSWORD = "admin";
    private static final int PORT = 5672;

    public static void main(String[] args) throws IOException, TimeoutException {
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("i am out")));


        ConnectionFactory factory = new ConnectionFactory();
        factory.setVirtualHost(VIRTUAL_HOST);
        factory.setHost(HOST);
        factory.setUsername(USER_NAME);
        factory.setPassword(PASSWORD);
        factory.setPort(PORT);
        Connection conn = factory.newConnection();
        Channel channel = conn.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);
        Map<String, Object> params = new HashMap<>();
        channel.queueDeclare(THIS_QUEUE_NAME, true, false, false, params);
        channel.queueBind(THIS_QUEUE_NAME, EXCHANGE_NAME, THIS_ROUTING_KEY);

        send(channel, "this is a test message from java.");

        channel.basicConsume(THIS_QUEUE_NAME, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println(envelope.getRoutingKey() + ":" + new String(body, "utf-8"));
            }
        });

        Scanner scanner = new Scanner(System.in);
        String msg;
        while ((msg = scanner.nextLine()) != null) {
            if ("over".equals(msg)) {
                System.exit(0);
            }
            send(channel, msg);
        }
    }

    private static void send(Channel channel, String msg) {
        try {
            channel.basicPublish(EXCHANGE_NAME, SEND_ROUTING_KEY, null, msg.getBytes());
            System.out.println("send something...2" + SEND_ROUTING_KEY);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

