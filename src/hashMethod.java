import javax.swing.*;
import java.nio.file.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class hashMethod {
    public static void checkHashes(String path) throws IOException {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("b6e729deac3ece6d12da69850ab75cb1", "HelloWorldJavaSE / GhostClient");
        hashMap.put("33786b6d3262ec3b944bdc42b75727a9", "Manimarco / GhostClient");
        hashMap.put("91d4c35ea07b80b5dd295033c1dcef7e", "RynWare / GhostClient");

        hashMap.put("3619ff4b2d82d134f538e257c4a09499", "HitBox / Bush1root");
        hashMap.put("7de143823cb39a68c77e84ee3ce0aff2", "HitBox / FakeMod");
        hashMap.put("70734324bfa3c5fcc35c43763ea15b89", "HitBox / FakeMod");
        hashMap.put("b4dc3eba770b65ab38cd1a0544c366fc", "HitBox / FakeMod");
        hashMap.put("d1a8d3df047607c41092216d02ee6343", "HitBox / FakeMod");
        hashMap.put("c69469a334be9c6699c07aa4d7b00945", "HitBox / FakeMod");
        hashMap.put("f3acf0a6313198119fd0e2fd8ac4a91e", "HitBox / FakeMod");
        hashMap.put("c52348bdd34a81b0fa4f509e5833e3ed", "HitBox / CMAR4OK");
        hashMap.put("244f794e61cbe6c1b5e7c20977353b8b", "HitBox / FakeMod");
        hashMap.put("71739ee004786ace8f1dd338a182ef77", "HitBox / WaoHits");
        hashMap.put("71b2ddfd6cd55c2e80619b6e29e6db8b", "HitBox / FakeMod");
        hashMap.put("195f0cc940244feda01f35e4ddc86d3d", "HitBox / FakeMod");
        hashMap.put("a6f00534566b5a872145d45c21d9148e", "HitBox / FakeMod");
        hashMap.put("fb331894efa0b9af4fa0540a6fa84891", "HitBox / FakeMod");

        hashMap.put("8f7ef7fea646c68fce330fc1dc4c34ca", "ElytraSwap / FakeMod");
        hashMap.put("41738d93adb5e55f5e1175153702f25c", "ElytraSwap / FakeMod");
        hashMap.put("41150dad885ffc955d40648e77009f68", "ElytraSwap / FakeMod");

        hashMap.put("bae1540642112f70ff13fb6a8a0701dd", "ClickPearl / FakeMod");
        hashMap.put("4155b731296e0b28ae564d23f8366104", "ClickPearl / FakeMod");
        hashMap.put("d2a4b692de59d8beb0032b34e02ea6e", "ClickPearl / FakeMod");

        hashMap.put("92f6fe7c1dec22b094ac829ea422483b", "Legit Cheat / Multi-Hack");
        hashMap.put("404a1b75bdb8fed68c238965f1a22398", "Legit Cheat / Multi-Hack");
        hashMap.put("15b8bc1f0ed8c31df075c42eb55e20bb", "Legit Cheat / Multi-Hack");
        hashMap.put("396357ce741c7bea3ed10fd8fa101e2f", "Legit Cheat / Multi-Hack");
        hashMap.put("3ed4e62a2a659da2b490513254f285f1", "Legit Cheat / Multi-Hack");
        hashMap.put("a9d20ca66ab0eda91f2beb9f02bda716", "Legit Cheat / Multi-Hack");
        hashMap.put("73d3dac86d89c10ec2d896bef55ffa1", "Legit Cheat / Multi-Hack");
        hashMap.put("15c4df32739db8b28001b466b35aa2", "Legit Cheat / Multi-Hack");

        Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .forEach(file -> {
                    try {
                        String fileHash = getFileHash(file);
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

    public static void checkVersionHashes(String path) throws IOException {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("532f9686b0b55b3d7cf9f6733f29ba28", "");
        hashMap.put("5c7b7a7e9ceedd779ddf531ea58db8e9", "");
        hashMap.put("cdcaa2d4874a0aaab526c52e1fff2fea", "");
        hashMap.put("93aeb5ec9f94134784373f370d295a61", "");
        hashMap.put("310adc26c92b020fb6d2944092d81312", "");
        hashMap.put("b8ea778d75b1150ec0eec59d764e57cd", "");
        hashMap.put("780ed18868c28c0c249379982ea3297a", "");
        hashMap.put("68b37c18052fb770e77477e1e53a3428", "");
        hashMap.put("236817b9ba4f101e25518f1158b7691f", "");
        hashMap.put("a0e616c8b75575f45497864d650005ec", "");
        hashMap.put("5dc7452c51330beb7a178d7093cdac49", "");
        hashMap.put("ae277b62653af1bdbb27b73ea98970bb", "");
        hashMap.put("a21338306c8027ebc459c57db8459777", "");
        hashMap.put("bea36e6601b1b9c5dc85eb66cb438887", "");
        hashMap.put("214a0bc5ae5882495d94f7779d64b323", "");
        hashMap.put("3d47e750e4ec109d441a427ab8b37614", "");
        hashMap.put("9a6d2dd81f7b80442b444ff71bab9269", "");

        //Поддержка 1.12.2
        hashMap.put("ec587acff9c06d699829908b515ea17e", "");
        hashMap.put("90cab52fca89e7d233741c0439dc2005", "");
        hashMap.put("862d141de8b4dd93ac55cd4a1a78b69", "");
        hashMap.put("ffc85e4a631d90112aee8e213cd367cd", "");
        hashMap.put("7b5d669b490d5737d8a9d1f96274e2e5", "");
        hashMap.put("2644c73a80eb9f9fb7f81a2a5e546642", "");
        hashMap.put("b9fcfbd6d44e4d83605cc35171668c8", "");
        hashMap.put("9e02334f9bba622885eadb059f0633b3", "");
        hashMap.put("89021c218a3f6feb807a664f852ffbd3", "");
        hashMap.put("2675265c0f5baa7483a6b66b7ddd1226", "");
        hashMap.put("41dfbc2efe788a9aa10317c1a1a19f63", "");
        hashMap.put("e1b6ea36be8bba7c5d34fb1f028f9fc", "");
        hashMap.put("d02f7d0578794c79a6eaf79768bb9616", "");
        hashMap.put("627d6266e24579beef70b8266ab6a1cd", "");
        hashMap.put("a8d4aa307416316954a59c92917c718b", "");
        hashMap.put("2db3e834315d7751a5f8caccbf31a109", "");
        hashMap.put("448bb27bc6c82413aab6a6dc7bc404b9", "");
        hashMap.put("25766fc59aed474f719c94e2f996b98d", "");
        hashMap.put("93acdee2fd447fc58b6b105126ae044b", "");
        hashMap.put("218dfe6e0e5d2670d67312116ef4c471", "");
        hashMap.put("37eb843886774cc08b8cb2486457da2c", "");
        hashMap.put("2d1ceddc16948400bd14ffdded7c8667", "");

        Files.walk(Paths.get(path))
                .filter(Files::isRegularFile)
                .filter(file -> file.toString().toLowerCase().endsWith(".dll"))
                .forEach(file -> {
                    try {
                        String fileHash = getFileHash(file);

                        if (!hashMap.containsKey(fileHash)) {
                            System.out.println(fileHash + " | " + file.getFileName());
                            JOptionPane.showMessageDialog(null, "Найдена поддельная библиотека! \nПолный путь к файлу: " + file);
                        }
                    } catch (IOException | NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    }
                });
    }


    private static String getFileHash(Path filePath) throws IOException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        try (InputStream is = Files.newInputStream(filePath);
             DigestInputStream dis = new DigestInputStream(is, md))
        {
            byte[] buffer = new byte[4096];
            while (dis.read(buffer) != -1) {}
        }

        byte[] digest = md.digest();
        return new BigInteger(1, digest).toString(16);
    }
}
