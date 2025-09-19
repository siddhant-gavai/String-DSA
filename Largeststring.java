public class Largeststring {
    public static void main(String[] args) {
        String[] fruits = { "apple", "banana", "cherry", "date" };
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (fruits[i].compareTo(largest) > 0) {
                largest = fruits[i];
            }

        }

        System.out.println("The largest string is: " + largest);
    }
}
