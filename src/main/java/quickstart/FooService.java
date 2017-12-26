package quickstart;

import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * Created by m on 2017/12/26.
 */
@MotanAsync
public interface FooService {
    public String hello(String name);
}
