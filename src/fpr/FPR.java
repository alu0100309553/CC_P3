package fpr;

public class FPR {
	public int z (int x){
		return 0;
	}
	public int s (int x){
		return x+1;
	}
	public int p (int i, int[] valores){
		return valores[i-1];
	}
	public int uno (int x){
		return s(z(x));
	}

	public int suma (int x, int y){
		if (y == 0){
			return x;
		}  else {
			return s(suma(x, y-1));
		}
	}
	public int prod (int x, int y){
		if (y == 0){
			return z(x);
		} else {
			int [] operacion = {x, y-1, prod (x, y-1)};
			return suma (p(1, operacion) ,p(3, operacion));
		}
	}
	public int pot (int x, int y){
		if (y == 0){
			return uno (x);
		} else {
			int [] operacion = {x, y-1, pot (x, y-1)};
			return prod (p(1, operacion) ,p(3, operacion));
		}
	}

}
