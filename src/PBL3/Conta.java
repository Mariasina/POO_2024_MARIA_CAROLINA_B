package PBL3;
import java.util.ArrayList;

public class Conta {
    String nome;
    int numero;
    Double saldo;

    boolean sacar(Double valor){
        if(this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
    boolean depositar(Double valor){
        this.saldo += valor;
        return true;
    }
}
