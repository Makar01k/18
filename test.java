import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
      File file = new File("aaass");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Обхитрил систему");
        }
        System.out.println("Ха Ха Ха ");

    }




    }


