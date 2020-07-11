/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.tds;
import java.util.Scanner;


public class Exceptiom { {
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int divisao = numero1/numero2;

		//Exibe o resultado
		System.out.println("O resultado é: " + divisao);
		
		sc.close();
	}
}
