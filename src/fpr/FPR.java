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

  public int suma3 (int x, int y, int z){
    if (z == 0){
      return suma (x, y);
    }  else {
      return s(suma3(x, y, z-1));
    }
  }

  public int fact (int x){
    if (x == 0){
      return uno (x);
    } else {
      int [] operacion = {x-1, fact (x-1)};
      return prod (s(p(1, operacion)) ,p(2, operacion));
    }
  }

  public int not (int x){
    if (x == 0){
      return uno (x);
    } else {
      int [] operacion = {x-1, fact (x-1)};
      return z(p(1, operacion));
    }
  }

  public int pred (int x){
    if (x == 0){
      return z(x);
    } else {
      int [] operacion = {x-1, pred (x-1)};
      return p(1, operacion);
    }
  }

  public int dif (int x, int y) {
    if (y == 0){
      return x;
    } else {
      int [] operacion = {x, y-1, dif (x, y-1)};
      return pred(p(3, operacion));
    }
  }

  public int signo (int x){
    if (x == 0){
      return z(x);
    } else {
      int [] operacion = {x-1, fact (x-1)};
      return uno(p(1, operacion));
    }
  }
  
  public int menor (int x, int y){
    int [] operacion = {x, y};
    return signo(dif(p(2, operacion), p(1, operacion)));
  }
  
  public int difabs (int x, int y){
    int [] operacion = {x, y};
    return suma(dif(p(1,operacion), p(2, operacion)), dif (p(2,operacion), p(1, operacion)));
  }
  
  public int igual (int x, int y){
    int [] operacion = {x, y};
    return not(difabs(p(1,operacion),p(2,operacion)));
  }
  
  public int menorigual (int x, int y){
    int [] operacion = {x, y};
    return not(dif(p(1,operacion),p(2,operacion)));
  }
  
  public int mayor (int x, int y){
    int [] operacion = {x, y};
    return not(menorigual(p(1,operacion),p(2,operacion)));
  }
  
  public int max (int x, int y) {
    int [] operacion = {x, y};
    return suma(prod(mayor(p(1,operacion),p(2,operacion)),p(1,operacion)),prod(menorigual(p(1,operacion),p(2,operacion)),p(2,operacion)));
  }
  
  public int min (int x, int y) {
    int [] operacion = {x, y};
    return suma(prod(menorigual(p(1,operacion),p(2,operacion)),p(1,operacion)),prod(mayor(p(1,operacion),p(2,operacion)),p(2,operacion)));
  }
  
  public int f1 (int x, int y) {
    int [] operacion = {x, y};
    return suma(prod(mayor(p(1,operacion),p(2,operacion)),suma(p(1,operacion),p(2,operacion))),prod(menorigual(p(1,operacion),p(2,operacion)),dif(p(2,operacion),p(1,operacion))));
  }

}
