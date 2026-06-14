public class Instrumento {
    protected boolean emPromocao;
    protected double preco;
    protected int quantidadeEstoque;

    // Construtor
    public Instrumento() {
        this.emPromocao = false;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    public double getPreco() {
        if (emPromocao) {
            return preco * 0.85;
        }
        return preco;
    }
    public double aplicarDescontoFuncionario() {
        return preco * 0.75;
    }

    public void setEmPromocao(boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    public boolean getEmPromocao() {
        return emPromocao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque = quantidade;
    }

    public class InstrumentoCordas extends Instrumento {
        protected int numCordas;
        public int getNumCordas() {
            return numCordas;
        }

        public void setNumCordas(int numCordas) {
            this.numCordas = numCordas;
        }
        
            public class Guitarra extends InstrumentoCordas {
                private boolean eletrica;

                public boolean isEletrica() {
                    return eletrica;
                }

                public void setEletrica(boolean eletrica) {
                    this.eletrica = eletrica;
                }
            }
    }
}