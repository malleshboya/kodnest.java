
import java.util.Arrays;

public class InsertArrayList {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int elementToInsert = 25;
        int targetIndex = 2; 
        int remove = originalArray[0];
        int[] newArray = new int[originalArray.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < targetIndex) {
                newArray[i] = originalArray[i];
            } else if (i == targetIndex) {
                newArray[i] = elementToInsert;
            } else {
                newArray[i] = originalArray[i - 1];
            }
        }
        System.out.println("Updated Array : " + Arrays.toString(newArray));
    }
}
import java.util.Scanner;
class Main4
{
public static void main(String args[])
System.out.println("Main method Execution Started.....");
try
{
divide();
}
{
}
catch(Exception e)
System.out.println("Exception handled in Main");
}
System.out.println("Main method Execution Completed.....");
static void divide()
{
try
System.out.println("Division started");
}
}
}
Scanner scan = new Scanner(System.in);
System.out.println("Enter a : ");
int a = scan.nextInt();
System.out.println("Enter b: ");
int b = scan.nextInt();
{
int res = a/b;
System.out.println(res);
catch(Exception e)
{ System.out.println("Exception handled in divide Method");
throw e;
}
}
finally {
{
System.out.println("Division completed");