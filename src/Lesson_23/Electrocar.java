package Lesson_23;

public class Electrocar {
    private int id;
//  Вкладений нестатичний класс
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id + " is starting...");
        }
    }
//    Статичний класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charge..");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }
    public  void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar " + id + " is starting..");
    }
}

