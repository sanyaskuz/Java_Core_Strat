package main;

public class Main {
    public static void main(String[] args){
    Person person1 = new Person();
    person1.setName("Sanya");
//    person1.age = 23;
//    person1.speak();
        person1.setName("");
        person1.setAge(23);
        person1.speak();


//        main.Person person2 = new main.Person();
////        person2.name = "Anya";
////        person2.age = 21;
//        person2.speak();

    }
}
class Person{
    private String name;
     private  int age;

    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Not word");
        }else {
            this.name = userName;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int userAge){
        if (userAge < 0){
            System.out.println("Age not < 0");
        }else {
            this.age = userAge;
        }

    }
    public int getAge(){
        return this.age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name: " + name + ", I am: " + age + " year old");
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
