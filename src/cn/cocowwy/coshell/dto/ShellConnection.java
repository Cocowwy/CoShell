package cn.cocowwy.coshell.dto;

import com.alibaba.fastjson.JSONObject;

/**
 * 连接对象
 * @author Cocowwy
 * @create 2021-09-09-11:20
 */
public class ShellConnection {
    /**
     * 连接唯一识别号
     */
    private static final String cid;

    /**
     * 展示名称
     */
    private String name;

    /**
     * 账号
     */
    private String user;

    /**
     * 密码
     */
    private String password;

    /**
     * 主机地址
     */
    private String host;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 默认端口
     */
    private static final Integer DEFAULT_SSH_PORT = 22;

    static {
        // 暂时用时间戳做唯一标识
        cid = String.valueOf(System.currentTimeMillis() / 1000);
    }

    public ShellConnection() {
    }

    public ShellConnection(String name, String user, String password, String host, Integer port) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.host = host;
        this.port = port;
    }

    public ShellConnection(String user, String password, String host) {
        this.name = user;
        this.user = user;
        this.password = password;
        this.host = host;
        this.port = DEFAULT_SSH_PORT;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public String getCid() {
        return cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

}
