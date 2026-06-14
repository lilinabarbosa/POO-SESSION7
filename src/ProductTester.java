import java.util.Scanner;
public class ProductTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSize = getNumProducts(sc);
        Produto[] inv = new Produto[maxSize];
        addToInventory(inv, sc);
        displayInventory(inv);
        sc.close();
    }

    public static void displayInventory(Produto[] p) {
        System.out.println("\n=== LISTA DE PRODUTOS ===\n");
        for (Produto prod : p) {
            if (prod != null) {
                System.out.println(prod);
                System.out.println();
            }
        }
    }

    public static void addToInventory(Produto[] p, Scanner sc) {
        int stockChoice = -1;
        for (int i = 0; i < p.length; i++) {
            while (stockChoice < 1 || stockChoice > 2) {
                System.out.println("\n1: CD\n2: DVD");
                System.out.print("Insira o tipo de produto: ");
                stockChoice = sc.nextInt();
                if (stockChoice < 1 || stockChoice > 2)
                    System.out.println("Somente os números 1 ou 2 são permitidos!");
            }
            if (stockChoice == 1)
                addCDToInventory(p, sc, i);
            else
                addDVDToInventory(p, sc, i);
            stockChoice = -1; // reset
        }
    }

    public static void addCDToInventory(Produto[] p, Scanner sc, int i) {
        sc.nextLine(); // limpa buffer
        System.out.print("Insira o nome do CD: ");
        String nome = sc.nextLine();
        System.out.print("Insira o nome do artista: ");
        String artista = sc.nextLine();
        System.out.print("Insira o nome do selo de gravação: ");
        String selo = sc.nextLine();
        System.out.print("Insira o número de músicas: ");
        int numMusicas = sc.nextInt();
        System.out.print("Insira a quantidade em estoque: ");
        int qtd = sc.nextInt();
        System.out.print("Insira o preço: ");
        double preco = sc.nextDouble();
        System.out.print("Insira o número do item: ");
        int numero = sc.nextInt();
        p[i] = new CD(numero, nome, qtd, preco, artista, numMusicas, selo);
    }

    public static void addDVDToInventory(Produto[] p, Scanner sc, int i) {
        sc.nextLine();
        System.out.print("Insira o nome do DVD: ");
        String nome = sc.nextLine();
        System.out.print("Insira o nome do estúdio cinematográfico: ");
        String estudio = sc.nextLine();
        System.out.print("Insira a classificação etária: ");
        int classificacao = sc.nextInt();
        System.out.print("Insira a duração em minutos: ");
        int duracao = sc.nextInt();
        System.out.print("Insira a quantidade em estoque: ");
        int qtd = sc.nextInt();
        System.out.print("Insira o preço: ");
        double preco = sc.nextDouble();
        System.out.print("Insira o número do item: ");
        int numero = sc.nextInt();
        p[i] = new DVD(numero, nome, qtd, preco, duracao, classificacao, estudio);
    }

    public static int getNumProducts(Scanner sc) {
        System.out.print("Quantos produtos? ");
        return sc.nextInt();
    }
}


