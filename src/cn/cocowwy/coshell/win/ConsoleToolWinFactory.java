package cn.cocowwy.coshell.win;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author Cocowwy
 * @create 2021-09-09-18:33
 */
public class ConsoleToolWinFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        ShellToolWindow myToolWindow = new ShellToolWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(myToolWindow.getContent(), "自定义tool window", false);
        toolWindow.getContentManager().addContent(content);
    }
}
