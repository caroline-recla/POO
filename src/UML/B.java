package UML;

public class B extends A{
    private int i ;
    B(){};
    B(int b){
        super(1);
        this.i = b;
    }
    public void b1(){
        System.out.println("B1 chamado");
    }

}
