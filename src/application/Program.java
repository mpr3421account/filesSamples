package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good afternoon", "Good night"};

        String path = "C:\\testeJava\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();

            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}