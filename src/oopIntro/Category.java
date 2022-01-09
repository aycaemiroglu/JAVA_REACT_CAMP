package oopIntro;

public class Category {
    private int id;
    private String name;

    public Category(){
        System.out.println("category");
    }

    public Category(int id, String name) {
        this();  //parametresiz contructerı çalıştırır
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}