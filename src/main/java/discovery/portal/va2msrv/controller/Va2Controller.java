package discovery.portal.va2msrv.controller;

import discovery.portal.va2msrv.Va2;
import discovery.portal.va2msrv.schemas.Request;
import discovery.portal.va2msrv.schemas.Response;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Va2Controller implements Va2 {

    @Override
    public Response postSend(Request requestbody) throws Exception {
        return null;
    }
}
