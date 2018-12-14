package projeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Weslley Leocadio
 */
public class Questao {
    String enunciado;
    String a, b, c, d, e;
    String questaoCorreta;
    
    public Questao() {
    }

    public Questao(String enunciado, String questaoCorreta) {
        this.enunciado = enunciado;
        this.questaoCorreta = questaoCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getQuestaoCorreta() {
        return questaoCorreta;
    }

    public void setQuestaoCorreta(String questaoCorreta) {
        this.questaoCorreta = questaoCorreta;
    }

    @Override
    public String toString() {
        return "Questao{" + "enunciado=" + enunciado + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", questaoCorreta=" + questaoCorreta + '}';
    }
    
    
}
