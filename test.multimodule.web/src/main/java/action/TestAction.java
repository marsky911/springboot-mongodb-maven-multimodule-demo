 package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import test.multimodule.service.SayHelloService;

/**
 * @author youzh
 * @date 2019/08/14
 */
 
@RestController
@RequestMapping("/")
public class TestAction {
    
    @Autowired
    private SayHelloService sayHelloService;
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return sayHelloService.sayHello();
    }

}
