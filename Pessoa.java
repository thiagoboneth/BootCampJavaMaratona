public class Pessoa {
    int rg;
    String nome;
    String sobrenome;
    int idade;
    String telefoneCelular;
    String telefoneEmergencia;
    String grupoSanguineo;
    int inscricao;
    double valorInscricao;

    public Pessoa(int rg, String nome, String sobrenome,int idade, String telefoneCelular, String telefoneEmergencia, String grupoSanguineo) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefoneCelular = telefoneCelular;
        this.telefoneEmergencia = telefoneEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "rg=" + rg +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", telefoneCelular='" + telefoneCelular + '\'' +
                ", telefoneEmergencia='" + telefoneEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", inscricao=" + inscricao +
                ", valorInscricao=" + valorInscricao +
                '}';
    }
}
