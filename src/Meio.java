import java.util.Scanner;

public class Meio {
    Scanner teclado= new Scanner(System.in);

    public Meio proximo;
    private String dado;
    private String tipo;

    public Meio getProximo() {
        return proximo;
    }

    public void setProximo(Meio proximo) {
        this.proximo = proximo;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void ler(){
        System.out.print("Digite o dado: ");
        this.setDado(teclado.next());
    }
}
