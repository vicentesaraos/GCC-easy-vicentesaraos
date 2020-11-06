import java.io.*;
import java.util.*;
import java.util.stream.Stream;

class Solution {

    // You may change this function parameters
    static int findMaxProfit(int numOfPredictedDays, int[] predictedSharePrices) {
      
      // find greatest positive range of two positive integers
      // a < b
      // if a - b >0 && >min
      // from 0 to len-2
      //
      
      int min=Integer.MAX_VALUE;
      int max=-1;
      for(int i =0; i<predictedSharePrices.length; i++){
        if (min > predictedSharePrices[i]){min = predictedSharePrices[i];}
        else if (predictedSharePrices[i] - min > max){max = predictedSharePrices[i]-min;}
              
      }
      
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] firstLine = scanner.nextLine().split(" ");
        int[] firstLineArr = Stream.of(firstLine).mapToInt(Integer::parseInt).toArray();
        int numOfPredictedDays = firstLineArr[0];
        int[] predictedSharePrices = Arrays.copyOfRange(firstLineArr, 1, firstLineArr.length);
        scanner.close();


        int result = findMaxProfit(numOfPredictedDays, predictedSharePrices);



        // Do not remove this line
        System.out.println(result);
        // Do not print anything after this line
    }
}