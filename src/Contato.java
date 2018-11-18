import java.util.Scanner;

public class Contato {
    Scanner teclado= new Scanner(System.in);

    private String nome;
    private String endereco;
    private String profissao;
    public Contato proximo;
    public Contato anterior;

    public ListaMeio email;
    public ListaMeio telefones;

    public Contato(){
        email=new ListaMeio();
        telefones=new ListaMeio();
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Contato getProximo() {
        return proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }

    public Contato getAnterior() {
        return anterior;
    }

    public void setAnterior(Contato anterior) {
        this.anterior = anterior;
    }

    public boolean pergunta(){
        System.out.print("deseja adicionar mais(s/n)?");
        String resp= teclado.next();
        if (resp.equals("s")){
            return true;
        }else {
            return false;
        }
    }

    public void ler(){
        System.out.print("Digite o nome: ");
        this.setNome(teclado.next());
        /**System.out.println("Digite Endereço: ");
        this.setEndereco(teclado.next());
        System.out.println("Digite a Profissao: ");
        this.setProfissao(teclado.next());**/
        do {
            Meio mail= new Meio();
            mail.ler();
            email.add(mail);
        }while (this.pergunta());
        do {
            Meio fone= new Meio();
            fone.ler();
            telefones.add(fone);
        }while (this.pergunta());

    }
}
