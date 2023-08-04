package Matrizes;

import java.util.Scanner;

public class Ex03
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int linha, coluna, somap=0, somas=0, i;

        for(linha=0;linha<3;linha++)
        {
            for(coluna=0;coluna<3;coluna++)
            {
                System.out.printf("Linha %d, Coluna %d: ",linha, coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        //elementos da diagonal primaria
        System.out.println("Elementos da Diagonal Principal: ");
        for(i=0;i<3;i++)
        {
            somap += matriz[i][i];
            System.out.printf("%d ",matriz[i][i]);
        }

        //elementos diagonal secundaria
        System.out.println("\nElementos da Diagonal Secundária: ");
        for(i=0;i<3;i++)
        {
            {
                somas += matriz[i][2-i];
                System.out.printf("%d ", matriz[i][2-i]);
            }
        }
        System.out.printf("\nSoma dos Elementos da Diagonal Principal: \n%d", somap);
        System.out.printf("\nSoma dos Elementos da Diagonal Secundária: \n%d", somas);

    }
}