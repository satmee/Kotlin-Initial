/** For knowing Interopearbility Function of Kotlin**/
public class JavaFunction {
    public static void main(String[] args){ // Function called from Kotlin into our Java File
        int sum = ForJavafunctionKt.add(4,5);
        System.out.println("The sum of the numbers using Java File:"+sum);
    }
    public static int getArea(int l, int b){ // Function called from Java File into Kotlin
     return l*b;
    }

}
