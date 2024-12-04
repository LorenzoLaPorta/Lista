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
     * controlla se il numero e' pari
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
     * controlla se il numero e' dispari
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
     * controlla se il numero e' nullo
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
     * controlla se il numero e' negativo
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
     * controlla se il numero e' positivo
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

    /**
     * controlla se un numero e' primo
     * 
     * @param
     * @return 
     */
    public boolean isPrimo(){
        for (int i = 2; i < this.valore; i++){
            if (this.valore % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * si ritorna l'int contenuto come attributo di un oggetto
     * 
     * @param 
     * @return int
     */
    public int toInt(){
        return this.valore;
    }

    public static void main(String[] args){
        Intero x = new Intero(9);
        System.out.println(x.toInt());
        
        if (x.isPrimo()){
            System.out.println("E' primo");
        }
        else{
            System.out.println("Non e' primo");
        }

        if (x.isPari()){
            System.out.println("E' pari");
        }
        else{
            System.out.println("E' dispari");
        }
    }
}