package projects.project_09_Survey;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        ArrayList<Participant> participants = new ArrayList<>();
        int youngest = Integer.MAX_VALUE, oldest = 0;

        do{
            System.out.println(SurveyQuestions.askToJoin);
            String join = inputReader.next();

            if(join.toUpperCase().startsWith("Y")){

                Participant.addParticipants();

                // Ask your questions to get name, age gender
                System.out.println(SurveyQuestions.askName);
                String name = inputReader.next();

                System.out.println(SurveyQuestions.askAge);
                int age = inputReader.nextInt();

                System.out.println(SurveyQuestions.askGender);
                String gender = inputReader.next();

                Participant participant = new Participant(name, age, gender);
                participants.add(participant);

                if(gender.toUpperCase().startsWith("M")) Participant.addMaleParticipants();
                else Participant.addFemaleParticipants();

            }

        }while(Participant.totalNumberOfParticipants < 3);

        for (Participant participant : participants) {
            System.out.println(participant);
            if(participant.age > oldest) oldest = participant.age;
            if(participant.age < youngest) youngest = participant.age;
        }
        System.out.println("The total number of male participants = " + Participant.totalNumberOfMaleParticipants);
        System.out.println("The total number of female participants = " + Participant.totalNumberOfFemaleParticipants);
        System.out.println("The age of the youngest person is = " + youngest);
        System.out.println("The age of the oldest person is = " + oldest);
    }
}
