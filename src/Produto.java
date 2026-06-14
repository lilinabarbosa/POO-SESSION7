public class Produto {
    private int numero;
    private String nome;
    private int unidades;
    private double preco;

    public Produto() {
        this(0, "", 0, 0.0);
    }

    public Produto(int numero, String nome, int unidades, double preco) {
        this.numero = numero;
        this.nome = nome;
        this.unidades = unidades;
        this.preco = preco;
    }

    public int getNumeroItem() { return numero; }
    public String getNomeProduto() { return nome; }
    public int getUnidadesEstoque() { return unidades; }
    public double getPrecoUnitario() { return preco; }

    public void setNumeroItem(int numero) { this.numero = numero; }
    public void setNomeProduto(String nome) { this.nome = nome; }
    public void setUnidadesEstoque(int unidades) { this.unidades = unidades; }
    public void setPrecoUnitario(double preco) { this.preco = preco; }

    public double calcularValorEstoque() {
        return preco * unidades;
    }

    
    public String toString() {
        return "Número do Item       : " + numero + "\n" +
               "Nome                 : " + nome + "\n" +
               "Quantidade em estoque: " + unidades + "\n" +
               "Preço                : " + preco;
    }


    public class DVD extends Produto {
        private int duracao;      
        private String estudio;

        public DVD(int numero, String nome, int unidades, double preco,
                int duracao, int classificacao, String estudio) {
            super(numero, nome, unidades, preco);
            this.duracao = duracao;
            this.estudio = estudio;
        }

        public int getDuracao() { return duracao; }
        public String getEstudio() { return estudio; }

        public void setDuracao(int d) { duracao = d; }
        public void setEstudio(String e) { estudio = e; }
        public double calcularValorEstoque() {
            return super.calcularValorEstoque() * 1.05; 
        }
        public String toString() {
            return "Número do Item       : " + getNumeroItem() + "\n" +
                "Nome                 : " + getNomeProduto() + "\n" +
                "Duração do Filme     : " + duracao + "\n" +
                "Estúdio Cinematográfico: " + estudio + "\n" +
                "Quantidade em estoque: " + getUnidadesEstoque() + "\n" +
                "Preço                : " + getPrecoUnitario() + "\n" +
                "Valor do Estoque     : " + calcularValorEstoque() + "\n" +
                "Status do Produto    : Ativo";
        }
    }
    public class CD extends Produto {
        private String artista;
        private int numMusicas;
        private String selo;

        public CD(int numero, String nome, int unidades, double preco,
                String artista, int numMusicas, String selo) {
            super(numero, nome, unidades, preco);
            this.artista = artista;
            this.numMusicas = numMusicas;
            this.selo = selo;
        }

        public String getArtista() { return artista; }
        public int getNumMusicas() { return numMusicas; }
        public String getSelo() { return selo; }

        public void setArtista(String a) { artista = a; }
        public void setNumMusicas(int n) { numMusicas = n; }
        public void setSelo(String s) { selo = s; }

        public String toString() {
            return "Número do Item       : " + getNumeroItem() + "\n" +
                "Nome                 : " + getNomeProduto() + "\n" +
                "Artista              : " + artista + "\n" +
                "Músicas do Álbum     : " + numMusicas + "\n" +
                "Selo de gravação     : " + selo + "\n" +
                "Quantidade em estoque: " + getUnidadesEstoque() + "\n" +
                "Preço                : " + getPrecoUnitario() + "\n" +
                "Valor do Estoque     : " + calcularValorEstoque() + "\n" +
                "Status do Produto    : Ativo";
        }
    }
}