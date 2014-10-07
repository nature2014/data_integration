package ws;
import org.springframework.integration.xml.source.DomSourceFactory;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

public class SimpleEchoResponder {

	public Source issueResponse(DOMSource request) {
		return new DomSourceFactory().createSource(
				"<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">" +
				request.getNode().getTextContent() + "</echoResponse>");
	}
}
