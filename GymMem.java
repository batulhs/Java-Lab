package BM23AI041;
import java.util.Scanner;
public class GymMem {
    int age;
    String name;
    int duration;
    boolean active;
    double fee;
    void calc(){
        fee=duration*50;
    }
    public static void main(String[] args){
        GymMem g1= new GymMem();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter name");
        g1.name=scanner.nextLine();
        System.out.print("Enter age");
        g1.age=scanner.nextInt();
        System.out.print("Enter duration");
        g1.duration=scanner.nextInt();
        System.out.print("Enter status(true/false)");
        g1.active=scanner.nextBoolean();
        g1.calc();
        System.out.println("Name: "+ g1.name);
        System.out.println("Age: "+ g1.age);
        System.out.println("Duration: "+ g1.duration);
        System.out.println("Status: "+ (g1.active? "Active":"Inactive"));
        System.out.println("Fee: "+ g1.fee);

        GymMem g2= new GymMem();
        Scanner scanner1= new Scanner(System.in);
        System.out.print("Enter name");
        g2.name=scanner1.nextLine();
        System.out.print("Enter age");
        g2.age=scanner1.nextInt();
        System.out.print("Enter duration");
        g2.duration=scanner1.nextInt();
        System.out.print("Enter status(true/false)");
        g2.active=scanner1.nextBoolean();
        g2.calc();
        System.out.println("Name: "+ g2.name);
        System.out.println("Age: "+ g2.age);
        System.out.println("Duration: "+ g2.duration);
        System.out.println("Status: "+ (g2.active? "Active":"Inactive"));
        System.out.println("Fee: "+ g2.fee);
    }
}
