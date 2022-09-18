class CountDigits {

    public long countDigits(long number) {
        long count = 0;
        while (Math.abs(number) > 0) {
            number = Math.abs(number) / 10;
            count++;
        }
        return count;
    }

    public long countDigitsUsingRecursion(long number) {

        return (Math.abs(number) == 0) ? 0 : 1 + countDigits(Math.abs(number / 10));
    }

    public static void main(String args[]) {
        CountDigits countDigits = new CountDigits();
        System.out.println("The total number of digits in the number: " + countDigits.countDigits(199));
        System.out.println("The total number of digits in the number using recursion: "
                + countDigits.countDigitsUsingRecursion(-199));

    }

}