import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        getFile();
    }

    public static void getFile() {
        BufferedReader in = null;
        Pizza pizza;
        String read = null;
        String[] splited;

        try {
            in = new BufferedReader(new FileReader("a_example.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (in != null) {
            try {
                read = in.readLine();
                if (read != null) {
                    splited = read.split(" ");
                    pizza = new Pizza(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]),
                            Integer.parseInt(splited[2]), Integer.parseInt(splited[3]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
