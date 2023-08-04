package Vetores;

import java.util.Scanner;

public class Ex02
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        int[] lista = new int[10];
        int x, soma=0;

        //armazenar os valores no vetor
        for(x=0;x<10;x++)
        {
            System.out.printf("Digite o %dº número: ",x+1);
            lista[x] = leia.nextInt();
        }

        System.out.println("\nElementos nos indices impares: ");
        for(x=0;x<10;x++)
        {
            if(x%2!=0)
            {
                System.out.printf("%d ",lista[x]);
            }
        }
        System.out.println("\nElementos pares: ");
        for(x=0;x<10;x++)
        {
            if(lista[x]%2==0)
            {
                System.out.printf("%d ", lista[x]);
            }
        }
        for(x=0;x<10;x++)
        {
            soma += lista[x];
        }
        System.out.printf("\nSoma: %d", soma);
        System.out.printf("\nSoma: %d", soma/10);


    }
}
