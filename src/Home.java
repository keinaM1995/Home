import Animal.Dog;
import jdk.swing.interop.SwingInterOpUtils;

public class Home {
    public static void main (String args[])
    {
        Dog dog = new Dog();
        Outside out = new Outside();
        int i = 35;
        double j = i;
        double a = 56.67;
        int b = (int)a;
        System.out.println(b);
        System.out.println(recursion(100));
        enums();
    }

    //Rekurencja - metoda wywołuje samą siebie
    public static int recursion(int a)
    {
        if (a==0)
            return 1;
        else
            return a*recursion(a-1);
    }
    public static void enums()
    {
        EnumTest et = EnumTest.XXL;
        System.out.println(et.getSize(et));
    }
}
