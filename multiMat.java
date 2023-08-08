import java.util.*;   
   
public class AlMatric{
    public static void printMat(int row,int col,int mat[][]){
        for (int i=0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(mat[i][j] + " ");
            };
            System.out.println();
        }; 
        System.out.println();
    };  
    public static void mulMat(int row1,int mat1[][],int col2,int mat2[][],int common){
       int C[][] = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < common; k++)
                    C[i][j] += mat1[i][k] * mat2[k][j];
            };
        };
        printMat(row1,col2,C);
    }; 
    public static void main(String[] args)
    {
        int row1 = 4, col1 = 3, row2 = 3, col2 = 4;
        int A[][] = { { 1, 1, 1 },
                      { 2, 2, 2 },
                      { 3, 3, 3 },
                      { 4, 4, 4 } };
 
        int B[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 } };
                      
        printMat(row1,col1,A);
        printMat(row2,col2,B);
        mulMat(row1,A,col2,B,row2);
    };
};