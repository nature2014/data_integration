/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * Demonstrates a basic Message Endpoint that simply prepends a greeting
 * ("Hello ") to an inbound String payload from a Message. This is a very
 * low-level example, using Message Channels directly for both input and
 * output. Notice that the output channel has a queue sub-element. It is
 * therefore a PollableChannel and its consumers must invoke receive() as
 * demonstrated below.
 * <p/>
 * View the configuration of the channels and the endpoint (a &lt;service-activator/&gt;
 * element) in 'helloWorldDemo.xml' within this same package.
 *
 * @author Mark Fisher
 * @author Oleg Zhurakousky
 */
public class HelloWorldApp {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-integration-helloword-context.xml");
        MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
        PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
        inputChannel.send(new GenericMessage<String>("World"));
        System.out.println("==> HelloWorldDemo: " + outputChannel.receive(0).getPayload());
    }

}
