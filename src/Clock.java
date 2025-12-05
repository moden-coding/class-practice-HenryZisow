public class Clock {
    //Micah's project

    private int seconds;
    private int minutes;
    private int hours;

    public void setTime(int givenHours, int givenMinutes, int givenSeconds) {
        hours = givenHours;
        minutes = givenMinutes;
        seconds = givenSeconds;
    }

    public String timeOfDay() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
