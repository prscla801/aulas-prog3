
package exemplo;

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite os valores x e y do primeiro e segundo ponto respectivamente: ");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        
        s.close();
        
        
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(distancia);
    }
    
}
