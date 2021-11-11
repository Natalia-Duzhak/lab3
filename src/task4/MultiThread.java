package task4;



public class MultiThread {
    public static void main(final String[] args) {


        final Calculations1 T1 = new Calculations1();

        final Calculations2 T2 = new Calculations2();

        final Calculations3 T3 = new Calculations3();

        final Calculations4 T4 = new Calculations4();

        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
    static class Calculations1 extends Thread {
        @Override
        public void run() {
            Calculations.addition();
        }
    }
    static class Calculations2 extends Thread {
        @Override
        public void run() {
            Calculations.subtraction();
        }
    }
    static class Calculations3 extends Thread {
        @Override
        public void run() {
           Calculations.multiplication();
        }
    }
    static class Calculations4 extends Thread {
        @Override
        public void run() {
            Calculations.division();
        }
    }

}

