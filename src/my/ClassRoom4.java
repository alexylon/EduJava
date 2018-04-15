package my;

import java.io.IOException;
import java.io.InputStream;

public class ClassRoom4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter your text here: ");

        String nextLine = readLine(System.in);
        System.out.print(nextLine);
    }


    public static String readLine(InputStream inputStream) throws IOException {
        String result = "";
        int ch;
        while ((ch = inputStream.read()) != '\n') {
            result = result + (char) ch;
        }
        return result;
    }
}
