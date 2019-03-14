package mate.academy.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("wides544@gmail.com");
        while (m.find()) {
            if (m.requireEnd()) {
                System.out.println(m.start() + " " + m.group() + " ");
            } else {
                System.out.println("incorrect data");
            }
        }
    }
}
