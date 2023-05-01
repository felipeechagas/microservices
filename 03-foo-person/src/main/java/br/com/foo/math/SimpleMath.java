package br.com.foo.math;

/**
 *  simple math - Contém as operações básicas da matemática
 *  que serão chamadas nos endpoints do controller
 */
public class SimpleMath {

  public  Double sum(Double numberOne, Double numberTwo){
    return numberOne + numberTwo;
  }

  public Double subtraction(Double numberOne, Double numberTwo){
    return numberOne - numberTwo;
  }

  public Double multiplication(Double numberOne, Double numbertwo){
    return numberOne * numbertwo;
  }

  public Double division(Double numberOne, Double numbertwo){
    return numberOne / numbertwo;
  }

  public Double mean(Double numberOne, Double numbertwo){
    return (numberOne + numbertwo)/2;
  }

  public Double squareRoot(Double number){
    return (Double) Math.sqrt(number);
  }
}
