package BM23AI041;
import java.util.Scanner;
public class StringOperations {
    public static Boolean StrCmp(String String1,String String2){
        if (String1.equals(String2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String StrCon(String String1,String String2){
        return String1+String2;
    }
    public static String StrCop(String String1){
        return String1;
    }
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter two strings");
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        System.out.println("Compare two: "+StrCmp(str1,str2));
        System.out.println("Concatenate two: "+StrCon(str1,str2));
        String copy=StrCop(str1);
        System.out.println("Copy: "+copy);


    }
}
