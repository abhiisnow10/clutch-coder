class PalindromeNumbers {

    public boolean isPalindrome(String number) {
        int firstIndex = 0;
        int lastIndex = number.length() - 1;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(firstIndex) != number.charAt(lastIndex))
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public boolean isPalindrome_method2(String number) {
        int firstIndex = 0;
        int lastIndex = number.length() - 1;
        while (firstIndex <= lastIndex) {
            if (number.charAt(firstIndex) != number.charAt(lastIndex))
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public boolean isPalindrome_method3(String number, int firstIndex, int lastIndex) {
        if (lastIndex < firstIndex)
            return true;
        return (number.charAt(firstIndex) != number.charAt(lastIndex)) ? false
                : isPalindrome_method3(number, firstIndex + 1, lastIndex - 1);

    }

    public static void main(String[] args) {
        PalindromeNumbers palindromeNumbers = new PalindromeNumbers();
        System.out.println("Is the number palindrome: " + palindromeNumbers.isPalindrome("123320"));
        System.out.println("Is the number palindrome: " + palindromeNumbers.isPalindrome_method2("123421"));
        String number = "123321";
        System.out.println(
                "Is the number palindrome: " + palindromeNumbers.isPalindrome_method3(number, 0, number.length() - 1));

    }

}
