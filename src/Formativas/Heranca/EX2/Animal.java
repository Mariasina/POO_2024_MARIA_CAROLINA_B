package Formativas.Heranca.EX2;

public class Animal {
    private String name;
    private String breed;

    public Animal (){
        this.name = name;
        this.breed = breed;
    }

    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String bedTime(){
        return "Hora da caminha!";
    }

}
