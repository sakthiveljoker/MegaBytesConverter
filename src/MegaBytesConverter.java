public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            int megabytes = kiloBytes / 1024;
            int kilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes +
                    " KB = " + megabytes +
                    " MB and " + kilobytes +
                    " KB");
        }
    }
}
