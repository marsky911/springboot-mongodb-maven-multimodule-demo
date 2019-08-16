 package test.multimodule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.multimodule.dao.SayHelloDao;

/**
 * @author youzh
 * @date 2019/08/14
 */
@Service
public class SayHelloService {
    
    @Autowired
    private SayHelloDao sayHelloDaoImpl;
    
    public String sayHello() {
        return sayHelloDaoImpl.sayHello();
    }

}
