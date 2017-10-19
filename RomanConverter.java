import java.util.Scanner;
import java.util.stream.IntStream;

public class RomanConverterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        IntStream.range(0, n)
                .forEach(x -> System.out.println(RomanConverter.toRoman(scanner.nextInt())));
        scanner.close();
    }
}


class RomanConverter {
    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
	String rezultat = new String();
    int x = 0;

    String[] romans = new String[] { "M", "CM", "D", "CD", "C", "XC", "L",
                       					"XL", "X", "IX", "V", "IV", "I" };
        
    int[] nums = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5,
            												4, 1 };
        
    for (int i = 0; i < nums.length; i++) {
        x = n / nums[i];
        n %= nums[i];
        //x sekogas pomalo od 0 koa n ne sodrzi broj od nums[i]
        while (x > 0) {
            rezultat += romans[i];
            x--;
        }
    }
    return rezultat;
    }

}
