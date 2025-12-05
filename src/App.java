public class App {
    public static void main(String[] args) throws Exception {


        
        Clock bostonClock = new Clock();
        Clock LAClock = new Clock();

        bostonClock.setTime(12, 30, 17);
        System.out.println("The time in Boston: " + bostonClock.timeOfDay());
        LAClock.setTime(3, 30, 17);
        System.out.println("The time in LA: " + LAClock.timeOfDay());

    }
}
