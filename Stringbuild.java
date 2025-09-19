public class Stringbuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
            sb.append(',');

        }
        // abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2.toString());
        sb2.reverse();
        System.out.println(sb2.toString());
        sb2.delete(0, 6);
        System.out.println(sb2.toString());
        sb2.replace(0, 5, "Java");
        System.out.println(sb2.toString());
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.ensureCapacity(100);
        System.out.println(sb2.capacity());

    }

}
