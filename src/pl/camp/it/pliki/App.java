package pl.camp.it.pliki;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            String str = "Hello";
            String file = "test.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(str);
            writer.newLine();
            writer.write("lkajhsgdfjasdf");
            writer.newLine();
            writer.write("lkajhsgdfjasdfasdfasd");
            writer.newLine();
            writer.write("lkajhsgdfjasasdfasd3423342234df");
            writer.newLine();
            writer.write("lkajhsgdfjasd453243q4q4qa54w54w45aw45f");
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("Pilk nie dziala !!!");
        }
    }
}
