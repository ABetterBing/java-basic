package net.betterbing.javabasic.trycatch;

/**
 * Created by aibb on 16/4/27.
 */
public class TryCatch {
    public static void main(String[] args) {
        System.out.println("A:" + a());
    }

    public static int a() {
        int a = 0;
        try {
            a++;
            System.out.println("try.....   a:" + a);
            return a;
        } catch (Exception e) {
            a++;
            System.out.println("catch.....   a:" + a);
        } finally {
            a++;
            System.out.println("finally.....   a:" + a);
        }
        return -1;
    }
}
