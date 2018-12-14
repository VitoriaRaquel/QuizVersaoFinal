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
class Questoes3 {
    private int num;
    ArrayList<Questao> questao = new ArrayList<Questao>();
    
    ///int op= this.num;
    ///Random gerador = new Random(1);
    ///int x = gerador.nextInt(16);
    
    public Questoes3(){
        popularColecao();
    }
    
    public int randomizar(){
        Random r = new Random();
        int numeroSorteado = r.nextInt(10);
        
        return numeroSorteado;
    }
    
    public void popularColecao(){
        Questao y = new Questao();
        y.enunciado =" \n=*(MACK) Calcule o valor do determinante: \n"
                + "|1 1 3 1|\n"
                + "|1 3 3 2|\n"
                + "|2 5 3 3|\n"
                + "|1 1 1 1|\n";
        y.a = "-4";
        y.b = "-2";
        y.c = "0";
        y.d = "1";
        y.e = "2";
        y.questaoCorreta=y.b;
        questao.add(y);

        /*RESPOSTA: B*
            "|1 1 3 1|"
            "|1 3 3 2|"
            "|2 5 3 3|"
            "|1 1 1 1|"
	Escolhemos a ultima linha como base
	 det = 1 x C41 + 1 x C42 + 1 x C43 + 1 x C44
	Ao calcularmos os cofatores descobrimos que: C41 = 0; C42 = 3; C43 = -1; C44 = -6 
	Então substituindo na formula...
	det = 1 x 0 + 1 x 3 + 1 */
        
        y = new Questao();
        y.enunciado="\n -Calcule o valor do determinante \n"
                + "| 2  3  -1  0 |\n"
                + "| 4 -2   1  3 |\n"
                + "| 1 -5   2  1 | \n"
                + "| 0  3  -2  6 |\n";
        y.a="13";
        y.b="14";
        y.c="24";
        y.d="1";
        y.e="-24";
        y.enunciado=y.a;
        questao.add(y);
              
       /*RESPOSTA: A*
       
	 "| 2  3  -1  0 |"
         "| 4 -2   1  3 |"
         "| 1 -5   2  1 |"
         "| 0  3  -2  6 |" 
	Escolhemos a primeira linha como base
	 det = 2 x C11 + 3 x C12 + (-1) x C13 + 0 x C14
	Ao calcularmos os cofatores descobrimos que: C11 = 17; C12 = -44; C13 = -111 
	* Não calculamos o C14, porque qualquer número multiplicado por 0 = 0
	Então substituindo na formula...
	 det = 2 x 17 + 3 x (-44) + (-1) x (-111) + 0
	 34 - 132 + 111 = */
       
       y = new Questao();
        y.enunciado="\n-Calcule o valor do determinante \n"
                + "| 3  1  -2  1 |\n"
                + "| 5  2   2  3 |\n"
                + "| 7  4  -5  0 | \n"
                + "| 1 -1  11  2 |\n";
        y.a="110";
        y.b="107";
        y.c="108";
        y.d="-10";
        y.e="10";
        y.questaoCorreta=y.c;
        questao.add(y);
       /*RESPOSTA: C*

	| 3  1  -2  1 |
        | 5  2   2  3 |
        | 7  4  -5  0 | 
        | 1 -1  11  2 |
	Escolhemos a tericira linha como base
	 det = 7 x C31 + 4 x C32 + (-5) x C33 + 0 x C34
	Calculando os cofatores descobrimos que: C31 = 9; C32 = 20; C33 = 7
	 Não calculamos o C34, porque qualquer número multiplicado por 0 = 0
	Então substituindo na formula...
	 det = 7 x 9 + 4 x 20 + (-5) x 7 + 0 
	 63 + 80 - 35 = 108*/
        
        y = new Questao();
        y.enunciado="\n- Calcule o valor do determinante \n"
                + "| 4  0   0  0 |\n"
                + "| 2 -1   3  1 |\n"
                + "| 1 -3   2  1 | \n"
                + "| 0  2  -2  5 |\n";
              y.a="25";
              y.b="-1";
              y.c="200";
              y.d="163";
              y.e="-25";
              y.questaoCorreta=y.d;
              questao.add(y);
              
     /*RESPOSTA: D*
        Escolhemos a primeira linha como base
	det = 4 x C11 + 0 x C12 + 0 x C13 + 0 x C14
	Calculando os cofatores descobrimos que: C11 = 41
	* Não calculamos o C1, C13, e C14 , porque qualquer número multiplicado por 0 = 0
	Então substituindo na formula...
	 det = 4 x 41 = 163*/
     
     y = new Questao();
        y.enunciado="\n- O determinante da matriz A abaixo vale 2 \n"
             +  " A=| a  b  c  d |\n"
             +  "   | e  f  g  h |\n"
             +  "   | i  j  k  l |\n"
             +  "   | m  n  o  p |\n"
        


             +"- Qual o valor do determinante da matriz B abaixo?\n"
                    +  "B =| -5a -5b -5c -5d |\n"
                        + "|  m   n    o   p |\n"
                        + "| -2i -2j -2k -2l |\n"
                        + "|  3e  3f  3g  3h |\n";
        y.a="-16";
        y.b="2";
        y.c="3";
        y.d="4";
        y.e="-60";
        questao.add(y);
        y.questaoCorreta=y.e;
        /*RESPOSTA: E
	O determinante de A ficará negativo, pois, na matriz B as linhas trocaram de posição, a segunda com a quarta, então A = -2. 
	É só multiplicar A, pelos valores que multiplicam as linhas de B...
        detB = -2 x -5 x -2 x 3 = -60*/
        
        y = new Questao();
        y.enunciado="\nConsidere a seguinte matriz:"
                + "                | x 0 0 0 |\n"
		+ "                | 1 x 1 2 |\n"
		+"                 | 2 0 x 3 |\n"
                +"                 | 0 0 0 3 |\n"

              +"\n Sabendo-se que det A = 81,podemos dizer que o valor de x²é: ";
        y.a="9";
        y.b="Número par";
        y.c="Maior que 100";
        y.d="Menor que 7";
        y.e="Número impar";
        y.questaoCorreta=y.a; 
        questao.add(y);
        /*resposta A
	Começamos selecionando a linha fixa, escolhemos a última
	det = 0 x C41 + 0 x C42 + 0 x C43 + 3 x C44
	*Qualquer número multiplicado por 0 = 0
	Com isso, calculamos o C44 e descobrimos que ele é igual a X^3 
	Então, subsituimos...
	81 = 0 + 0 + 0 + 3 x X^3
	27 = X^3
	X = 3
	X^2 = 9*/
        
        y = new Questao();
        y.enunciado= " \nO determinante da matriz: | 1 -1 2 0 |\n" 
                    +"                           | 0  3 4 0 |\n" 
                    +"                           | 5  1 2 0 |\n" 
                    +"                           | 0  0 0 1 |\n"
                    +"\nÉ igual a: \n";
        y.a="-24";
        y.b="-48";
        y.c="0";
        y.d="24";
        y.e="48";
        y.questaoCorreta=y.b;
        questao.add(y);
        /*resposta: b*
	Escolhemos a ultima linha para ser a linha usada como base.
	det = 0 x C41 + 0 x C42 + 0 x C43 + 1 x C44
	*Qualquer número multiplicado por 0 = 0
	Descobrimos o C44 = -48
 	Substituimos na formula...
	det = 1 x (-48) = -48 */
        
        y = new Questao();
        y.enunciado="\no valor do determinante é:\n"
               +"    | 1 1 3 1 | \n" 
               +"    | 1 3 3 2 |\n"
               +"    | 2 5 3 3 |\n"
               +"    | 1 1 1 1 |\n";
        y.a="-4";
        y.b="-2";
        y.c="0";
        y.d="1";
        y.e="2";
        y.questaoCorreta=y.c;
        questao.add(y);
       /*resposta:c*
	Escoolhemos a quarta linha pra usar-la como base
	det = 1 x C41 + 1 x C42 + 1 x C43 + 1 x C44
	Descobrimos que os valores dos Cofatores são correspondentes á C41 = 3 ; C42 = 3; C43 = 0; C44 = -6
	Colocamos na formula para descobrirmos o valor do determinante da matriz...
	det = 1 x 3 + 1 x 3 + 1 x 0 + 1 x -6 = 0*/
       
       y = new Questao();
       y.enunciado=" O valor do determinante é:"
               +"  | 1  0  2 0 |\n" 
               +"  | 3 -2  1 5 |\n"
               +"  | 6  0 -1 4 |\n"
               +"  |-5  0  3 2 |\n";
        y.a="-100";
        y.b="156";
        y.c="154";
        y.d="0";
        y.e="-154";
        y.questaoCorreta=y.b;
        questao.add(y);
        /*resposta: b
        Escolhemos a primeira linha para usar como base
	det =  1 x C11 + 0 x C12 + 2 x C13 + 0 x C14
	Descobrimos que os valores dos Cofatores são respectivamente iguais á C11 = 28 e C12 = 64
	Os demais cofatores estão sendo multiplicados por zero, logo seu resultado será igual a 0
	det =  1 x 28 + 0 + 2 x 64 + 0 = 156*/
        
        y = new Questao();
        y.enunciado=" O valor do determinante é: <br/>"
                
               +"  | 1 1 1 -1 | \n" 
               +"  | 0 1 0  0 | \n"
               +"  | 1 0 0  0 | \n>"
               +"  |-1 2 0  1 | \n";
        y.a="1";
        y.b="2";
        y.c="0";
        y.d="-1";
        y.e="-2";
        y.questaoCorreta=y.d;
       
       /*resposta: d
	Escolhemos a segunda linha para usar como base
	det =  0 x C21 + 1 x C22 + 0 x C23 + 0 x C24
	Descobrimos que os valores do Cofatore é igual á C22 = -1
	Os demais cofatores estão sendo multiplicados por zero, logo seu resultado será igual a 0
	det =  0 - 1 + 0 + 0 = -18*/
       questao.add(y);
    }
}
