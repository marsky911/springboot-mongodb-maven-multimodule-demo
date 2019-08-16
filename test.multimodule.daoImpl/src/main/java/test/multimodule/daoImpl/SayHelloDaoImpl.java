 package test.multimodule.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import test.multimodule.dao.SayHelloDao;
import test.multimodule.domain.Person;

/**
 * @author youzh
 * @date 2019/08/14
 */
@Component
public class SayHelloDaoImpl implements SayHelloDao {

    @Autowired
    MongoTemplate mongotemplate;
    
    /* (non-Javadoc)
     * @see test.multimodule.dao.SayHelloDao#sayHello()
     */
    @Override
    public String sayHello() {
        // TODO Auto-generated method stub
        
        Person p = new Person();
        p.setName("Tom");
        p.setPhoneNumber("123456");
        mongotemplate.save(p);
         return "HelloTom";
    }

}
