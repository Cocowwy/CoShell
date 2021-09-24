package cn.cocowwy.coshell.ui;

import cn.cocowwy.coshell.Shell;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.EditorTextField;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cocowwy
 * @create 2021-09-09-18:57
 */
public class LoginDialog extends DialogWrapper {
    public LoginDialog() {
        super(true);
        setTitle("CoShell");
        init();
    }

    @Override
    protected @Nullable
    JComponent createCenterPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        EditorTextField host = new EditorTextField("host");
        EditorTextField user = new EditorTextField("user");
        EditorTextField pwd = new EditorTextField("pwd");
        panel.add(host);
        panel.add(user);
        panel.add(pwd);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Login");
        panel.add(button);
        button.addActionListener(e -> {
            Shell.doIt(null);
        });
        return panel;
    }
}
