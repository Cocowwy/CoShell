package com.sexytea.coshell;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

import java.awt.*;

/**
 * @author Cocowwy
 * @create 2021-06-06-21:57
 */
public class CoShell extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        NotificationGroup notificationGroup = new NotificationGroup("CoShell", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification("欢迎使用CoShell", MessageType.INFO);
        Notifications.Bus.notify(notification  );
    }
}
