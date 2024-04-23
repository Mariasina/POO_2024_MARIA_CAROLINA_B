package Formativas.InterfaceEAbstracao.EX5;

public class Usuario implements Autenticavel{

    @Override
    public String autenticar() {
        return "O Usuário foi autenticado!";
    }
}
