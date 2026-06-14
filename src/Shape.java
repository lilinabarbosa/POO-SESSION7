public class Shape {
    private int numSides;
    private boolean regular;

    public Shape(){
        numSides = 0;
        regular = false;
    }

    public Shape(int numero){
        numSides = numero;
    }
    public int getNumberSides(){
        return numSides;
    }
    public void setNumberSides(int numero){
        numSides = numero;
    }
    
}