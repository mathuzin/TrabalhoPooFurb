public class Municipios {
    private String populacao;
    private String cidade;

    public Municipios(String populacao, String cidade) {
        setPopulacao(populacao);
        setCidade(cidade);
    }

    public int getPopulacao() {
        int number = Integer.parseInt(populacao);
        return number;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){
        return "Cidade: " + getCidade() +
                "Populacao: " + getPopulacao();
    }
}
