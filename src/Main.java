public class Main {

    public static void main(String[] args) {
        Contato contato = new Contato();
        Contato contato2 = new Contato();
        Contato contato3 = new Contato();
        Contato contato4 = new Contato();
        contato.ler();
        contato2.ler();
        contato3.ler();
        contato4.ler();
        Lista agenda = new Lista();

        agenda.addOrdem(contato);
        agenda.addOrdem(contato2);
        agenda.addOrdem(contato3);
        agenda.addOrdem(contato4);
        agenda.listar();

    }




}
