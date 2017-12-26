package quickstart;

import com.weibo.api.motan.rpc.ResponseFuture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by m on 2017/12/26.
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
        FooService service1 = (FooService) ctx.getBean("service1");
        System.out.println(service1.hello("service1"));
        FooService service2 = (FooService) ctx.getBean("service2");
        System.out.println(service2.hello("service2"));

        // async call
        FooServiceAsync service3 = (FooServiceAsync) ctx.getBean("service3");
        ResponseFuture future = service3.helloAsync("motan async ");
        System.out.println(future.getValue());
    }
}
