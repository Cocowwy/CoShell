package cn.cocowwy.coshell.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Cocowwy
 * @create 2021-09-09-16:16
 */
public class LoginShell {
    private JPanel hostPanel;
    private JPanel portPanel;
    private JPanel namePanel;
    private JPanel loginPanel;
    private JPanel passWordPanel;
    private JPanel userNamePanel;
    private JLabel portLabel;
    private JLabel userNameLabel;
    private JLabel passwordLabel;
    private JLabel nameLabel;
    private JLabel hostLabel;
    private JTextField hostTxt;
    private JTextField portTxt;
    private JTextField userNameTxt;
    private JTextField passwordTxt;
    private JTextField nameTxt;
    private JButton loginBtn;
    private JButton clearBtn;

    public LoginShell(Project project, ToolWindow toolWindow) {
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
