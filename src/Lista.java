public class Lista {
    public int qtd;
    public Contato inicio;
    public Contato fim;
    public int contador;

    public void listar(){
        Contato aux = this.inicio;
        for (int i=0; i<this.qtd; i++){
            System.out.println("Nome: "+aux.getNome());
            System.out.println("Endereço: "+ aux.getEndereco());
            System.out.println("Profissao: "+aux.getProfissao());
            aux.email.listar();
            aux.telefones.listar();
        }
    }

    public boolean addInicio (Contato c){
        if (this.inicio == null){
            this.inicio = c;
            this.fim = c;
            this.qtd ++;
            this.contador++;
            return true;
        } else {
            c.proximo = this.inicio;
            inicio.anterior = c;
            this.inicio = c;
            this.qtd++;
            this.contador++;
            return true;
        }

    }
    public boolean addFim(Contato c){
        if (this.inicio == null){
            return addInicio(c);

        }else{
            this.fim.proximo = c;
            c.anterior = this.fim;
            this.fim = c;
            this.qtd++;
            return true;
        }
    }

    public boolean addPosicao(Contato c, int p){
        if(this.inicio==null || p<=0){
            return addInicio(c);
        }
        if(p>=this.qtd){
            return addFim(c);
        }
        Contato aux = this.inicio;
        for(int i=0;i<p;i++){
            aux=aux.proximo;
        }
        c.anterior=aux.anterior;
        aux.anterior.proximo=c;
        c.proximo=aux;
        this.qtd++;
        return true;
    }

    public boolean addOrdem(Contato c){
        int tamanho=0;
        Contato aux=this.inicio;

        if(this.inicio==null){
            return addInicio(c);
        }
        while(c.getNome().compareTo(aux.getNome()) >= 0 && tamanho != this.qtd){
            aux = aux.getProximo();
            tamanho++;
            if(tamanho == this.qtd)
                return addFim(c);
        }
        return addPosicao(c, tamanho);

    }



}
