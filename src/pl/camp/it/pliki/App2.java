package pl.camp.it.pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {
        try {
            String file ="test.txt";
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("plik nie dziala !!");
        }
    }
}
