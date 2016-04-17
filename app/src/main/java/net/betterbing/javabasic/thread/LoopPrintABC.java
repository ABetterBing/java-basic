package net.betterbing.javabasic.thread;

/**
 * Created by aibb on 16/4/16.
 */
public class LoopPrintABC {


    public static void main(String[] args) {
        System.out.print("Hello Wrold!");
        new PrintThread("A").start();
        new PrintThread("B").start();
        new PrintThread("C").start();

    }
}

class PrintThread extends Thread {

    private String mName;

    private static Object obj = new Object();

    private static int flag_a = 1;
    private static int flag_b = 0;
    private static int flag_c = 0;

    public PrintThread(String name) {
        mName = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (mName.equals("A") && flag_a > 0) {
                    System.out.print(mName);
                    flag_a--;
                    flag_b++;
                } else if (mName.equals("B") && flag_b > 0) {
                    System.out.print(mName);
                    flag_b--;
                    flag_c++;
                } else if (mName.equals("C") && flag_c > 0) {
                    System.out.print(mName);
                    flag_c--;
                    flag_a++;
                }
            }
        }

    }
}
