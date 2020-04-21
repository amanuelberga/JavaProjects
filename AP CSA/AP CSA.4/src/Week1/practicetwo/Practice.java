package Week1.practicetwo;

public class Practice {
    public static void main(String[] args) {
        /*** TODO: Create a new A object with inputs 1 and 'A'
         and store it in an A reference, aa ***/
        A aa = new A(1, 'A');

        /*** TODO: Create a new B object with input 2
         and store it in an A reference, ab ***/
        B ab = (B) new A(2,'A');

        /*** TODO: Create a new B object with input 2
         and store it in a B reference, bb ***/
        B bb = new B(2);

        /*** TODO: Create a new C object and store it in an A
         reference, ac ***/
        C ac = (C) new A(1,'A');

        /*** TODO: Create a new A object with inputs 1 and 'A'
         and store it in an A reference, aa ***/
        /*** TODO: Create a new B object with input 2
         and store it in an A reference, ab ***/
        /*** TODO: Create a new B object with input 2
         and store it in a B reference, bb ***/
        /*** TODO: Create a new C object and store it in an A
         reference, ac ***/
        System.out.println(aa);
        System.out.println(ab);
        System.out.println(bb);
        System.out.println(ac);
    }
}
