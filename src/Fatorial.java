public class Fatorial {
    public int num; 
    public int getFactorial() {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public String toString() {
        StringBuilder resultado = new StringBuilder();
        resultado.append("Factorial: ").append(num).append("! = ");
        
        for (int i = 1; i <= num; i++) {
            resultado.append(i);
            if (i < num) {
                resultado.append(" * ");
            }
        }
        resultado.append(" = ").append(getFactorial());
        
        return resultado.toString();
    }

}