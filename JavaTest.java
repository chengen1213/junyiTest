public class JavaTest {

    public static void main(String[] args) {
        System.out.println(reverseSingle("Hello"));
        System.out.println(reverse("How are you"));
        System.out.println(count(15));
    }
//  1.(A)
    public static String reverseSingle(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--)
            sb.append(word.charAt(i));
        return sb.toString();
    }
//  1.(B)
    public static String reverse(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseSingle(word));
            sb.append(' ');
        }
        return sb.toString().trim();
    }
//  2
    public static int count(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                count++;
            if (i % 15 == 0)
                count++;
        }
        return count;
    }
}
