public class Main {
    public static void main(String[] args) {
        Shelter shelter1 = new Shelter("Dog House", "14 Street");
        Dog dog1 = new Dog("Lux", "Labrador", ColorEnum.GRAY, shelter1);
        System.out.println(dog1.getInfo());
        System.out.println("---------------");

        Shelter shelter2 = new Shelter("Safe Animals", "45 Street");
        Dog dog2 = new Dog("Volt", "German Shepherd", new String[]{"Run", "Fetch"}, ColorEnum.BROWN, shelter2);
        System.out.println(dog2.getInfo());
        System.out.println("---------------");

        Shelter shelter3 = new Shelter("Safe Paws", "79 Street");
        Dog dog3 = new Dog("Max", "Bulldog", new String[]{"Run", "Jump"}, ColorEnum.WHITE, shelter3);
        System.out.println(dog3.getInfo());
        System.out.println("---------------");


        String[] commands = {"Sit", "Run"};
        Shelter shelter = new Shelter("Peace",
                "Street Walls number 1");
        Dog dog = new Dog("Rex", "Put-bull", commands,
                ColorEnum.BROWN, shelter);
        System.out.println(dog.getInfo());

        dog.makeVoice();
        dog.makeVoice("Гув гув");
        dog.makeVoice("Гив гив");

    }
}