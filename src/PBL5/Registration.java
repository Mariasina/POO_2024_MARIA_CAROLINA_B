package PBL5;

public class Registration {

    private String name;
    private int age;
    private String email;
    private int type;

    public Registration(String name, int age, String email, int type){
        this.name = name;
        this.age = age;
        this.email = email;
        this.type = type;
    }

    public String getNome(){
        return name;
    }

    public void setNome(String name){
            this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type = type;
    }


}
