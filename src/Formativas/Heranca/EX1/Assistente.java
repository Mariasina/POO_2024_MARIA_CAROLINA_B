package Formativas.Heranca.EX1;

public class Assistente extends Funcionario{
    private int registration_num;

    public Assistente(String name, double wage, int registration_num){
        super(name, wage);
        this.registration_num = registration_num;
    }

    public int getRegNum(){
        return registration_num;
    }

    public void setRegNum(int registration_num){
        this.registration_num = registration_num;
    }

    @Override
    public void showData(){
        System.out.println(registration_num);
    }
}
