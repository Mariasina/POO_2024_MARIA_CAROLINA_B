package Formativas.InterfaceEAbstracao.EX5;

public class Administrador implements Autenticavel{

    @Override
    public String autenticar() {
        return "O Administrador foi autenticado!";
    }
}
