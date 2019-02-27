import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Pizza pizza = createPizzaObjectFromFile();
    }

    private static Pizza createPizzaObjectFromFile() {
        String read;
        String[] splited;
        getFile();
        String read;
        String[] splited;

        if (in != null) {
            try {
                read = in.readLine();
                if (read != null) {
                    splited = read.split(" ");
                    return new Pizza(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]),
                            Integer.parseInt(splited[2]), Integer.parseInt(splited[3]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static void fillThePizza(){
        getFile();
        BufferedReader in;
        String read;
        String[] splited;
        if (in != null) {
            try {
                read = in.readLine();
                if (read != null) {
                    splited = read.split(" ");
                   }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String getLineFromFile() {
        BufferedReader in = null;
        String read;
        String[] splited;

        try {
            in = new BufferedReader(new FileReader("a_example.in"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (in != null) {
            for(int x = 0; x < in.lines(); x++){
                buf.readLine();
            }
        }
        read = buf.readLine();

        if (in != null) {
            in.lines().parallel().forEach(line -> {
                        //Invoke the code passing the 'line' that persists in the DB...something like
                        dbWriter.write(line);


                    });
        }

    }
