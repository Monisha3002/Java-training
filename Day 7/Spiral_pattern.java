/*
 * 
7
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
 */

import java.util.Scanner;
public class Spiral_pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++)
            {
                if(i==0 || j==0  || i==num-1 || j==num-1)
                {
                    System.out.print("4 ");
                }
                else if(i==1 || j==1 || i==num-2 || j==num-2){
                    System.out.print("3 ");
                }
                else if(i==2 || j==2 || i==num-3 || j==num-3){
                    System.out.print("2 ");
                }
               else{
                System.out.print("1 ");
               }
                }
                System.out.println();
            }


          
        }
    }

