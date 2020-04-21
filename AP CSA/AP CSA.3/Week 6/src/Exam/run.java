package Exam;

public class run {
    public static void main(String[] args)
    {
        Cougar cg = new Cougar();
        Cat c = new Cat();
        Jaguar j = new Jaguar();
        Quadruped q = new Quadruped();

        if (cg instanceof Cat)
            System.out.print("Yes");
        if (c instanceof Quadruped)
            System.out.print("Yes");
        if (j instanceof Jaguar)
            System.out.print("Yes");
        if (q instanceof Cat)
            System.out.print("Yes");
    }
}
