package task2;

import java.io.IOException;

public class Task2 {
    public static void main(final String[] args) {
        try(final TryWithResources resource = new TryWithResources("file.txt")){
            resource.read();
        } catch (final IOException e){
            System.out.println("IOException !!!!");
        }
    }
}
