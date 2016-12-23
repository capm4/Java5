package Module3.Practick.PatternCompile;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompile {
    public static void main(String[] args) {
        System.out.println(test("Pizza"));
    }

    public static void PatComSear(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < testCases; i++) {
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

    public static void Rexep(){
        String TEXT = "Мне очень нравится Тайланд. Таиланд это то место куда бы я поехал. тайланд - мечты сбываются!";
        System.out.println(TEXT.replaceAll("[Тт]а[ий]ланд", "USA"));
        }

    public static boolean test(String testString){
        Pattern p = Pattern.compile("^[a-z]+");
        Matcher m = p.matcher(testString);
        return m.matches();
    }
}
