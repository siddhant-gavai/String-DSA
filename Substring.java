public class Substring {
    public static void main(String[] args) {
        String s1 = "Tony Stark";
        // String s2 = s1.substring(0, 4);
        // System.out.println(s2);

        String subString = "";
        int si = 0;
        int ei = 8;
        for (int i = si; i < ei; i++) {
            subString += s1.charAt(i);
        }
        System.out.println(subString);
    }

}
