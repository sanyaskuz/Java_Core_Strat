package Enum;

public enum Animal {
    DOG("Пес"), CAT("Кіт"), FROG("Жаба");
    //new DOG("Пес");
    private  String translation;
      Animal(String translation) {
        this.translation = translation;

    }
    public String getTranslation() {
          return translation;
    }
    public String toString(){
          return "переклад на Укр. " +  translation;
    }
}
