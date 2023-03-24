package assessment;

import java.util.Arrays;
import java.util.Scanner;

public class Friday {

    public static void printName(){
        System.out.println("Angel Borja");
    }

    public static void greetUser(String username){
        System.out.println("Welcome to my website " + username);
    }

    public static void buyCoffee(int dollars) {
        int priceOfCoffee = 1;
        System.out.println(dollars - priceOfCoffee);
    }

    public static String myHobbies(String hobbies){

        return hobbies;

    }

    public static void checkWeather(String weatherCondition, int temperature){

        String hot = null;
        String cool = null;
        String cold = null;

        if (weatherCondition == hot && temperature > 80){
            System.out.println("Wear shorts");
        }else if (weatherCondition == cool && temperature > 50 && temperature < 80){
            System.out.println("Wear wind breakers");
        }else if (weatherCondition == cold && temperature < 50){
            System.out.println("Wear a jacket");
        }else System.out.println("No such weather condition");
    }


    public static void main(String[] args) {

        String hobbies[] = {"lifting weights", "playing games", "longboarding"};

        printName();
        greetUser("Angel");
        buyCoffee(13);
        System.out.println(Arrays.toString(hobbies));
        checkWeather("hot", 60);

        Scanner userInput = new Scanner(System.in);

        String hakeem;

        System.out.println("What is your name?");
        String username = userInput.nextLine();
        if(userInput.nextLine() == "Hakeem"){
            System.out.println("Hello " + username);
        }else System.out.println("What is your name?");





    }
}
