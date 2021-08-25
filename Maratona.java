import java.util.HashMap;

public class Maratona {
    public HashMap<Integer, Pessoa>circuitoPequeno = new HashMap<>();
    public HashMap<Integer, Pessoa>circuitoMedio = new HashMap<>();
    public HashMap<Integer, Pessoa>circuitoAvancado = new HashMap<>();

    int inscritos = 1;

    public void inscricao(Pessoa atleta, String circuito){
        switch (circuito){
            case "Pequeno":
                if (atleta.idade < 18){
                    System.out.println("Preco de Inscricao $1300 para menor de idade");
                    atleta.inscricao = inscritos++;
                    atleta.valorInscricao = 1300;
                }else {
                    System.out.println("Preco de inscricao $1500");
                    atleta.inscricao = inscritos++;
                    atleta.valorInscricao = 1500;
                }
                circuitoPequeno.put(atleta.inscricao, atleta);
                break;
            case "Medio":
                if (atleta.idade <18){
                    System.out.println("Preco de Inscricao $2000 para menor de idade");
                    atleta.inscricao = inscritos++;
                    atleta.valorInscricao = 2000;
                } else {
                    System.out.println("Preco de Inscricao $2300");
                    atleta.inscricao = inscritos++;
                    atleta.valorInscricao = 2300;
                }
                circuitoMedio.put(atleta.inscricao, atleta);
                break;
            default:
                if (atleta.idade <18){
                    System.out.println("Nao pode participar");
                }else {
                    System.out.println("Preco de inscricao $2800");
                    atleta.inscricao = inscritos++;
                    atleta.valorInscricao = 2800;
                    circuitoAvancado.put(atleta.inscricao, atleta);
                }
                break;
        }
    }
    public void remocao(int inscrito, String circuito){
        switch (circuito){
            case "Pequeno":
                circuitoPequeno.remove(inscrito);
                break;
            case "Medio":
                circuitoMedio.remove(inscrito);
                break;
            default:
                circuitoAvancado.remove(inscrito);
        }
    }
    public void listaInscrito(String circuito){
        switch (circuito){
            case "Pequeno":
                for (int chave:circuitoPequeno.keySet()){
                    System.out.println(circuitoPequeno.get(chave));
                }
                if (circuitoPequeno.size() == 0){
                    System.out.println("Sem inscricoes efetuadas no circuito Pequeno");
                }
                break;
            case "Medio":
                for (int chave:circuitoMedio.keySet()){
                System.out.println(circuitoMedio.get(chave));
            }
                if (circuitoMedio.size() == 0){
                    System.out.println("Sem inscricoes efetuadas no circuito Medio");
                }
                break;
            default:
                for (int chave:circuitoAvancado.keySet()){
                System.out.println(circuitoAvancado.get(chave));
            }
                if (circuitoAvancado.size() == 0){
                    System.out.println("Sem inscricoes efetuadas no circuito Avancado");
                }
                break;

        }
    }
}
