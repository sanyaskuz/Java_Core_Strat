package lesson_8;

public class Lesson_8 {
   public static void main(String[] args){

      Human h1 = new Human("Bob", 21);
      System.out.println(h1.toString());
   }
}
class Human {
   private String name;
   private  int age;
   public Human(String name, int age){
      this.name = name;
      this.age = age;
   }
   public  String toString(){
      return name + " , " + age;
   }
}
