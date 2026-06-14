import java.util.Date; 
public class Pessoa { 
    private String firstName; 
    private String middleName; 
    private String lastName; 
    private Date dateOfBirth; 
  
    public Pessoa(String firstName, String middleName, 
        String lastName, Date dateOfBirth){ 
        this.firstName = firstName; 
        this.middleName = middleName; 
        this.lastName = lastName; 
        this.dateOfBirth = dateOfBirth; 
    } 

    public String getFirstName(){ 
        return firstName; 
    } 
 
    public String getMiddleName(){ 
        return middleName; 
    } 
 
    public String getLastName(){ 
        return lastName; 
    } 
 
    public String getName(){ 
        return firstName + " " + middleName + " " + lastName; 
    } 
 
    public Date getDateOfBirth(){ 
        return dateOfBirth; 
    } 

        public class Aluno extends Pessoa {
            private String id;
            private double media;
            private String curso;
            private String diploma; 
            private int anoFormatura;

        public Aluno(String primeiroNome, String nomeMeio, String ultimoNome, Date dataNasc,
        String id, String curso, String diploma, int anoFormatura) {
            super(primeiroNome, nomeMeio, ultimoNome, dataNasc);
            this.id = id;
            this.curso = curso;
            this.diploma = diploma;
            this.anoFormatura = anoFormatura;
            this.media = 0.0;
        }

        public String getId() { return id; }
        public double getMedia() { return media; }
        public String getCurso() { return curso; }
        public String getDiploma() { return diploma; }
        public int getAnoFormatura() { return anoFormatura; }
        
        public void mudarCurso(String novoCurso) {
            this.curso = novoCurso;
        }
        public double calcularMedia(String[] notas) {
            double soma = 0;
            for (String n : notas) {
                if (n.equals("A")) soma += 4;
                else if (n.equals("A-")) soma += 3.67;
                else if (n.equals("B+")) soma += 3.33;
                else if (n.equals("B")) soma += 3;
                else if (n.equals("B-")) soma += 2.67;
                else if (n.equals("C+")) soma += 2.33;
                else if (n.equals("C")) soma += 2;
                else if (n.equals("D")) soma += 1;
                else if (n.equals("F")) soma += 0;
            }
            this.media = soma / notas.length;
            return this.media;
        }
    }
} 
 
