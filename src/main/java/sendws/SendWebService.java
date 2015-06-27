package sendws;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.core.DestinationResolver;

public class SendWebService {

	public static void main(String[] args) {
		final AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-integration-ws-context.xml");
		DestinationResolver<MessageChannel> channelResolver = new BeanFactoryChannelResolver(context);

		// Compose the XML message according to the server's schema
		String requestXml = "<getPatientByIdentityRequest xmlns=\"http://www.cyznj.com/patients\"><identity>320106700320243102</identity></getPatientByIdentityRequest>";

		// Create the Message object
		Message<String> message = MessageBuilder.withPayload(requestXml).setHeader("contextId", "pli2015").build();
		System.out.println("request:" + message.getHeaders());

		// Send the Message to the handler's input channel
		MessageChannel inputchannel = channelResolver.resolveDestination("inputchannel");
		inputchannel.send(message);
		context.close();
	}

}
