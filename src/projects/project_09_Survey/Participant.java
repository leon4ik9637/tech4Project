package projects.project_09_Survey;

public class Participant {
    public Participant(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static int totalNumberOfParticipants;
    public static int totalNumberOfMaleParticipants;
    public static int totalNumberOfFemaleParticipants;

    public String name;
    public int age;
    public String gender;

    public static void addParticipants(){
        totalNumberOfParticipants += 1;
    }
    public static void addMaleParticipants(){
        totalNumberOfMaleParticipants += 1;
    }
    public static void addFemaleParticipants(){
        totalNumberOfFemaleParticipants += 1;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
