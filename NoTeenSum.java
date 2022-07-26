// noTeenSum
// Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that 
// value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an 
// int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). 
// Define the helper below and at the same indent level as the main noTeenSum().

// noTeenSum(1, 2, 3) → 6
// noTeenSum(2, 13, 1) → 3
// noTeenSum(2, 1, 14) → 3

// Code: 
import java.util.*;
public class NoTeenSum {
  public static int noTeenSum(int a, int b, int c) {
    int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
    return sum;
  }
  
  public static int fixTeen(int age) {
    if(age >= 13 && age < 15 || age > 16 && age <= 19) {
      return 0; 
    } else {
      return age;
    }
  }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter value of b: ");
    int b = sc.nextInt();
    System.out.print("Enter value of c: ");
    int c = sc.nextInt();
    int sumOfNoTeen = noTeenSum(a, b, c);
    System.out.println("Sum of noTeen is: " + sumOfNoTeen);
    sc.close();
}
}