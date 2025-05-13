package BM23AI041;
import java.util.Scanner;
public class Enumeration {
    public enum Days{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        public boolean check(){
            return(this!=SATURDAY && this!=SUNDAY);
        }
    }
    public static void main(String[] args){
        System.out.println("Is Monday a workday?"+Days.MONDAY.check());
        System.out.println("Is Sunday a workday?"+Days.SUNDAY.check());
    }
}
