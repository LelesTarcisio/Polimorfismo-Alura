
public class TesteSistema {
    
    public static void main(String[] args) {
        
        Autenticavel gerente = new Gerente(); //polimosfismo usando uma class generica de autenticação
        gerente.setSenha(2222);
        
        Autenticavel adm = new Administrador();
        adm.setSenha(15);
        
        SistemaInterno si = new SistemaInterno();
        si.autentica(gerente);
        si.autentica(adm);
       
    }

}
