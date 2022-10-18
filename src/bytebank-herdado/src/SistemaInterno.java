
public class SistemaInterno {
    
    int senha = 2222;
    
    public void autentica (Autenticavel fa) {
        
        boolean autenticou = fa.autentica(this.senha);
        
        if(autenticou) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Senha inválida!");
        }
    }

}
