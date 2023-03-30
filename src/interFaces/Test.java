package interFaces;

public class Test {
    public static void main(String[] args){
//       info info1 = new Animal(1);
//       info info2 = new Person("Bob");
//       info1.showInfo();
//       info2.showInfo();
//
//        outputInfo(info1);
//        outputInfo(info2);
       Animal animal = new Animal(1);
       Person person = new Person("bob");
        outputInfo(animal);
        outputInfo(person);


    }
    public static void outputInfo(info info){
        info.showInfo();
    }
}
