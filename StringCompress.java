public class StringCompress {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // count consecutive same characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // append character
            sb.append(str.charAt(i));

            // append count only if greater than 1
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String compressed = compress(str);
        System.out.println(compressed); // Output: a3b2c3d2
    }
}
