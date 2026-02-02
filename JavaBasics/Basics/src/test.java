class A{
    static int A;
    static {
        System.out.println("A");
    }
    A(){
        System.out.println("Constructor A");
    }
    int i;
    {
        System.out.println("A System");
    }
}
class B extends A{
    static int B;
    static {
        System.out.println("B");
    }
    B(){
        System.out.println("Constructor B");
    }
    int j;
    {
        System.out.println("B System");
    }
}

public class test {
    public static void main(String[] args) {
        new B();
    }
}
