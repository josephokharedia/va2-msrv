package discovery.portal.va2msrv.controller;

import discovery.portal.va2msrv.Va2service;
import discovery.portal.va2msrv.schemas.Message;
import discovery.portal.va2msrv.schemas.MessageType;
import discovery.portal.va2msrv.schemas.Request;
import discovery.portal.va2msrv.schemas.Response;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class Va2Controller implements Va2service {

    @Override
    public Response postSend(Request request) throws Exception {
        Message userMessage =
                createTextMessage(Collections.singletonList(request.getText()), true);

        Message vaMessage =
                createTextMessage(Arrays.asList("Hi", "How can I help you today"), false);

        Response response = new Response();
        response.setMessages(Arrays.asList(userMessage, vaMessage));
        return response;
    }

    private Message createTextMessage(List<String> messages, boolean isUser) {
        Message message = new Message();
        message.setType(MessageType.TEXT);
        message.setContent(messages);
        message.setIsUser(isUser);
        return message;
    }
}
