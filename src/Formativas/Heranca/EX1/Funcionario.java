package Formativas.Heranca.EX1;

public class Funcionario {

    private String name;
    private double wage;

    public Funcionario(String name, double wage){
        this.name = name;
        this.wage = wage;
    }

    public void addRaise(double amount){

    }

    public double anualWage(){
        return wage * 12;
    }

    public void showData(){
        System.out.print(wage);
    }
}
