package Revisao_Avaliacao.EX2;

public class Banco {
    private Integer account_number;
    private String name;
    private Double balance;

    public Banco(Integer account_number, String name, Double balance){
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }

    public Integer getAccount_number(){
        return account_number;
    }

    public void setAccount_number(Integer account_number){
        this.account_number = account_number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getBalance(){
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public boolean withdraw(Double value){
        if(this.balance > value) {
            this.balance -= value;
            return true;
        }else {
            return false;
        }
    }

    public void deposit(Double value){
        this.balance += value;
    }
}
