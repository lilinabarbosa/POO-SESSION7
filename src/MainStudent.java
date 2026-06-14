public class MainStudent {

    public static void main(String[] args) {
        
        Student maryJones = new Student("Mary Jones", 14, 46);
        Student johnStiner = new Student("John Stiner", 60, 173);
        Student ariSamala = new Student("Ari Samala", 31, 69);

        System.out.println("ANTES");
        System.out.println("Ari Samala - Créditos: " + ariSamala.getCreditos() +
                           ", Pontos qualidade: " + ariSamala.getPontosqualidade() +
                           ", Média: " + ariSamala.getMedia());

        ariSamala.atualizapontos(13, 52);

        
        System.out.println("\nDEPOIS");
        System.out.println("Ari Samala - Créditos: " + ariSamala.getCreditos() +
                           ", Pontos qualidade: " + ariSamala.getPontosqualidade() +
                           ", Média: " + ariSamala.getMedia());
    }
}
