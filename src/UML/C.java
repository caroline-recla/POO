package UML;

public class C extends B{
    private int c;

    C(){}
    C(int c){
        super(2);
        this.c = c;
    }

    public void c1(){
        System.out.println("C1 chamado");
    }

    public static void main(String[] args) {
       C c = new C(1);
       c.a2();
       c.b1();
       c.c1();
    }
}
