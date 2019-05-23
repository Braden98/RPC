package RPC.Easy;

import java.io.IOException;

/**
 * @Description 服务中心
 * @Author ubique
 * @Date 2019/5/23 11:08 AM
 */

public interface Server {
    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();
}