package sendws.service;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

/**
 * Created by limin.llm on 2014/10/26.
 */
public class EchoService implements MessageHandler {
	@Override
	public void handleMessage(Message<?> message) throws MessagingException {
		System.out.println("response:" + message.getHeaders());
		System.out.println(message.getPayload());
	}
}
