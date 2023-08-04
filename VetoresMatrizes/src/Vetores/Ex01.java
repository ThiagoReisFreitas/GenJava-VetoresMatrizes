package Vetores;

import java.util.Scanner;

public class Ex01
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int[] lista = new int[]{2,5,1,3,4,9,7,8,10,6};
        int x, num;

        System.out.print("Digite um número que você deseja encontrar: ");
        num = leia.nextInt();
        for(x=0;x<10;x++)
        {
            if(lista[x] == num)
            {
                System.out.printf("\nO número %d está localizado na posição: %d", num, x);
                break;
            }
            else if(x == 9)
            {
                System.out.printf("\nO número %d não foi encontrado!", num);
            }
        }
    }
}
