    public class Caixa{
    public String numeroSerie;
    public int quantidadeObjetosArmazenados;
    public int valorTotalItens;
    public String nomeFuncionarioResposavel;


    public Caixa(String numeroSerie, String nomeFuncionarioResposavel, int valorTotalItens){
        this.numeroSerie = numeroSerie;
        this.nomeFuncionarioResposavel = nomeFuncionarioResposavel;
        this.valorTotalItens = valorTotalItens;
}

    public String getNumeroSerie(){
        return this.numeroSerie;
    }
    public String getNomeFuncionarioResponsavel(){
        return this.nomeFuncionarioResposavel;
    }
    public int getValorTotalItens(){
        return valorTotalItens;
    }

    public int quantidadeObjetosArmazenados(){
        return quantidadeObjetosArmazenados;
    }
    
        public void adicionarObjeto(Objeto objeto){
            quantidadeObjetosArmazenados++;  }
       
    }


