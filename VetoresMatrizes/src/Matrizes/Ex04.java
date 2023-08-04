package Matrizes;

import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        float[][] notas = new float[10][4];
        float[] medias = new float[10];
        int linha, coluna;
        float soma=0, media;

        //entrada dos dados
        for(linha=0;linha<10;linha++)
        {
            for(coluna=0;coluna<4;coluna++)
            {
                System.out.printf("Aluno %d, %dº Nota: ", linha+1, coluna+1);
                notas[linha][coluna] = leia.nextFloat();
            }
        }
        //tratamento dos dados
        for(linha=0;linha<10;linha++)
        {
            soma =0;
            for(coluna=0;coluna<4;coluna++)
            {
                soma += notas[linha][coluna];
                if(coluna == 3)
                {
                    media = soma/4;
                    medias[linha] = media;
                }
            }
        }

        //saida dos dados
        System.out.println("\nNotas: ");
        for(linha=0;linha<10;linha++)
        {
            System.out.printf("\nAluno %d, Média: %.1f", linha+1 , medias[linha]);
        }
    }
}
