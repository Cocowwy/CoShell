package cn.cocowwy.coshell;

import cn.cocowwy.coshell.constant.ChannelEnum;
import cn.cocowwy.coshell.dto.ShellConnection;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;
import kotlinx.serialization.StringFormat;
import org.apache.maven.model.InputLocation;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringJoiner;

/**
 * @author Cocowwy
 * @create 2021-07-07-11:01
 */
public class Shell {
    private static final String USER = "root";
    private static final String PASSWORD = "Cyys2013@";
    private static final String HOST = "39.98.71.73";
    private static final int DEFAULT_SSH_PORT = 22;

    public static void main(String[] arg) {

        try {
            JSch jsch = new JSch();

            ShellConnection con1 = new ShellConnection(USER, PASSWORD, HOST);

            Session session = jsch.getSession(con1.getUser(), con1.getHost(), con1.getPort());
            session.setPassword(PASSWORD);
            System.out.println("欢迎使用Cocowwy的Shell工具~");
            System.out.println("当前连接信息为：" + con1);

            UserInfo userInfo = new UserInfo() {
                @Override
                public String getPassphrase() {
                    System.out.println("getPassphrase");
                    return null;
                }

                @Override
                public String getPassword() {
                    System.out.println("getPassword");
                    return null;
                }

                @Override
                public boolean promptPassword(String s) {
                    System.out.println("promptPassword:" + s);
                    return true;
                }

                @Override
                public boolean promptPassphrase(String s) {
                    System.out.println("promptPassphrase:" + s);
                    return true;
                }

                @Override
                public boolean promptYesNo(String s) {
                    System.out.println("promptYesNo:" + s);
                    return true;
                }

                @Override
                public void showMessage(String s) {
                    System.out.println("showMessage:" + s);
                }
            };
            session.setUserInfo(userInfo);
            session.connect(30000);
            Channel channel = session.openChannel(ChannelEnum.SHELL.getChannel());
            channel.setInputStream(System.in);
            channel.setOutputStream(System.out);
            channel.connect(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}