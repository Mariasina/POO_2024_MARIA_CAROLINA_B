package Revisao_Avaliacao.EX1;

public class Pessoa {
    String name;
    int age;
    String adress;

    public Pessoa(String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
}
