import java.util.Arrays;

public final class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;


    public Dog(String name, String breed,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, String[] commands,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColorEnum(colorEnum);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Гав гав");
    }

    public void makeVoice(String voice){

        System.out.println(voice);
    }
}
