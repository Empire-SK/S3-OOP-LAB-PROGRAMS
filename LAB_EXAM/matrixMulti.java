import java.util.Scanner;
public class matrixMulti {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of First Matrix\n");
        System.out.println("Enter the Row and Column");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the Size of Second Matrix\n");
        System.out.println("Enter the Row and Column");
        int row1=sc.nextInt();
        int col1=sc.nextInt();

        if(col!=row1){
            System.out.print("First Column and first Row Must be Same");
            
        }
        int[][] A=new int[row][col];
        int[][] B=new int[row1][col1];
        int[][] C=new int[row][col1];

        System.out.println("Enter the Elements of Matrix 1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                A[i][j]=sc.nextInt();
                
            }
        }
        
        System.out.println("Enter the Elements of Matrix 2");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                B[i][j]=sc.nextInt();
            }
        }
        int k=0;
        //MULTIPLICATION AREA
        for(int i=0;i<row;i++){
            for(int j=0;j<col1;j++){
                C[i][j]=0;
                for(k=0;k<col1;k++){
                C[i][j]= C[i][j]+A[i][k]*B[k][j];
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col1;j++){
                System.out.print(C[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

}