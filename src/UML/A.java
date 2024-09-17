package UML;

public abstract class A {
    private int i;

    A(int i){
        this.i = i;
    }
    A(){};

    public void a1(){
        System.out.println("A1 chamado");
    }
    public void a2(){
        System.out.println("A2 chamado");
    }

}
