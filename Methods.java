import java.io.File;

public class Methods {
    public static boolean check(String clientName) {
        switch (clientName.toUpperCase()) {
            case "NURSULTAN":
                return new File("C:\\Nurik").exists()
                        && new File("C:\\Nurik").isDirectory();
            case "EXPENSIVE":
                return new File("C:\\Expensive").exists()
                        && new File("C:\\Expensive").isDirectory();
            case "CELESTIAL":
                return new File("C:\\Celka").exists()
                        && new File("C:\\Celka").isDirectory();
            case "AKRIEN":
                return new File("C:\\AkrienAntiLeak").exists()
                        && new File("C:\\AkrienAntiLeak").isDirectory();
            case "INTERNAL":
                return new File(System.getProperty("user.home") + "\\eloader-log.txt").exists();
            default:
                return false;
        }
    }
}