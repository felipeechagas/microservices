package br.com.felipe.foo.converters;

public class NumberConverter {

  public static Double convertToDouble(String strNumber){
    if(strNumber == null) return 0d;
    String number = strNumber.replaceAll(",", "."); //converter virgula em ponto
    if (isNumeric(number)) return Double.parseDouble(number);
    return 0d;
  }

  public static boolean isNumeric(String strNumber){
    if(strNumber == null) return false;
    String number = strNumber.replaceAll(",", "."); //converter virgula em ponto
    return number.matches("[-+]?[0-9]*\\.?[0-9]+");
  }
}
