package cn.cocowwy.coshell.win;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Cocowwy
 * @create 2021-09-09-19:00
 */
public class ShellToolWindow {
    private JButton hideButton;

    private JLabel datetimeLabel;

    private JPanel myToolWindowContent;

    public ShellToolWindow(ToolWindow toolWindow) {

        init();

        hideButton.addActionListener(e -> toolWindow.hide(null));
    }

    private void init() {
        datetimeLabel = new JLabel();
        datetimeLabel.setText(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

        hideButton = new JButton("取消");

        myToolWindowContent = new JPanel();
        myToolWindowContent.add(datetimeLabel);
        myToolWindowContent.add(hideButton);
    }

    public JPanel getContent() {
        return myToolWindowContent;
    }

}
