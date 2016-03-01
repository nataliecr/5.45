import java.util.Scanner;

public class ComputeMeanAndSD {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count = 0;
    double sum = 0, sum2 = 0;
    System.out.print("Enter ten numbers: ");
    
    while (count < 10){
      double num = input.nextDouble();
      sum += num;
      sum2 = sum2 + (num * num);
      count++;
    } // while
    
    double mean = sum / count;
    double std_dev = Math.sqrt((sum2 - ((sum*sum)/count))/(count - 1));
    
    System.out.println("The mean is " + mean);
    System.out.printf("The standard deviation is %.5f \n", std_dev);
  } // main   
} // ComputeMeanAndSD
