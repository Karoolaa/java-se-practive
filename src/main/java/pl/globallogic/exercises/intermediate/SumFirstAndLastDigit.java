package pl.globallogic.exercises.intermediate;

public class SumFirstAndLastDigit {
    public static void main(String[] args){
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number){
        if (number <0){
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {
            if (number<10){
                firstDigit = number;
            }
            number/=10;
        }
        return firstDigit+lastDigit;
    }
}
