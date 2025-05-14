package BM23AI041;
import java.util.Scanner;
public class ExamScore {
    public static void main(String[]args){
        final int num=5;
        int [] score=new int[num];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter scores");
        for (int i=0;i<num;i++){
            System.out.print("Enter for student"+(i+1)+":");
            score[i]=sc.nextInt();
        }
        int sum=0;
        int highest=score[0];
        //for (int i=0;i<num;i++){
            //sum=sum+score[i];
            //if (score[i]>highest){
                //highest=score[i];
            //}
        //}
        for (int s:score){
            sum+=s;
            if (s>highest){
                highest=s;
            }
        }
        System.out.println("Sum of scores:"+sum);
        System.out.println("Highest score:"+highest);
    }
}
