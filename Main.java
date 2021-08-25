import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> atletas = new ArrayList<>();

        atletas.add(new Pessoa(303825230,"Luis","Botineli",28,"489665234576", "498405582","O+"));
        atletas.add(new Pessoa(203826490,"Carlos","Santos",17,"489665234576", "498405582","O+"));
        atletas.add(new Pessoa(503825230,"Louise","Dantas",24,"489665234576", "498405582","O+"));

        Maratona maratona = new Maratona();
        maratona.inscricao(atletas.get(0),"Avancado");

        maratona.listaInscrito("Avancado");

        maratona.remocao(atletas.get(0).inscricao, "Avancado");

        maratona.listaInscrito("Avancado");
    }
}
