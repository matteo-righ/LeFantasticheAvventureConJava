import java.util.Random;
import java.util.Scanner;

public class WarOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfNumbers = scan.nextInt();
        int numberIndex = scan.nextInt();
        scan.close();
        int[] numbers = new int[numberOfNumbers];
        warOfNUmbers(randomizer(numbers, numberOfNumbers, numberIndex));

    }

    public static void warOfNUmbers(int[] evenOrOdd) {
        int counterEvenNumbers = 0;
        int counterOddNumbers = 0;

        for (int q = 0; q < evenOrOdd.length; q++) {

            if (evenOrOdd[q] % 2 == 0) {
                counterEvenNumbers++;
            } else {
                counterOddNumbers++;
            }

        }

        int[] evenNumbers = new int[counterEvenNumbers];
        int[] oddNumbers = new int[counterOddNumbers];
        System.out.println(counterEvenNumbers);
        System.out.println(counterOddNumbers);

        int countEven = 0;
        int countOdd = 0;

        for (int j = 0; j < evenOrOdd.length; j++) {
            if (evenOrOdd[j] % 2 == 0) {
                evenNumbers[countEven] = evenOrOdd[j];
                countEven++;
            }
            if (evenOrOdd[j] % 2 != 0) {
                oddNumbers[countOdd] = evenOrOdd[j];
                countOdd++;
            }
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i : evenNumbers) {
            System.out.print(evenSum + "+" + i);
            evenSum += i;
            System.out.println(" = " + evenSum);
        }

        for (int g : oddNumbers) {
            System.out.print(oddSum + "+" + g);
            oddSum += g;
            System.out.println(" = " + oddSum);
        }

        getWinner(evenNumbers, oddNumbers, evenSum, oddSum);

    }



    public static String numberArrayToString(int[] numbers, String startStr, String endStr) {
        String arrayString = "[";

        arrayString = String.format("%s%s ", startStr, arrayString);
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                // arrayString.concat(String.format("{0}, ",numbers[i] ));
                arrayString = String.format("%s%d, ", arrayString, numbers[i]);
            } else {
                arrayString = String.format("%s%d]", arrayString, numbers[i]);
            }
        }
        arrayString = String.format("%s%s ", arrayString, endStr);
        return arrayString;

    }

    public static void getWinner(int[] numeriPari, int[] numeriDispari, int sumEven, int sumOdd) {
        if (sumEven > sumOdd) {
            System.out.println(numberArrayToString(numeriPari, "Even numbers - ",
                    String.format(" --> %d even numbers wins!", sumEven)));
            // System.out.print("Even numbers - [");
            // for(int i = 0; i < numeriPari.length; i++){
            // if(i < numeriPari.length -1){
            // System.out.print(numeriPari[i] + ", ");
            // }
            // else{
            // System.out.print(numeriPari[i] + "]");
            // }
            // }
            // System.out.println(" -->" + sumEven + " even numbers wins!");

            System.out.println(numberArrayToString(numeriDispari, "Odd numbers - ", String.format(" --> %d", sumOdd)));
            // System.out.print("Odd numbers - [");
            // for(int i = 0; i < numeriDispari.length; i++){
            // if(i < numeriDispari.length -1){
            // System.out.print(numeriDispari[i] + ", ");
            // }else{
            // System.out.print(numeriDispari[i] + "]");
            // }
            // }
            // System.out.println(" -->" + sumOdd);
        }

        else if (sumOdd > sumEven) {
            System.out.println(numberArrayToString(numeriDispari, "Odd numbers - ",
                    String.format(" --> %d odd numbers wins!", sumOdd)));

            // System.out.print("Odd numbers - [");
            // for(int i = 0; i < numeriDispari.length; i++){
            // if(i < numeriDispari.length -1){
            // System.out.print(numeriDispari[i] + ", ");
            // }
            // else{
            // System.out.print(numeriDispari[i] + "]");
            // }
            // }
            System.out.println(numberArrayToString(numeriPari, "even numbers - ", String.format(" --> %d", sumEven)));
            // System.out.println(" -->" + sumOdd + " odd numbers wins!");
            // System.out.print("Even numbers - [");
            // for(int i = 0; i < numeriPari.length; i++){
            // if(i < numeriPari.length -1){
            // System.out.print(numeriPari[i] + ", ");
            // }
            // else{
            // System.out.print(numeriPari[i] + "]");
            // }
            // }
            System.out.println(" -->" + sumEven);
        } else if (sumOdd == sumEven) {
            System.out.println(
                    numberArrayToString(numeriPari, "Even numbers - ", String.format(" --> %d draw!", sumEven)));
            System.out.println(
                    numberArrayToString(numeriDispari, "Odd numbers - ", String.format(" --> %d draw!", sumOdd)));
        }

    }

public static int[] randomizer(int[] addNumbers, int numberOfN, int index) {
    Random random = new Random();

    for (int i = 0; i < numberOfN; i++) {

        int randomInt = random.nextInt(index);

        addNumbers[i] = randomInt;
    }
    return addNumbers;
 }
}
