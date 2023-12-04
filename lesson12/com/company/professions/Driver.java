package lesson12.com.company.professions;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                '}';
    }
}
