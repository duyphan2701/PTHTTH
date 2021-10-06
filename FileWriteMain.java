package tuan_3;

/**
 * FileWriteMain
 */
public class FileWriteMain {

    public static void main(String[] args) {
        FileWrite f1 = new FileWrite("tep1.txt");
        f1.start();
        FileWrite f2 = new FileWrite("tep2.txt");
        f2.start();
        FileWrite f3 = new FileWrite("tep3.txt");
        f3.start();
    }
}