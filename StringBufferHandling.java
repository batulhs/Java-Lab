package BM23AI041;
import java.util.Scanner;
public class StringBufferHandling {
    public static void main(String[] args){
        StringBuffer sb1= new StringBuffer();
        System.out.println("Capacity of StringBuffer object sb1: "+sb1.capacity());
        StringBuffer sb2= new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb2: "+sb2.capacity());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String ori=scanner.nextLine();
        StringBuffer s2= new StringBuffer(ori);
        String rev=s2.reverse().toString().toUpperCase();
        System.out.println("Reversed upper string: "+rev);
        System.out.println("Enter another string: ");
        String ori1=scanner.nextLine();
        StringBuffer s4= new StringBuffer(rev);
        StringBuffer s3= new StringBuffer(ori1);
        System.out.println("Appended string: "+s4.append(s3));
        StringBuffer s5= new StringBuffer(s4.append(s3));
        System.out.println("Capacity of StringBuffer object sb2: "+s5.capacity());
    }
}
