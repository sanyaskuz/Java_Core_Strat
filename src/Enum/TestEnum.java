package Enum;



public class TestEnum {

    public static void main(String[] args) {
//        Animal animal = Animal.DOG;
//        System.out.println(animal);

//
//        switch (animal) {
//            case CAT:
//                System.out.println("It`s a Cat");
//                break;
//            case DOG:
//                System.out.println("It`s a Dog");
//                break;
//
//        }

//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());
//        Object --> Enum --> Season

//        System.out.println(season.getClass());
//
//        switch (season) {
//            case SUMMER:
//                System.out.println("It`s warm outside");
//                break;
//            case WINTER:
//                System.out.println("It`s cold outside");
//                break;
//
//        }

        Season season = Season.WINTER;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());



    }
}
