//transformando classe em uma INTERFACE


//Contrato Autenticavel
    //Quem assina este contrato , precisa implementar
        //metodos setsenha
        //metodo autentica

public abstract interface Autenticavel {
    
    public abstract void setSenha(int senha);
    
    
    public abstract boolean autentica(int senha);
}

//eliminamos todas os métodos concretos, pois a caracteristica de um interface
//é ter tanto a classse qunatos seus atributos abstratos;
