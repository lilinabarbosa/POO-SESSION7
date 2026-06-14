public class MainAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal(60, 5, 10);
        System.out.printf("Animal #1 tem uma velocidade de %.2f.%n", a1.getSpeed());
        System.out.printf("Animal #2 tem uma velocidade de %.2f.%n", a2.getSpeed());
    }
}
    

