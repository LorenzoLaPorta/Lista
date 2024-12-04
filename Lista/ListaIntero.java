import java.util.ArrayList;

public class ListaIntero{
    public static void main(String[] args){
        Intero i1 = new Intero(14);
        Intero i2 = new Intero(7);
        Intero i3 = new Intero(21);
        ArrayList<Intero> lista = new ArrayList<Intero>(); //lista che contiene oggetti

        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(new Intero(89));

        System.out.println("Lista: " + lista);
    }
}