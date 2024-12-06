import java.util.ArrayList;
import java.util.Random;

public class ListaIntero{

    final static ArrayList<Integer> lista = new ArrayList<Integer>(); //lista che contiene oggetti

    public ListaIntero() {
    }

    public static void aggiungiInTesta(Integer val){
        lista.add(0, val);
    }
    public static void aggiungiInCoda(Integer val){
        lista.add(val);
    }

    public static void main(String[] args){
        final int maxElementi = 12; //costante che contiene il numero massimo di elementi random da inserire nella lista
        final int maxNumeroRandom = 101; //costante che contiene il numero massimo (-1) da generare casualmente

        Integer randomNum;

        //aggiungiInTesta(randomNum);
        for (int i = 0; i < maxElementi; i++){
            randomNum = (int)(Math.random() * maxNumeroRandom);
            aggiungiInCoda(randomNum);
        }

        System.out.println("La lista e' composta da: " + lista);
    }
}