package fpr;
/*
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 4 - Computación
 * Subject: Complejidad Computacional
 * Practice: 3
 * Class/Program: Funciones primitivas recursivas
 * File: Main.java
 * Description: Programa que implementa operación como Funciones Primitivas Recursivas
 * @author Rubén Labrador Páez
 * @version 1.0.0 2/11/2016
 **/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		FPR prueba = new FPR();
		int x = 0;
		int y = 0;
		if (args.length < 2){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("Intruduzca valor para la base:");
				x = Integer.parseInt(br.readLine());
				System.out.println("Intruduzca valor para el exponente:");
				y = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				System.err.println("Error: Parámetros incorrectos");
				System.exit(1);
				e.printStackTrace();
			}
		}else {
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
		}
		System.out.println(prueba.pot(x, y));
	}
}
