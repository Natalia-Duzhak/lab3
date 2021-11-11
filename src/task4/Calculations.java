package task4;

public class Calculations extends Thread {
    private static int count = 0 ;
    private static int plus = 0;
    private static int minus = 0;
    private static int multiply = 0;
    private static int divide = 0;


    public static void addition() {
        System.out.println("addition started");
        try {
            for (int x = 0; x <= 3; x++) {

                System.out.println("Calculating: of " + count +
                        " + " + count + " = " + plus + "\n");
                Thread.sleep(1000);
                count++;
                plus = count + count;

            }
        } catch(final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("addition finished");

    }
    public static void subtraction() {
        System.out.println("subtraction started");
        try {
            for (int x = 0; x <= 3; x++) {


                System.out.println("Calculating: of " + count +
                        " - " + count + " = " + minus + "\n");
                Thread.sleep(1000);
                count++;
                minus = count - count;

            }
        } catch(final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("subtraction finished");
    }
    public static void multiplication() {
        System.out.println("multiplication started");
        try {
            for (int x = 0; x <= 3; x++) {


                System.out.println("Calculating: of " + count +
                        " * " + count + " = " + multiply  + "\n");
                Thread.sleep(3000);
                count++;
                multiply  = count * count;

            }
        } catch(final InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }
        System.out.println("multiplication finished");
    }
    public static void division() {
        System.out.println("division started");
        try {
            for (int x = 0; x <= 3; x++) {

                System.out.println("Calculating: of " + count +
                        " / " + count + " = " + divide + "\n");
                Thread.sleep(3000);
                count++;
                divide = count / count;

            }
        } catch(final InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }
        System.out.println("division finished");
    }

}

