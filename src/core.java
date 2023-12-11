import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme;

import javax.swing.UIManager;

public class core {
    public static void main(String[] args) {

        // FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatGitHubDarkIJTheme());
        } catch (Exception ex) {
            UserInterface.showMessageBox("Не удалось инициализировать библеотеку интерфейса.");
        }


        // UI Class
        UserInterface ui = new UserInterface();
        ui.initUi("EC v0.0.2 | dev: FlessPe | discord - (java.dll)", 500, 300, true);
    }
}