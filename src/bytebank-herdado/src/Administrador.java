
public class Administrador extends FuncionarioAutenticavel {
   
        int senha = 2222;
        
        public void setSenha(int senha) {
            this.senha = senha;
        }
        
    
    @Override
    public double getBonificacao() {
        return 50;
    }

}
