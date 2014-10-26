package sendws;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.core.DestinationResolver;

public class SendWebService {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-integration-ws-context.xml");
        DestinationResolver<MessageChannel> channelResolver = new BeanFactoryChannelResolver(context);

        // Compose the XML message according to the server's schema
        String requestXml = "<echoRequest xmlns=\"http://www.cyznj.com/echo\">\n" +
                "peter" +
                "</echoRequest>";

        // Create the Message object
        Message<String> message = MessageBuilder.withPayload(requestXml).build();

        // Send the Message to the handler's input channel
        MessageChannel channel = channelResolver.resolveDestination("echo");
        channel.send(message);
    }

}
