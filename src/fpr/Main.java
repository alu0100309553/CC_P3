package fpr;

public class Main {

  public static void main(String[] args) {
    FPR prueba = new FPR();
    System.out.println(prueba.pot(3, 2));
    System.out.println(prueba.suma3(2, 2, 2));
    System.out.println(prueba.fact(4));
    System.out.println(prueba.not(4));
    System.out.println(prueba.not(0));
    System.out.println(prueba.pred(9));
    System.out.println(prueba.dif(8, 7));
    System.out.println(prueba.menor(8, 8));
    System.out.println(prueba.difabs(10, 8));
    System.out.println(prueba.difabs(8, 10));
    System.out.println(prueba.igual(8, 8));
    System.out.println(prueba.igual(8, 10));
    System.out.println(prueba.menorigual(8, 8));
    System.out.println(prueba.menorigual(8, 10));
    System.out.println(prueba.menorigual(11, 10));
    System.out.println(prueba.mayor(8, 8));
    System.out.println(prueba.mayor(8, 10));
    System.out.println(prueba.mayor(11, 10));
    System.out.println(prueba.max(11, 11));
    System.out.println(prueba.max(3, 3));
    System.out.println(prueba.min(11, 10));
    System.out.println(prueba.min(10, 10));
    System.out.println(prueba.f1(10, 10));
    System.out.println(prueba.f1(8, 10));
    System.out.println(prueba.f1(10, 8));
    
    // TODO Auto-generated method stub

  }

}
