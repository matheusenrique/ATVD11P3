public class Diretor extends Funcionario {
    private String segTurno;

    

    public Diretor(String nome, String inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }

    public void criarDesconto(){

    }

    public void encomendarFardas(){

    }

    public void gerenciarProfessores(){

    }
}
