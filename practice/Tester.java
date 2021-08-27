package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        long l = Long.parseLong(br.readLine());
        char c = br.readLine().charAt(0);

        String[] array = br.readLine().split(" ");
        int[] intArray = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();

        System.out.println(i);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
    }
}
