import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Pizza pizza = createPizzaObjectFromFile();

        if (pizza != null) {
            String[][] pizzaFilling = fillMultidimensionalArray(pizza.getWidth(), pizza.getHeight());
            System.out.println("cele pole:" + Arrays.deepToString(pizzaFilling));
        }
    }

    private static Pizza createPizzaObjectFromFile() {
        String read;
        String[] splited;
        BufferedReader in = null;
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
                    return new Pizza(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]),
                            Integer.parseInt(splited[2]), Integer.parseInt(splited[3]));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    private static String[][] fillMultidimensionalArray(int x, int y) {
        Scanner s;
        String[][] myArray = new String[x][y];
        try {
            s = new Scanner(new File("a_example.in"));
            s.nextLine();
            while (s.hasNextLine()) {
                for (String[] strings : myArray) {
                    String[] line = s.nextLine().trim().split("");
                    System.arraycopy(line, 0, strings, 0, line.length);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myArray;
    }
}
