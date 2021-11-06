import java.util.Arrays;
import java.util.Random;

public class init_game {
                public static int DCount(int a[],int n)//to count distinct values in array
                  {
                      int res=0;
                      
                      for(int i=0;i<n;i++)
                      {
                          int j;

                          for (j = 0; j < i; j++)

                             if (a[i] == a[j])
                                  break;

                          if (i == j)
                          {
                              res++;
                          }
                      }
                      
                      return res;
                   }
              public static void main(String[] args) {
                             // TODO Auto-generated method stub
                             int num[]= new int[90];//array initialization
                             Random rand = new Random();//random function variable
                             System.out.println("My name is");//test statement
                             for(int i=1;i<=90;i++)    //for loop to randomize the number generation from 1-90
                             {                           System.out.println("Entered i"+i+ "loop");

                             int check=rand.nextInt(89)+1;//to generate 1 random number
                             System.out.println(check+"gen number");
                             System.out.print(num.length+"size");
                             for(int j=0;j<num.length;j++) //to validate the generated number is already generated or not

                             {             System.out.println("Entered j"+j+ "loop");
                             if(num[j]==check)//condition check
                             {   i--;
                             break;
                             }             
                             }
                             num[i-1]=check;//add number in array
                             }
                             for(int k=0;k<num.length;k++)//Printing the elements one by one for test
                             {
                                           System.out.print(num[k]+",");//to print the numbers in array created
                             }
                               System.out.print("total distinct number of element "+DCount(num,num.length));// to print the distinct number value

              }


}
