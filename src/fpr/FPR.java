package fpr;

public class FPR {
  public int z (int x){
    return 0;
  }
  public int s (int x){
    return x+1;
  }
  public int uno (int x){
    return 1;
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
      return suma (x, prod(x, y-1));
    }
  }
  public int pot (int x, int y){
    if (y == 0){
      return uno (x);
    } else {
      return prod (x ,pot(x, y-1));
    }
  }

}
