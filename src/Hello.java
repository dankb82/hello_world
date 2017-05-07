/**
 * Created by Daniel on 5/7/17.
 */
public class Hello {
    public static void main(String[] args) {
        String firstName = "Daniel";
        System.out.println("Hello " + firstName);

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int difference = 1000 - myTotal;

        System.out.println(difference);
    }
}
