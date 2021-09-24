package cn.cocowwy.coshell.dto;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * @author Cocowwy
 * @create 2021-09-09-14:19
 */
public class ShortcutMapping {
    /**
     * 归属的链接id
     */
    private String cid;

    /**
     * 自定义快捷key——>自定义命令value
     */
    private Map<String, String> commandMapping;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Map<String, String> getCommandMapping() {
        return commandMapping;
    }

    public void setCommandMapping(Map<String, String> commandMapping) {
        this.commandMapping = commandMapping;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
