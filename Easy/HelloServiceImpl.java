package RPC.Easy;

/**
 * @Description
 * @Author ubique
 * @Date 2019/5/23 11:08 AM
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}