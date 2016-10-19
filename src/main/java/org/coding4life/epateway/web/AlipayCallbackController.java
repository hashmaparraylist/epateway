package org.coding4life.epateway.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Alipay's Callback Controller
 */
@RestController
@RequestMapping("/alipay")
public class AlipayCallbackController {

    /** Log */
    private static final Logger logger = Logger.getLogger(AlipayCallbackController.class);

    /**
     * Callback function from Alipay
     * @param payload
     * @return
     */
    @RequestMapping(value = "/callback", method = RequestMethod.POST)
    public Object callback(@RequestBody Map<String, Object> payload) {

        logger.info("==========================> alipay/callback start.");

        logger.info("==========================> alipay/callback end.");
        return null;
    }
}
