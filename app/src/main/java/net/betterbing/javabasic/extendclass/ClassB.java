package net.betterbing.javabasic.extendclass;

/**
 * Created by aibb on 16/4/27.
 */
public class ClassB extends ClassA implements Interface1 {
    @Override
    public void printA() {
        System.out.println("ClassB-printA()");
    }

    public static void main(String[] args) {
        new ClassB().printA();
    }
}
