package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.HellService;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private HellService hellService;

    @RequestMapping(value = "/feign-consume", method = RequestMethod.GET)
    public String helloService() {
        return hellService.hello();
    }

}
