package zajecia1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-21.
 */
public class Zajecia11 {
    public static void main(String[] args) throws IOException {
        File test = new File("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\test");
        readToFile(test);
//        writeTest(test);
        writeToFileTest(test, "Hello World");
    }

    public static void readToFile(File test) throws FileNotFoundException {
        Scanner scanner = new Scanner(test);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeToFileTest(File file, String message) throws IOException {
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(message);
        }
    }

    public static int getLength(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while(scanner.hasNext()){
            counter ++;
            scanner.nextLine();
        }
        return counter;
    }

    public static int[] readIntegersFromFile(File file) throws FileNotFoundException {
        int[] intsArray = new int[getLength(file)];
        Scanner scanner = new Scanner(file);
        for(int i = 0; i < intsArray. length; i++){
            intsArray[i] = scanner.nextInt();
        }
        return intsArray;
    }

}
