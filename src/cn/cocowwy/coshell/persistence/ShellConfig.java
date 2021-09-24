package cn.cocowwy.coshell.persistence;

import com.alibaba.fastjson.JSONObject;
import com.intellij.openapi.components.*;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Cocowwy
 * @create 2021-09-09-11:04
 */
@State(name = "shell-config", reloadable = true,
        storages = {@Storage("$APP_CONFIG$/shell-config.json")}
)
public class ShellConfig implements PersistentStateComponent<ShellConfig.Config> {

    private Config config;


    public static class Config {
        public Config(String cid, String name, String user, String password, String host, Integer port) {
            this.cid = cid;
            this.name = name;
            this.user = user;
            this.password = password;
            this.host = host;
            this.port = port;
        }

        /**
         * 连接唯一识别号
         */
        private String cid;

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

        @Override
        public String toString() {
            return JSONObject.toJSONString(this);
        }
    }

    public static ShellConfig.Config getInstance() {
        // 获取配置
        return ServiceManager.getService(ShellConfig.Config.class);
    }

    @Override
    public @Nullable
    Config getState() {
        System.out.println(config);
        return config;
    }

    @Override
    public void loadState(@NotNull Config config) {
        config = config;
    }
}
