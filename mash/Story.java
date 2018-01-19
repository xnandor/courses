
public class Story {

    public String[] houses;
    public String[] locations;
    public String[] partners;
    public String[] cars;
    public String[] jobs;
    public String[] payments;

    public String house;
    public String location;
    public String partner;
    public String car;
    public String job;
    public String payment;

    public void tellStory() {
        System.out.println("Telling Story");
        if (house != null) {
            System.out.println(house);
        }
    }
    
}

