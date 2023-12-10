import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        // FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            UI.showMessageBox("Не удалось инициализировать библеотеку интерфейса");
        }


        // UI Class
        UI ui = new UI();
        ui.initUi("EasyChecker v0.0.1 - Made by FlessPe | discord - (java.dll)", 500, 200, true);
    }
}