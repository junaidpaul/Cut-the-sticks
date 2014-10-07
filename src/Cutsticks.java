
import java.util.ArrayList;
import java.util.Scanner;

public class Cutsticks
{
    public static void main(String[] args) {

        int singleInteger;
        int[] nInteger;
        int temp;
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        singleInteger = in.nextInt();
        nInteger = new int[singleInteger];

        //Get input from the user
        for(int i=0; i<nInteger.length;i++){
            nInteger[i] = in.nextInt();
        }
        // find the smallest number in an array , excluding Zero
        do {
            int counter =0;

            for(int i=0;i<nInteger.length;i++){
                if (nInteger[i]!=0){
                    counter = counter+1;
                }
            }
            temp = nInteger[0];
            for(int i=0;i<nInteger.length;i++){
                if(temp<nInteger[i]&& temp!=0){
                    continue;
                }
                else {
                    if (nInteger[i]==0){
                        continue;
                    }
                    else {
                        temp=nInteger[i];
                    }
                }
            }
            for(int i=0;i<nInteger.length;i++){
                if(nInteger[i]!=0){
                    nInteger[i]=nInteger[i]-temp;
                }
            }

            al.add(counter);

        }while (temp!=0);
        for(int i=0;i<al.size();i++){
            if(al.get(i)==0){
                continue;
            }
            else {
                System.out.println(al.get(i));
            }
        }
    }
}
