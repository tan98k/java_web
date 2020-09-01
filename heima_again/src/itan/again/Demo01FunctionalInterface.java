package itan.again;

public class Demo01FunctionalInterface {
    public static void startThread(Runnable run){
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });
        startThread(()-> System.out.println("nihaoya"));
    }
}
