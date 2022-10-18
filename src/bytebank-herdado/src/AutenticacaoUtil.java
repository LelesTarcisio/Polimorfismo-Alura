// tirei a repeticao de codigo das classes gerente, cliente e adm.

public class AutenticacaoUtil {
    
    private int senha;
   
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

}

// ESSA CLASSE FAZ A COMPOSIÇÃO DAS CLASSES ADM, CLIENTE E GERENTE