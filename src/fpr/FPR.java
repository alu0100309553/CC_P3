package fpr;
/*
 * Author: Rubén Labrador Páez.
 * Email: alu0100309553@ull.edu.es
 * Tit: Grado Ingeniería Informática - Universidad de La Laguna
 * Course: 4 - Computación
 * Subject: Complejidad Computacional
 * Practice: 3
 * Class/Program: Funciones primitivas recursivas
 * File: FPR.java
 * Description: Programa que implementa operación como Funciones Primitivas Recursivas
 * @author Rubén Labrador Páez
 * @version 1.0.0 2/11/2016
 **/
public class FPR {

	// z(x) función cero
	public int z (int x){
		return 0;
	}

	// s(x) función sucesor
	public int s (int x){
		return x+1;
	}

	// p(x) función de proyección
	public int p (int i, int[] valores){
		return valores[i-1];
	}

	// uno (x) devuelve siempre 1
	public int uno (int x){
		return s(z(x));
	}

	// suma (x, y) suma de los términos x e y
	public int suma (int x, int y){
		if (y == 0){
			return x;
		}  else {
			return s(suma(x, y-1));
		}
	}

	// prod (x, y) producto de los términos x e y
	public int prod (int x, int y){
		if (y == 0){
			return z(x);
		} else {
			int [] operacion = {x, y-1, prod (x, y-1)};
			return suma (p(1, operacion) ,p(3, operacion));
		}
	}

	// pot (x, y) potencia x^y
	public int pot (int x, int y){
		if (y == 0){
			return uno (x);
		} else {
			int [] operacion = {x, y-1, pot (x, y-1)};
			return prod (p(1, operacion) ,p(3, operacion));
		}
	}
	
	// otras funciones implementadas no necesarias para el objetivo de la práctica
	// suma de tres términos
	public int suma3 (int x, int y, int z){
		if (z == 0){
			return suma (x, y);
		}  else {
			return s(suma3(x, y, z-1));
		}
	}

	// fact(x) factorial de x
	public int fact (int x){
		if (x == 0){
			return uno (x);
		} else {
			int [] operacion = {x-1, fact (x-1)};
			return prod (s(p(1, operacion)) ,p(2, operacion));
		}
	}

	// not (x) negación de x
	public int not (int x){
		if (x == 0){
			return uno (x);
		} else {
			int [] operacion = {x-1, fact (x-1)};
			return z(p(1, operacion));
		}
	}

	// pred (x) predecesor de x x-1
	public int pred (int x){
		if (x == 0){
			return z(x);
		} else {
			int [] operacion = {x-1, pred (x-1)};
			return p(1, operacion);
		}
	}

	// dif (x, y) resta y a x, x-y
	public int dif (int x, int y) {
		if (y == 0){
			return x;
		} else {
			int [] operacion = {x, y-1, dif (x, y-1)};
			return pred(p(3, operacion));
		}
	}

	// signo (x) devuevel 1 si x > 0 0 si x<0
	public int signo (int x){
		if (x == 0){
			return z(x);
		} else {
			int [] operacion = {x-1, fact (x-1)};
			return uno(p(1, operacion));
		}
	}

	// devuelve 1 si x < y 0 si x > y
	public int menor (int x, int y){
		int [] operacion = {x, y};
		return signo(dif(p(2, operacion), p(1, operacion)));
	}

	// diferencia en valor absoluto entre x e y
	public int difabs (int x, int y){
		int [] operacion = {x, y};
		return suma(dif(p(1,operacion), p(2, operacion)), dif (p(2,operacion), p(1, operacion)));
	}

	// devuelve 1 si x e y son iguales, 0 en caso contrario
	public int igual (int x, int y){
		int [] operacion = {x, y};
		return not(difabs(p(1,operacion),p(2,operacion)));
	}

	// devuelve 1 si x<= que y, 0 en caso contrario
	public int menorigual (int x, int y){
		int [] operacion = {x, y};
		return not(dif(p(1,operacion),p(2,operacion)));
	}

	// devuelve 1 si x > que y, 0 en caso contrario
	public int mayor (int x, int y){
		int [] operacion = {x, y};
		return not(menorigual(p(1,operacion),p(2,operacion)));
	}

	// devuelve el máximo de dos valores
	public int max (int x, int y) {
		int [] operacion = {x, y};
		return suma(prod(mayor(p(1,operacion),p(2,operacion)),p(1,operacion)),prod(menorigual(p(1,operacion),p(2,operacion)),p(2,operacion)));
	}

	// devuelve el minimo de dos valroes
	public int min (int x, int y) {
		int [] operacion = {x, y};
		return suma(prod(menorigual(p(1,operacion),p(2,operacion)),p(1,operacion)),prod(mayor(p(1,operacion),p(2,operacion)),p(2,operacion)));
	}

	// f1(x, y) = x + y, si x > y f1(x, y) = y – x, si x ≤ y
	public int f1 (int x, int y) {
		int [] operacion = {x, y};
		return suma(prod(mayor(p(1,operacion),p(2,operacion)),suma(p(1,operacion),p(2,operacion))),prod(menorigual(p(1,operacion),p(2,operacion)),dif(p(2,operacion),p(1,operacion))));
	}

}
