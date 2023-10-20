package psc;

public class Retangulo {
    private float altura, largura;

   
     //Construtor padrão que inicializa a altura e largura como 0.
    
    public Retangulo() {
        altura = 0;
        largura = 0;
    }
    
     //Obtém a altura do retângulo.
     
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do retângulo.
     * @param alt A altura do retângulo.
     */
    public void setAltura(float alt) {
        altura = alt;
    }

   
     //Obtém a largura do retângulo.

    public float getLargura() {
        return largura;
    }

   // Define a largura do retângulo.
    
    public void setLargura(float larg) {
        largura = larg;
    }

    //Calcula a área do retângulo.

    public float calculaArea() {
        return altura * largura;
    }

   //Calcula o perímetro do retângulo.
    
    public float calculaPerimetro() {
        return 2 * altura + 2 * largura;
    }

    //Retorna uma string formatada com as informações do retângulo.

    public String exibe() {
        return "Altura: " + String.format("%.2f", altura) +
               "\nLargura: " + String.format("%.2f", largura) +
               "\nÁrea: " + String.format("%.2f", calculaArea()) +
               "\nPerímetro: " + String.format("%.2f", calculaPerimetro());
    }
}

package psc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a altura do retângulo: ");
        ret.setAltura(input.nextFloat());
        System.out.print("Informe a largura do retângulo: ");
        ret.setLargura(input.nextFloat());
        System.out.println(ret.exibe());
    }
}