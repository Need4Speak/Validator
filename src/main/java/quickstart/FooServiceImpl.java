package quickstart;

/**
 * Created by m on 2017/12/26.
 */
public class FooServiceImpl implements FooService {
    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
