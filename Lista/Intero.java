public class Intero{
    //attributo della classe Intero
    int valore;

    //costruttore
    Intero(int n){
        this.valore = n;
    }

    /**
     * converte un valore intero in stringa
     * 
     * @param 
     * @return String
     */
    @Override
    public String toString(){
        return this.valore + "";
    }

    /**
     * controlla se il numero è pari
     * 
     * @param 
     * @return boolean
     */
    public boolean isPari(){
        if (this.valore % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * controlla se il numero è dispari
     * 
     * @param 
     * @return boolean
     */
    public boolean isDispari(){
        if (this.valore % 2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * controlla se il numero è nullo
     * 
     * @param 
     * @return boolean
     */
    public boolean isNullo(){
        if (this.valore == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * controlla se il numero è negativo
     * 
     * @param 
     * @return boolean
     */
    public boolean isNegativo(){
        if (this.valore < 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * controlla se il numero è positivo
     * 
     * @param 
     * @return boolean
     */
    public boolean isPositivo(){
        if (this.valore > 0){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args){
        Intero x = new Intero(5);
        System.out.println(x);
        int n = 5;
        System.out.println(n);
        
        if (x.isPari()){
            System.out.println("E' pari");
        }
        else{
            System.out.println("E' dispari");
        }
    }
}