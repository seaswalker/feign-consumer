package service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 调用远程hello service.
 *
 * @author skywalker
 */
@FeignClient("hello-service")
public interface HellService {

    @RequestMapping(value = "/hello")
    String hello();

}
