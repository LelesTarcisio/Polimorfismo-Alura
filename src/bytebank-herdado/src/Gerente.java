//Gerente é um funcionario e herda a classe Funcionario
//Gerente também assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil(); // não entendi o motivo de criar um construtor
    }

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha); // ????????????????????

    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha); // ??????????????????????????
    }

}
