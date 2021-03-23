package Strings;

public class StringEx06 {
    public static void main(String[] args) {

        char[] txt1 = {'H', 'e', 'l', 'l', 'o'};
        String txt2 = " ";

        txt2 = txt2.copyValueOf(txt1, 0, 5);
        System.out.println(txt2);

    }
}
