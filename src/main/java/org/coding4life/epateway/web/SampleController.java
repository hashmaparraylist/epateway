package org.coding4life.epateway.web;

import org.apache.log4j.Logger;
import org.coding4life.epateway.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SampleController {

    @Value("${server.port}")
    private int serverPort;

    @Autowired
    private SampleService helloService;

    private static Logger logger = Logger.getLogger(SampleController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        logger.debug(helloService.getMessage());
        return "hello, world";
    }

    @RequestMapping(value = "/json", method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String readJson(@RequestBody Map<String, Object> entity) {
        logger.debug(entity.get("out_trade_no"));
        return String.format("Get Request %s", entity.get("out_trade_no"));
    }

    @RequestMapping(value = "/props", method = RequestMethod.GET)
    public Object info() {

        return serverPort;
    }
}
