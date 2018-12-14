package projeto;

import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 20171174010010
 */
class questoes2 {

    private int num;
    ArrayList<Questao> questao = new ArrayList<Questao>();

    public questoes2() {
        popularColecao();
    }

    public int randomizar() {
        Random r = new Random();
        int numeroSorteado = r.nextInt(10);
        return numeroSorteado;
    }

    ;
    
    public void popularColecao() {
        Questao w = new Questao();
        w.enunciado = "Tendo em mente a matriz a seguir, encontre o seu determinante:\n"
                + "|1 0 2|\n"
                + "|2 4 1|\n"
                + "|3 2 0|\n";
        w.a = "10";
        w.b = "0";
        w.c = "-19";
        w.d = "-18";
        w.e = "20";
        w.questaoCorreta = w.d;
        questao.add(w);
        /*Resposta:
       |1 0 2|1 0|              "
       |2 4 1|2 4| = 8-26= -18  
       |3 2 0|3 2|  */
        w = new Questao();
        w.enunciado = "Calcule a determinante da seguinte matriz de ordem 3: \n"
                + "|1 1 2|\n"
                + "|2 1 3|\n"
                + "|1 4 2|\n";
        w.a = "0";
        w.b = "2";
        w.c = "3";
        w.d = "-2";
        w.e = "-3";
        w.questaoCorreta = w.c;
        questao.add(w);

        /*Resposta:
        |1 1 2|1 1|              
        |2 1 3|2 1| = 21-18= 3   
        |1 4 2|1 4|              */
        w = new Questao();
        w.enunciado = "Descubra a determinante da matriz abaixo usando a lei de Sarrus: \n"
                + "|3 -1 -2|\n"
                + "|2  1  1|\n"
                + "|2  1 -2|\n";
        w.a = "-15";
        w.b = "";
        w.c = "";
        w.d = "";
        w.e = "";
        w.questaoCorreta = w.a;
        questao.add(w);
        /*Resposta:
        |3 -1 -2|2 -1|               
        |2  1  1|2  1|= -12-3 = -15  
        |2  1 -2|2  1|               */
        w = new Questao();
        w.enunciado = "Dada a matriz 3x3 E, calcule o seu determinante:? \n"
                + "|2 0 4|\n"
                + "|1 0 4|\n"
                + "|4 4 2|\n";
        w.a = "10";
        w.b = "-16";
        w.c = "-40";
        w.d = "16";
        w.e = "40";
        w.questaoCorreta = w.b;
        questao.add(w);
        /*Resposta:
        |2 0 4|2  0|               
        |1 0 4|1  0|= 16-32 = -16  
        |4 4 2|4  4|               */
        w = new Questao();
        w.enunciado = "Qual é o determinante de A? \n"
                + "|-2  1  0|\n"
                + "| 3  4  0|\n"
                + "|10 -8  0|\n";
        w.a = "1";
        w.b = "3";
        w.c = "0";
        w.d = "-2";
        w.e = "-1";
        w.questaoCorreta = w.c;
        questao.add(w);
        /*Resposta:
POSSUI UMA FILEIRA NULA, POR ISSO O DET É ZERO.*/
        w = new Questao();
        w.enunciado = "Calcule o determinante de Vandermonde  ? \n"
                + "|1 1 1|\n"
                + "|2 3 5|\n"
                + "|4 9 25|\n";
        w.a = "2";
        w.b = "6";
        w.c = "0";
        w.d = "9";
        w.e = "5";
        w.questaoCorreta = w.b;
        questao.add(w);
        /*Resposta:
        |1  1  1|			     
        |2  3  5|= (3-2).(5-3).(5-2)= 6  
        |4  9 25|                        */
        w = new Questao();
        w.enunciado = "Calcule o determinante de Vandermonde  ? \n"
                + "| 1 1 1|\n"
                + "| 2 3 4|\n"
                + "| 4 9 16 |\n";
        w.a = "2";
        w.b = "1";
        w.c = "0";
        w.d = "-2";
        w.e = "-2";
        w.questaoCorreta = w.a;
        questao.add(w);
        /*Resposta:
        |1  1  1|			    
        |2  3  4|= (3-2).(4-3).(4-2)= 2 
        |4  9 16|                       */
        w = new Questao();
        w.enunciado = "Calcule o determinante da matriz a seguir: \n"
                + "| 1 1  1|\n"
                + "| 4 6 9 |\n"
                + "| 4 9 36|\n";
        w.a = "29";
        w.b = "30";
        w.c = "39";
        w.d = "40";
        w.e = "19";
        w.questaoCorreta = w.c;
        questao.add(w);
        /*Resposta:
        |1 1  1|1  1|                
        |4 6  9|4  6|= 288-249 = 39  
        |4 9 36|4  9|                */
        w = new Questao();
        w.enunciado = "Calcule o determinante de Vandermonde  ? \n"
                + "|   1         1         1       |\n"
                + "|  log2     log20     log200    |\n"
                + "| (log2)^2 (log20)^2 (log200)^2 |\n";
        w.a = "-1";
        w.b = "0";
        w.c = "1";
        w.d = "2";
        w.e = "20";
        w.questaoCorreta = w.d;
        questao.add(w);
        /*Resposta:
    |   1         1         1       |                                                             
    |  log2     log20     log200    | (log20- log2).(log200-log20).(log200-log2)= 1 . 1 . 2 = 2   
    | (log2)^2 (log20)^2 (log200)^2 |                                                            */
        w = new Questao();
        w.enunciado = "Calcule o valor de x, a fim de que o determinante da matriz A seja nulo. ? \n"
                + "|1 2 1|\n"
                + "|4 9 4|\n"
                + "|6 x x-7|\n";
        w.a = "x=0";
        w.b = "x=9";
        w.c = "x=13";
        w.d = "x=10";
        w.e = "x=11";
        w.questaoCorreta = w.b;
        questao.add(w);
        /* Resposta:
9x+4x-63+48-54-48-4x+4x=0

13x-15-102=0

13x-15-102=0

13x-117=0

13x=117

x=9  
         */
        w = new Questao();
        w.enunciado = "Considere a matriz S = "
                + "( S11 S12  S13)\n" + " dada por Sij = {0, se i<j}\n" + "Então, resolva a inequação det S > 3x²."
                + " ( S21 S22  S23)\n" + "{i+j, se i=j} ?\n"
                + " ( S31 S32  S33)\n" + "{i-j, se i>j} \n";
        w.a = "3";
        w.b = "2";
        w.c = "-4< x >4";
        w.d = "2";
        w.e = "1";
        w.questaoCorreta = w.c;
        questao.add(w);
        /*Resposta:
|2 0  0|2  0|                  48>3x^2   
|1 4  0|1  4|= 48-0 = 48       48/3 >x^2 
|2 1  6|2  1|                  x < 4     */
        w = new Questao();
        w.enunciado = "Calcule o determinante \n"
                + "|-1  2  9|\n"
                + "| 4  7 10|\n"
                + "| 0  0  0|\n";
        w.a = "0";
        w.b = "1";
        w.c = "2";
        w.d = "-1";
        w.e = "-2";
        w.questaoCorreta = w.a;
        questao.add(w);
        /*Resposta:
POSSUI UMA FILEIRA NULA, POR ISSO O DET É ZERO.
         */
        w = new Questao();
        w.enunciado = "Calcule o determinante da matriz triangular \n"
                + "| 2  0  0 |\n"
                + "| 2  3  0 |\n"
                + "|-4  5 -7 |\n";
        w.a = "=40";
        w.b = "-42";
        w.c = "-4";
        w.d = "-2";
        w.e = "0";
        w.questaoCorreta = w.b;
        questao.add(w);
        /*Resposta:
        | 2 0  0| 2  0|                
        | 2 3  0| 2  3|=  -42          
        |-4 5 -7|-4  5|                */
        w = new Questao();
        w.enunciado = "Qual o determinante da matriz aseguir:\n"
                + "| 2 -1  3 |\n"
                + "|-1  1  2 |\n"
                + "| 0  3 -4 |\n";

        w.a = "11";
        w.b = "1";
        w.c = "0";
        w.d = "-25";
        w.e = "-20";
        w.questaoCorreta = w.d;
        questao.add(w);
        /*Resposta:
        |2  -1  3|2  -1|               
        |-1  1  2|-1  1|= -17-8 = -25  
        |0   3 -4|0   3|               */
        w = new Questao();
        w.enunciado = "Sabendo que A é uma matriz quadrada de ordem 3 e que o determinante de A é -2, calcule o valor do determinante da matriz 3A. \n";
        w.a = "-54";
        w.b = "-50";
        w.c = "-4";
        w.d = "-2";
        w.e = "0";
        w.questaoCorreta = w.a;
        /*Resposta:
 (-2). 3. 3. 3 = -54 
         */
        questao.add(w);

    }
}
