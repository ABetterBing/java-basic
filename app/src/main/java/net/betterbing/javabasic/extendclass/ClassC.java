package net.betterbing.javabasic.extendclass;

/**
 * Created by aibb on 16/4/27.
 */
public class ClassC {

    ClassD classD = new ClassD();

    public ClassC() {
        System.out.println("C-constructor");
    }

    {
        System.out.println("{   }---2");
    }

    static {
        System.out.println("static {}");
    }

    {
        System.out.println("{   }---1");
    }


    public static void main(String[] args) {
        new ClassC();
    }
}
