package com.mycompany.matrixoperations;
import java.util.*;
/**
 *
 * @author Assassin
 */
public class MatrixOperation {
    
    public static void main(String[] md){
        Scanner sc = new Scanner(System.in);
        
        boolean option=false ;
        
        do{
            int n,m;
            System.out.println("Enter dimensions of matrices : ");
            n= sc.nextInt();
            m= sc.nextInt();
            
            int[][] A = new int[n][m];
            int[][] B = new int[n][m];
            
            int choose;
            
            System.out.println("SELECT A MATRIX OPERATION \n(1)ADDITION\n(2)SUBTRACTION\n(3)TRANSPOSE\n(4)MULTIPLICATION\n(5)INVERSE");
            choose = sc.nextInt();
            
            switch(choose){
                case 1-> {
                            System.out.printf("ENTER FIRST MATRIX OF %dX%d\n",n,m);
                            enterMatrix(n,m,A);
                            //printMatrix(n,m,A);
                            System.out.printf("ENTER FIRST MATRIX OF %dX%d\n",n,m);
                            enterMatrix(n,m,B);
                            //printMatrix(n,m,B);
                            matrixAddition(n,m,A,B);
                         }
                
                default->System.out.println("WRONG OPTION SELCTED. TRY AGAIN!!");
                            
            }
            System.out.println("DO YOU WANT TO CONTINUE? PRESS 1 ELSE PRESS 2");
            int press = sc.nextInt();
            if(press==1) 
                option=false;
            
            else{ 
                option=true;
                System.out.println("<---------------------------------------THANK YOU FOR USING THE MATRIX CALUTATOR--------------------------------------->");
            }
        }while(option!=true);
    }
    
    static void enterMatrix(int n, int m, int[][] C){
        Scanner sc1 = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                C[i][j]=sc1.nextInt();
            }
        }
    }
    
    static void printMatrix(int n, int m, int[][] C){
        Scanner sc1 = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    static void matrixAddition(int n,int m, int[][] A,int[][] B){
        int[][] C = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("ADDITION OF TWO MATRICES:");
        printMatrix(n,m,C);
        
    }
    
    
    
}
