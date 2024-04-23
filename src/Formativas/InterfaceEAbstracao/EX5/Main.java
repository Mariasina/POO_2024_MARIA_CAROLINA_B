package Formativas.InterfaceEAbstracao.EX5;

public class Main {
    public static void main(String[] args) {
        Administrador user1 = new Administrador();
        Usuario user2 = new Usuario();

        System.out.println(user1.autenticar());
        System.out.println(user2.autenticar());
    }
}
