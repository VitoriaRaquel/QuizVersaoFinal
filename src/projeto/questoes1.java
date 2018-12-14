package projeto;


import java.util.ArrayList;

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

    ArrayList<Questao> questao= new ArrayList<Questao>();
    
    
    
    public ArrayList<Questao>  Questao1(){
        Questao x = new Questao();
        x.enunciado = "Calcule o valor do determinante \n"
                + "|5 4|\n"
                + "|2 2|\n";
      x.a="";
      x.b="";
      x.c="";
      x.d="";
      x.e="";
      x.questaoCorreta=x.a;   
      questao.add(x);

      x.enunciado = "Calcule o valor do determinante \n"
                + "|-4 2|\n"
                + "|-1 3|\n";
      x.a="";
      x.b="";
      x.c="";
      x.d="";
      x.e="";
      x.questaoCorreta="";
      questao.add(x);
  
    
        x.enunciado="Calcule o valor do determinante \n"
                + "|-9 -4|\n"
                + "| 3  5|\n";
      x.a="";
      x.b="";
      x.c="";
      x.d="";
      x.e="";
      x.questaoCorreta=""; 
      questao.add(x);
          
        
   
        x.enunciado= "Calcule o valor do determinante \n"
                + "|  6   2|\n"
                + "|(2/3) 3|\n";
         x.a="";
         x.b="";
         x.c="";
         x.d="";
         x.e="";
         x.questaoCorreta=""; 
        questao.add(x);

        
    
        x.enunciado="Descubra o valor de x: \n"
                + "|3 9|\n"
                + "|2 x| = 3\n";
         x.a="";
         x.b="";
         x.c="";
         x.d="";
         x.e="";
         x.questaoCorreta=""; 
         questao.add(x);

    
        x.enunciado="Calcule o valor de 'x': \n"
                + "|x^2  x|\n"
                + "| 2   1|\n";
         x.a="";
         x.b="";
         x.c="";
         x.d="";
         x.e="";
         x.questaoCorreta=""; 
         questao.add(x);

       x.enunciado="Dadas as matrizes A = |1 3| e B = |-1 2|, o determinante da matriz A.B é: \n"
                + "                      |2 4|       |3  1|\n";
         x.a="";
         x.b="";
         x.c="";
         x.d="";
         x.e="";
         x.questaoCorreta=""; 
         questao.add(x);

            
    
        x.enunciado="Sendo B = (bij)2x2 onde,\n"
                + "   |1,se i=j"
                + "bij|-2ij,se i<j\n"
                + "   |3j,se i>j\n"
                
                + "Calcule o det B^t";
         x.a="";
         x.b="";
         x.c="";
         x.d="";
         x.e="";
         x.questaoCorreta="";         
         questao.add(x);

    x.enunciado=  "Considere as matrizes A e B a seguir e n=det(AB). Calcule 7¾.\n"
                + "    | 1  0|\n"       +"  |0 1 2|"
                + " A= |-1 -1|\n"       +"B=|3 4 5|"
                + "    | 1  1|\n" ;
      x.a="";
      x.b="";
      x.c="";
      x.d="";
      x.e="";
      x.questaoCorreta=""; 
      questao.add(x);
         
        
   x.enunciado= "Para que o determinante da matriz seja nulo, o valor de a deve ser: \n"
                + "|1+a  -1|\n"
                + "| 3  1-a|\n";
      x.a="2 ou -2";
      x.b="1 ou 3";
      x.c="-3 ou 5";
      x.d="-5 ou 3";
      x.e="4 ou -4 ";
      x.questaoCorreta=x.a; 
      questao.add(x);
  
    x.enunciado =" O termo geral da matriz M2x2 é aij = 3i - 2j. O valor do determinante de M é:\n";
      x.a="2";
      x.b="3";
      x.c="4";
      x.d="5";
      x.e="6";
      x.questaoCorreta=""; 
      questao.add(x);
            
    
 
    x.enunciado= "Dadas as matrizes mostradas na figura adiante, o determinante da matriz A . B é"
                + "    | 1  3|\n"       +"  |-1 2|"
                + " A= | 2  4|\n"       +"B=| 3 1|";
      x.a="-1";
      x.b="6";
      x.c="10";
      x.d="12";
      x.e="14";
      x.questaoCorreta=""; 
      questao.add(x);
          
        
   x.enunciado= "A é uma matriz quadrada de ordem 2 e det(A)=7. Nessas condições, det(3A) e det(A-¢) valem respectivamente: \n";
      x.a="7 e -7";
      x.b="21 e 1/7";
      x.c="21 e -7";
      x.d="63 e -7";
      x.e="63 e 1/7";
      x.questaoCorreta=""; 
      questao.add(x);
          
        
   x.enunciado="- Sendo x e y, respectivamente, os determinantes das matrizes abaixo. É verdade que y/x é igual a"
                + "    |a b|\n"             +"  |-4a -4c|"
                + " A= |c d|\n"   +" e "    +"B=| 5b  5d|";
      x.a="1/20";
      x.b="-1/20";
      x.c="20";
      x.d="-20";
      x.e="3/20";
      x.questaoCorreta=""; 
      questao.add(x);
            
    x.enunciado= "Calcule o determionante da matriz 2x2 abaixo \n"
                + "|1 5|\n"
                + "|3 4|\n";
      x.a="";
      x.b="";
      x.c="-11";
      x.d="";
      x.e="";
      x.questaoCorreta=x.c; 
               
      questao.add(x);
        return questao;    } 
}
