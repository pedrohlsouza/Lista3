
package com.mycompany.lista3;

import java.util.Scanner;

public class ex11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int n1, n2, soma = 0;
        System.out.println("Informe dois números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        for (int i = n1 + 1; i < n2; i++) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}
