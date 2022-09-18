
class SumOfDigitsOfANumber {

    // Method-I
    // Using iteration
    public int getSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            // Fetch the last digit from the number
            sum = sum + (num % 10);
            // Reduce the number by last digit
            num = num / 10;
        }
        return sum;
    }

    // Method-II
    // Using recursion
    public int getSumOfDigits2(int sum) {
        return (sum == 0) ? 0 : (sum % 10) + getSumOfDigits2(sum / 10);
    }

    public static void main(String args[]) {
        SumOfDigitsOfANumber aNumber = new SumOfDigitsOfANumber();
        System.out.println("The sum of all the digits of a number:- "
                + aNumber.getSumOfDigits(-9999));
        System.out.println("The sum of all the digits of a number:- "
                + aNumber.getSumOfDigits2(-9999));
    }

}
