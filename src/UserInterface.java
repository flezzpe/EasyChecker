import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class UserInterface {

    JPanel MainPanel = new JPanel();
    JPanel OtherPanel = new JPanel();
    JTabbedPane JTPane = new JTabbedPane();
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

    JCheckBox checkMods;
    JCheckBox checkVersion;

    public static void showMessageBox(String text) {
        JOptionPane.showMessageDialog(null, text);
    }

    public void initUi(String title, int Width, int Height, boolean isVisible) {
        window = new JFrame(title);
        JTPane.setBounds(50, 50, 400, 400);

        window.setAlwaysOnTop(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setPreferredSize(new Dimension(Width, Height));
        window.setVisible(isVisible);
        window.setLayout(new GridLayout());

        // Buttons and etc...

        checkMods = new JCheckBox("Сканировать моды");
        checkVersion = new JCheckBox("Проверить DLL файлы (БЕТА 1.12.2 -> 1.20.4)");

        openUSBDriveLog = new JButton("Открыть USBDriveLog");
        openUSBDriveLog.addActionListener(e -> {
            try {
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("USBDriveLog.exe");

                if (inputStream != null) {
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                    File tempFile = File.createTempFile("EASYCHECKER_TEMP_FILE", ".exe");
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
                if (checkVersion.isSelected()) {
                    if (new File(
                            System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\versions")
                            .exists()) {
                        hashMethod.checkVersionHashes(
                                System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\versions");
                    }
                    if (new File(System.getProperty("user.home")
                            + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\versions")
                            .exists()) {
                        hashMethod.checkVersionHashes(System.getProperty("user.home")
                                + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\versions");
                    }
                }

                    if (checkMods.isSelected()) {
                        if (new File(
                                System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\mods")
                                .exists()) {
                            hashMethod.checkHashes(
                                    System.getProperty("user.home") + "\\AppData\\Roaming\\.minecraft\\mods");
                        }
                        if (new File(System.getProperty("user.home")
                                + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\mods")
                                .exists()) {
                            hashMethod.checkHashes(System.getProperty("user.home")
                                    + "\\AppData\\Roaming\\.tlauncher\\legacy\\Minecraft\\game\\mods");
                        }
                }

                if (fileSystemMethod.check("Internal")) {
                    showMessageBox("Найдены остатки лоадера Internal.");
                    Desktop.getDesktop().open(new File(System.getProperty("user.home") + "\\eloader-log.txt"));
                }

                if (fileSystemMethod.check("Nursultan")) {
                    showMessageBox("Найдена папка клиента Nursultan.");
                    Desktop.getDesktop().open(new File("C:\\Nurik\\client_1_16_5\\logs"));
                }

                if (fileSystemMethod.check("Expensive")) {
                    showMessageBox("Найдена папка клиента Expensive.");
                    Desktop.getDesktop().open(new File("C:\\Expensive\\client_1_16_5\\logs"));
                }

                if (fileSystemMethod.check("Celestial")) {
                    showMessageBox("Найдена папка клиента Celestial.");
                    Desktop.getDesktop().open(new File("C:\\Celka\\client_1_16_5\\logs"));
                }

                if (fileSystemMethod.check("Akrien")) {
                    showMessageBox("Найдена папка клиента Akrien.");
                    Desktop.getDesktop().open(new File("C:\\AkrienAntiLeak"));
                }
            } catch (Exception exception) {
                showMessageBox("Ошибка! Пожалуйста убедитесь в целостности программы.");
            }
        });

        // Pack ui

        JTPane.add("Главная", MainPanel);
        JTPane.add("Дополнения", OtherPanel);

        window.add(JTPane);

        MainPanel.add(checkVersion);
        MainPanel.add(checkMods);
        MainPanel.add(checkButton);

        OtherPanel.add(checkVM);
        OtherPanel.add(openExecutedProgramsList);
        OtherPanel.add(openUSBDriveLog);
        OtherPanel.add(openJournalTrace);
        OtherPanel.add(openProcessHacker);
        OtherPanel.add(openEverything);
        OtherPanel.add(openAppData);
        OtherPanel.add(openRecent);

        window.add(JTPane);
        window.pack();
    }
}
