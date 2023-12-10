import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import javax.swing.*;

public class UI {
    JFrame window;
    JButton checkButton;
    JButton openRecent;
    JButton openAppData;
    JButton openEverything;
    JButton checkVM;
    JButton openJournalTrace;
    JButton openProcessHacker;
    JButton openUSBDriveLog;
    JButton openExecutedProgramsList;

    JCheckBox checkVanila;

    public static void showMessageBox(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public void initUi(String title, int Width, int Height, boolean isVisible) {
        window = new JFrame(title);

        window.setAlwaysOnTop(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setPreferredSize(new Dimension(Width, Height));
        window.setVisible(isVisible);
        window.setLayout(new FlowLayout());

        // Buttons and etc...

        checkVanila = new JCheckBox("Сканировать ли моды?");

        openUSBDriveLog = new JButton("Открыть USBDriveLog");
        openUSBDriveLog.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("USBDriveLog.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile(System.getenv("USERNAME"), ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #2");
            }
        });

        openExecutedProgramsList = new JButton("Открыть ExecutedProgramsList");
        openExecutedProgramsList.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("ExecutedProgramsList.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile("флесспе😯", ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пользователь не согласился с запуском программы (UAC). Скажите чтобы пользователь нажал 'Да' при запуске и открыл ExecutedProgramsList.");
            }
        });

        openJournalTrace = new JButton("Открыть JournalTrace");
        openJournalTrace.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("JournalTrace.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile(System.getenv("USERNAME"), ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пользователь не согласился с запуском программы (UAC). Скажите чтобы пользователь нажал 'Да' при запуске и открыл JournalTrace.");
            }
        });

        openProcessHacker = new JButton("Открыть ProcessHacker");
        openProcessHacker.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("ProcessHacker.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile(System.getenv("USERNAME"), ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #2");
            }
        });


        checkVM = new JButton("Проверить на виртуальную машину");
        checkVM.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("System.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile(System.getenv("USERNAME"), ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #2");
            }
        });

        openRecent = new JButton("Открыть Recent");
        openRecent.addActionListener(e -> {
            try {
                Desktop.getDesktop().open(new File(System.getProperty("user.home") + "\\Recent"));
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы.");
            }
        });

        openEverything = new JButton("Открыть Everything");
        openEverything.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Everything.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile(System.getenv("USERNAME"), ".exe");
                    tempFile.deleteOnExit();

                    try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = inputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                    }

                    Desktop.getDesktop().open(tempFile);
                } else {
                    showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #1");
                }
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы. #2");
            }
        });

        openAppData = new JButton("Открыть AppData");
        openAppData.addActionListener(e -> {
            try {
                Desktop.getDesktop().open(new File(System.getProperty("user.home") + "\\AppData"));
            } catch (IOException ex) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы.");
            }
        });

        checkButton = new JButton("Быстрое сканирование");
        checkButton.addActionListener(e -> {
            try {
                if (checkVanila.isSelected()) {
                    if (new File(
                            System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\mods")
                            .exists()) {
                        hashUtil.checkHashes(
                                System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\mods");
                    }
                    if (new File(System.getProperty("user.home")
                            + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\mods")
                            .exists()) {
                        hashUtil.checkHashes(System.getProperty("user.home")
                                + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\mods");
                    }
                }

                if (Methods.check("Internal")) {
                    showMessageBox("Найдены остатки лоадера Internal.");
                    Desktop.getDesktop().open(
                            new File(System.getProperty("user.home") + "\\eloader-log.txt"));
                }

                if (Methods.check("Nursultan")) {
                    showMessageBox("Найдена папка клиента Nursultan.");
                    Desktop.getDesktop().open(new File("C:\\Nurik\\client_1_16_5\\logs"));
                }

                if (Methods.check("Expensive")) {
                    showMessageBox("Найдена папка клиента Expensive.");
                    Desktop.getDesktop().open(new File("C:\\Expensive\\client_1_16_5\\logs"));
                }

                if (Methods.check("Celestial")) {
                    showMessageBox("Найдена папка клиента Celestial.");
                    Desktop.getDesktop().open(new File("C:\\Celka\\client_1_16_5\\logs"));
                }

                if (Methods.check("Akrien")) {
                    showMessageBox("Найдена папка клиента Akrien.");
                    Desktop.getDesktop().open(new File("C:\\AkrienAntiLeak"));
                }
            } catch (Exception exception) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы.");
            }
        });

        // Pack ui
        window.add(checkButton);
        window.add(checkVanila);

        window.add(checkVM);
        window.add(openExecutedProgramsList);
        window.add(openUSBDriveLog);
        window.add(openJournalTrace);
        window.add(openProcessHacker);
        window.add(openEverything);
        window.add(openAppData);
        window.add(openRecent);

        window.pack();
    }
}
