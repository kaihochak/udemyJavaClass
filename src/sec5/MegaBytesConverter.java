package sec5;

import java.text.MessageFormat;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int remainder = 0;
        int megaBytes = 0;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            remainder = kiloBytes % 1024;
            megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    remainder + " KB");
        }
    }
}
