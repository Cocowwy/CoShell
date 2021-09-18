package cn.cocowwy.coshell.constant;

/**
 * @author Cocowwy
 * @create 2021-09-09-18:00
 */
public enum ChannelEnum {
    SHELL("shell");

    private String channel;

    ChannelEnum(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }
}
