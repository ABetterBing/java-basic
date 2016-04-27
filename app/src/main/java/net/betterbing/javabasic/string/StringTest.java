package net.betterbing.javabasic.string;

/**
 * Created by aibb on 16/4/27.
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        char[] chars = {'A', 'B', 'C'};
        changeStr(a, chars);
        System.out.println("a:" + a);
        System.out.println("char[]:");
        for (char aa : chars) {
            System.out.print(aa);
        }

    }

    public static void changeStr(String str, char[] chars) {
        str = "123";
        chars[0] = '1';
    }
}
