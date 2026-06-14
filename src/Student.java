public class Student {

    private String nome;         
    private double creditos;         
    private double media;
    private double pontosqualidade;

    public Student(String nome, int creditos, double pontosqualidade) {
        this.nome = nome;
        this.creditos = creditos;
        this.pontosqualidade = pontosqualidade;
        this.media = 0.0;
    }

    public double calculamedia(){
        if (this.creditos > 0) {
            this.media = this.pontosqualidade / this.creditos;
        }
        return this.media;
    }

    public void atualizapontos(int creditos, double pontosqualidade) {
    
        this.creditos += creditos;
        this.pontosqualidade += pontosqualidade;
        calculamedia();
    }


      public String getNome() {
        return nome;
    }

    public double getCreditos() {
        return creditos;
    }

    public double getMedia() {
        return media;
    }

    public double getPontosqualidade() {
        return pontosqualidade;
    }
}

