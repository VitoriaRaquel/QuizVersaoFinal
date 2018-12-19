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
 * @author 20171174010006
 */
class questoes1 {

    private int num;

    ArrayList<Questao> questao = new ArrayList<Questao>();

    public questoes1() {
        popularColecao();
    }
    
    public int randomizar(){
        Random r = new Random();
        int numeroSorteado = r.nextInt(10);
        
        return numeroSorteado;
    }
    

    public void popularColecao() {
        Questao x = new Questao();
        x.enunciado = "-Calcule o valor do determinante \n"
                + "                 |5 4|\n"
                + "                 |2 2|\n";
        x.a = "1";
        x.b = "2";
        x.c = "0";
        x.d = "8";
        x.e = "10";
        x.questaoCorreta = x.b;
        questao.add(x);
        /*5x2=10
        4x2=8
        10-8=2*/
        x = new Questao();
        x.enunciado = "- Calcule o valor do determinante \n"
                + "                 |-4 2|\n"
                + "                 |-1 3|\n";
        x.a = "-10";
        x.b = "12";
        x.c = "0";
        x.d = "11";
        x.e = "10";
        x.questaoCorreta = x.a;
        questao.add(x);
        /*-4x3=-12
        2x(-1)=-2
        -12-(-2)=-10*/
        x = new Questao();
        x.enunciado = "- Calcule o valor do determinante \n"
                + "               |-9 -4|\n"
                + "               | 3  5|\n";
        x.a = "-20";
        x.b = "-33";
        x.c = "33";
        x.d = "57";
        x.e = "10";
        x.questaoCorreta = x.b;
        questao.add(x);
        /*-9x5=-45
        -4x3=-12
        -45-(-12)=-33*/
        x = new Questao();
        x.enunciado = "- Calcule o valor do determinante \n"
                + "             |  6   2|\n"
                + "             |(2/3) 3|\n";
        x.a = "104/6";
        x.b = "108/6";
        x.c = "100/6";
        x.d = "102/6";
        x.e = "100/3";
        x.questaoCorreta = x.a;
        questao.add(x);
        /*6x3=18
        2x(2/3)=4/6
        18-(4/6)=
        (108-4)/6=
        104/6*/
        x = new Questao();
        x.enunciado = "- Descubra o valor de x: \n"
                + "                 |3 9|\n"
                + "                 |2 x| = 3\n";
        x.a = "24";
        x.b = "21";
        x.c = "7";
        x.d = "0";
        x.e = "1";
        x.questaoCorreta = x.c;
        questao.add(x);
        /*3.x=3x
        2.9=18
        3x-18=3
        3x=21
        x=7*/

        x = new Questao();
        x.enunciado = "- Calcule o valor de 'x': \n"
                + "             |x^2  x|\n"
                + "             | 2   1|\n";
        x.a = "1";
        x.b = "2";
        x.c = "0";
        x.d = "4";
        x.e = "3";
        x.questaoCorreta = x.a;
        questao.add(x);
        /*x² – 2x = – 1
        x² – 2x + 1 = 0

        ? = (– 2)² – 4.1.1
        ? = 4 – 4
        ? = 0
        x = – (– 2) ± v0/2.1
        x = 2 ± 0/2
  
        x = 2/2 = 1
        x = 1.*/
        
        x = new Questao();
        x.enunciado = "- Dadas as matrizes A = |1 3| e B = |-1 2|, o determinante da matriz A.B é: \n"
                + "                             |2 4|       |3  1|\n";
        x.a = "15";
        x.b = "14";
        x.c = "114";
        x.d = "50";
        x.e = "1";
        x.questaoCorreta = x.b;
        questao.add(x);
        /*AxB= |1x(-1)+3x3  1x2+3x1| = |8  5|
                |2x(-1)+4x3  2x2+4x1|   |10 8|
            detAxB= 8x8 - 5x10
            64 - 50
            detAxB = 14*/

        x = new Questao();
        x.enunciado = "- Sendo B = (bij)2x2 onde,\n"
                + "     |1,se i=j\n"
                + "bij  |-2ij,se i<j\n"
                + "     |3j,se i>j\n"
                + "Calcule o det B^t";
        x.a = "13";
        x.b = "-12";
        x.c = "1";
        x.d = "0";
        x.e = "11";
        x.questaoCorreta = x.a;
        questao.add(x);
       /* |B11 B12|
            |B21 B22|

        detB=|1 -4|
            |3  1|

        B^t= |1  3|
             |-4 1|
        det B^t= 13*/
        x = new Questao();
        x.enunciado = "- Dadas as matrizes mostradas na figura adiante, o determinante da matriz A . B é\n"
                + "                 | 2  1|         |2 2|\n"
                + "               A=| 2  4|       B=|1 1|\n";
                    
                
        x.a = "0";
        x.b = "1";
        x.c = "8";
        x.d = "20";
        x.e = "80";
        x.questaoCorreta = x.a;
        questao.add(x);
        /* 4+1=5
            4+1=5
            4+4=8
            4+4=8
            |5 5|
            |8 8|
            5x8=40
            5x8=40
            40-40=0
            */

        x = new Questao();
        x.enunciado = " - Para que o determinante da matriz seja nulo, o valor de a deve ser: \n"
                + "                         |1+a  -1|\n"
                + "                         | 3  1-a|\n";
        x.a = "2 ou -2";
        x.b = "1 ou 3";
        x.c = "-3 ou 5";
        x.d = "-5 ou 3";
        x.e = "4 ou -4 ";
        x.questaoCorreta = x.a;
        questao.add(x);
        /*-3-(1-a+a-a^2)
            -3-1+a^2
            a^2-4=0
            a^2=4
            Raiz quadrada de 4  = 2*/
        x = new Questao();
        x.enunciado = " -  O termo geral da matriz M2x2 é aij = 3i - 2j. O valor do determinante de M é:\n";
        x.a = "2";
        x.b = "3";
        x.c = "4";
        x.d = "5";
        x.e = "6";
        x.questaoCorreta = x.e;
        questao.add(x);
       /* A11 = 3
            a21 = 4
            a12 = -1
            a22 = 2

        O determinante será: (1x2)-(4x-1)=2+4=6*/


        x = new Questao();
        x.enunciado = "- considere as matrizes A=|1 x|,B=|1 2| e C=|4   5|com x,y,z números reais."
                + "                              |y z|	 |1 1|     |36 45|\n"
                + "Se A.B=C,a soma dos elemoentos da matriz A é:\n";
                
		
        x.a = "9";
        x.b = "27";
        x.c = "40";
        x.d = "1";
        x.e = "3";
        x.questaoCorreta = x.c;
        questao.add(x);
        /*1*1 + x*1  = 4;
    1*2 + x*1 =  5;
    x = 3
    y*1 + z*1 = 36;
    y*2 + z*1 =  45;
    y = 9;
    z = 27;
    Soma dos elementos de A = 1 + 3 + 9 + 27 = 40*/


        x = new Questao();
        x.enunciado = "- A é uma matriz quadrada de ordem 2 e det(A)=7. Nessas condições, det(3A) e det(A-¢) valem respectivamente: \n";
        x.a = "7 e -7";
        x.b = "21 e 1/7";
        x.c = "21 e -7";
        x.d = "63 e -7";
        x.e = "63 e 1/7";
        x.questaoCorreta = x.e;
        questao.add(x);
        /*det(KA)=K^n.detA
        det(3A)=3^2.7
        det(3A)=9.7
        det(3A)=63

        det(A^-1)=inversa do determinante de A que a questao disse que é 7
        o inverso de 7 é 1/7 (inverso e virar o numero de cabeça pra baixo tecnicamente)

        Resposta: alternativa D 63 e 1/7*/

        x = new Questao();
        x.enunciado = "- Sendo x e y, respectivamente, os determinantes das matrizes abaixo. É verdade que y/x é igual a"
                + "    |a b|                 |-4a -4c|\n"
                + " A= |c d|  " + " e " + "B=| 5b  5d|\n";
        x.a = "9";
        x.b = "-20";
        x.c = "20";
        x.d = "-2";
        x.e = "6";
        x.questaoCorreta = x.b;
        questao.add(x);
       /* X = ad-bc
        y = -20ad + 20bc
        y = -20(ad-bc)

        y/x = -20(ad-bc) / (ad-bc)
        Cancelando (ad-bc), y/x = -20*/

        x = new Questao();
        x.enunciado = "- Calcule o determionante da matriz 2x2 abaixo \n"
                + "                 |1 5|\n"
                + "                 |3 4|\n";
        x.a = "-9";
        x.b = "10";
        x.c = "-11";
        x.d = "15";
        x.e = "8";
        x.questaoCorreta = x.c;
        /*1x4=4
         5x3=15
        4-15=-11*/
        questao.add(x);
    }
}
