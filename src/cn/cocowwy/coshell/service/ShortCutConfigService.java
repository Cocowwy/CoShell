package cn.cocowwy.coshell.service;

import cn.cocowwy.coshell.dto.ShortcutMapping;
import cn.hutool.core.io.file.FileWriter;
import com.alibaba.fastjson.JSONArray;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Cocowwy
 * @create 2021-09-09-16:01
 */
public class ShortCutConfigService {

    /**
     * 对uid持久化快捷指令
     */
    public static void saveShortCutConfig(String cid, String key, String value) {
        Map<String, String> kv = new HashMap<>();
        kv.put(key, value);

        ShortcutMapping shortcutMapping = new ShortcutMapping();
        shortcutMapping.setCid(cid);
        shortcutMapping.setCommandMapping(kv);

        JSONArray saveInDb = new JSONArray();
        saveInDb.add(shortcutMapping);

    }
}
