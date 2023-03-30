package lesson_5;

public class Lesson20 {
    public static void main(String[] ars){
        Human human1 = new Human("sanya", 25);
        Human human2 = new Human("anya", 33);
        human2.printNumberPeople();
        human1.printNumberPeople();
        Human human3 = new Human("d", 232);
        human2.printNumberPeople();
        human1.printNumberPeople();
        human3.printNumberPeople();




    }
}
class Human{
    private String name;
    private int age;
    private static int countPeople;

//    public Human(){
//        System.out.println("Hello one const");
//        this.age = 0;
//        this.name = "start";
//    }

//    public  Human(String name){
//        System.out.println("Hello two const");
//        this.name = name;
//    }
    public  Human(String name , int age){
        this.age = age;
        this.name = name;
        countPeople++;
    }
//    public void setName(String userName){
//        if(userName.isEmpty()){
//            System.out.println("Not word");
//        }else {
//            this.name = userName;
//        }
//    }
//    public void setAge(int userAge){
//        if (userAge < 0){
//            System.out.println("Age not < 0");
//        }else {
//            this.age = userAge;
//        }
//
//    }
//    public void getAllHuman(){
//        System.out.println("name" + name + ", Age " + age + " , Description " + description);
//
//    }

//    public static void grintAllFriends(){
//        System.out.println(description);
//    }

    public void printNumberPeople(){
        System.out.println("Number of people :" + countPeople);
    }



}
