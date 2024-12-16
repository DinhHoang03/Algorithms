public class ReverseString {
    public static void main(String[] args) {
        String string = "hello";

        System.out.println("Before: " + string + " and After: " + reverseString(string));
    }

    public static String reverseString(String string){
        if (string == null){
            return "There is nothing here";
        }

        String reverseString = "";

        for (int i = string.length()-1; i >= 0; i--){
            reverseString = reverseString + string.charAt(i);
        }
        return reverseString;
    }
}