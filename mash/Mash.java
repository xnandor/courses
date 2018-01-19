import java.util.Scanner;

public class Mash {
    public static void main(String[] args) {
        int listSize = 4;
        Story story = new Story();
        Pen pen = new Pen();
        story.houses = pen.fillQuestion("What houses could you live in?", story.houses, listSize);
        story.houses = pen.fillQuestion("Where could you live?", story.locations, listSize);
        story.houses = pen.fillQuestion("Who could you marry??", story.partners, listSize);
        story.houses = pen.fillQuestion("What type of car could you drive?", story.cars, listSize);
        story.houses = pen.fillQuestion("What would your job be?", story.jobs, listSize);
        story.houses = pen.fillQuestion("How do you recieve payment for your work?", story.payments, listSize);
        pen.writeStory(story);
        story.tellStory();
    }
}


