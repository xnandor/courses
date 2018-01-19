import java.util.Scanner;

public class Pen {

    private String writePart(String[] parts) {
        if (parts != null) {
            int choseIndex = (int)(Math.random()*(parts.length));
            if (choseIndex >= 0 && choseIndex < parts.length) {
                return parts[choseIndex];
            }
        }
        return "________";
    }
    
    public void writeStory(Story story) {
        story.house = writePart(story.houses);
        story.location = writePart(story.locations);
        story.partner = writePart( story.partners);
        story.car = writePart(story.cars);
        story.job = writePart(story.jobs);
        story.payment = writePart(story.payments);
    }

    public String[] fillQuestion(String question, String[] answers, int numAnswers) {
        System.out.println(question);
        answers = new String[numAnswers];
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        for (int i = 0; i < numAnswers; i++) {
            System.out.print("" + (i+1) + ". ");
            answers[i] = scanner.next();
        }
        return answers;
    }
    
}
