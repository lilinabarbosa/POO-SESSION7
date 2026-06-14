public class MainCard {
    public static void main(String args[]) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        Card[] maos = new Card[5];
        int total = 0;
        int pontos = 0;

        // duas cartas iniciais
        for (int i = 0; i < 2; i++) {
            int suit = (int)(Math.random() * 4 + 1);
            int face = (int)(Math.random() * 13 + 1);
            maos[total] = new Card(suit, face);
            pontos += maos[total].points;
            System.out.println(maos[total]);
            total++;
        }
        System.out.println("Pontos totais: " + pontos);

        // loop para pedir mais cartas
        while (pontos <= 21 && total < 5) {
            System.out.print("Outra carta? (s/n): ");
            String resp = teclado.nextLine();
            if (resp.equalsIgnoreCase("n")) break;

            int suit = (int)(Math.random() * 4 + 1);
            int face = (int)(Math.random() * 13 + 1);
            maos[total] = new Card(suit, face);
            pontos += maos[total].points;
            System.out.println(maos[total]);
            System.out.println("Total agora: " + pontos);
            total++;
        }

        System.out.println("Fim. Pontuação final: " + pontos);
        teclado.close();
    }
}