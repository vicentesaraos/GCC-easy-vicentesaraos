import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            String answer ="";
            int[] values = new int[n];
            int[] profit = new int[d];
            for (int i = 0; i < n; i++) {
                values[i] = scanner.nextInt();
            }

            for (int j = 0; j < d; j++) {
                profit[j] = scanner.nextInt();
            }
            answer = findMinDays(values,profit);
            // Do not remove below line
            System.out.println(answer);
            // Do not print anything after this line
        }
    }

    public static String findMinDays(int[] values, int[] profit) {

        // Participant's code will go here
        int a=0;
        int b=0;
        int c=0;
        int aa = 0;

        int[] z = {0,Integer.MAX_VALUE};
        int[] zz = new int[profit.length*2];
        int k=0;
        a=profit[k];

            for(int l=0, d=l+1; l<values.length && d<values.length;d++){
                b=values[l];
                c=values[d];

                if(c>b){
                    if((a==c-b) &&
                            (d <= z[1]-1) &&
                            (d-l <= z[1]-1-z[0]-1))
                    {z[0]=l+1;z[1]=d+1;++l;};}
                
                if(d==values.length-1){++l;d=l;}
                
                if(l==values.length-1 && d==values.length-1){zz[aa]=z[0];zz[aa+1]=z[1];z[0]=0;z[1]=Integer.MAX_VALUE;
                    if(k==profit.length-1){break;};aa+=2;++k;l=0;d=l;
                 {a=profit[k];};}
            }

        StringBuilder answer = new StringBuilder(profit.length*3);
        for(int y=0;y<zz.length;y+=2){
            answer.append(zz[y]);
            answer.append(" ");
            answer.append(zz[y+1]);
            if (zz.length > 2 && y != zz.length/2){ answer.append(",");}
        }
        return answer.toString();
    }
}