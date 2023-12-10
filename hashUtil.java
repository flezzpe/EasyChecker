import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.file.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class hashUtil {
    public static void checkHashes(String path) throws IOException {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("91d4c35ea07b80b5dd295033c1dcef7e", "RynWare / GhostClient");
        hashMap.put("33786b6d3262ec3b944bdc42b75727a9", "Manimarco / GhostClient");

        hashMap.put("7de143823cb39a68c77e84ee3ce0aff2", "HitBox / FakeMod");
        hashMap.put("70734324bfa3c5fcc35c43763ea15b89", "HitBox / FakeMod");
        hashMap.put("3619ff4b2d82d134f538e257c4a09499", "HitBox / FakeMod");
        hashMap.put("b4dc3eba770b65ab38cd1a0544c366fc", "HitBox / FakeMod");
        hashMap.put("d1a8d3df047607c41092216d02ee6343", "HitBox / FakeMod");
        hashMap.put("c69469a334be9c6699c07aa4d7b00945", "HitBox / FakeMod");
        hashMap.put("f3acf0a6313198119fd0e2fd8ac4a91e", "HitBox / FakeMod");
        hashMap.put("71b2ddfd6cd55c2e80619b6e29e6db8b", "HitBox / FakeMod");

        hashMap.put("8f7ef7fea646c68fce330fc1dc4c34ca", "ElytraSwap / FakeMod");
        hashMap.put("41738d93adb5e55f5e1175153702f25c", "ElytraSwap / FakeMod");
        hashMap.put("41150dad885ffc955d40648e77009f68", "ElytraSwap / FakeMod");

        hashMap.put("d2a4b692de59d8beb0032b34e02ea6e", "ClickPearl / FakeMod");
        hashMap.put("bae1540642112f70ff13fb6a8a0701dd", "ClickPearl / FakeMod");
        hashMap.put("4155b731296e0b28ae564d23f8366104", "ClickPearl / FakeMod");

        hashMap.put("73d3dac86d89c10ec2d896bef55ffa1", "Legit Cheat / Multi-Hack");
        hashMap.put("404a1b75bdb8fed68c238965f1a22398", "Legit Cheat / Multi-Hack");
        hashMap.put("15b8bc1f0ed8c31df075c42eb55e20bb", "Legit Cheat / Multi-Hack");
        hashMap.put("396357ce741c7bea3ed10fd8fa101e2f", "Legit Cheat / Multi-Hack");
        hashMap.put("3ed4e62a2a659da2b490513254f285f1", "Legit Cheat / Multi-Hack");
        hashMap.put("a9d20ca66ab0eda91f2beb9f02bda716", "Legit Cheat / Multi-Hack");
        hashMap.put("15c4df32739db8b28001b466b35aa2", "Legit Cheat / Multi-Hack");

        Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    try {
                        String fileHash = calculateFileHash(file);
                        System.out.println(fileHash + " | " + file.getFileName());
                        if (hashMap.containsKey(fileHash)) {
                            String clientName = hashMap.get(fileHash);
                            JOptionPane.showMessageDialog(null, "Найден чит: " + clientName + "\nНазвание мода в папке: " + file.getFileName() + "\nПолный путь к файлу: " + file);
                        }
                    } catch (IOException | NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static String calculateFileHash(Path filePath) throws IOException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        try (InputStream is = Files.newInputStream(filePath);
             DigestInputStream dis = new DigestInputStream(is, md))
        {
            byte[] buffer = new byte[4096];
            while (dis.read(buffer) != -1) { }
        }

        byte[] digest = md.digest();
        return new BigInteger(1, digest).toString(16);
    }
}
