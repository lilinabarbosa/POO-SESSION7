public class Fish {
    private String typeOfFish = " ";
    private String nameOfFish = " ";
    private int friendliness;

    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    public Fish(String t, String u, int f) {
        this.typeOfFish = t;
        this.nameOfFish = u;
        this.friendliness = f;
    }

    public int getFriendliness() {
        return friendliness;
    }

    // Getter para o nome do peixe
    public String getName() {
        return nameOfFish;
    }

    public static Fish nicestFish(Fish... peixes) {
        Fish temp = peixes[0];
        for (int i = 1; i < peixes.length; i++) {
            if (peixes[i].getFriendliness() > temp.getFriendliness()) {
                temp = peixes[i];
            }
        }
        return temp;
    }

    
    public static class MainFish {
        public static void main(String[] args) {
            Fish peixe1 = new Fish("Amber", "AngelFish", 5);
            Fish peixe2 = new Fish("James", "Guppy", 3);

            Fish maisSimpatico = Fish.nicestFish(peixe1, peixe2);
            System.out.println("O mais simpático é: " + maisSimpatico.getName());
        }
    }
}