package br.com.felipe.foo.controllers;

import br.com.felipe.foo.converters.NumberConverter;
import br.com.felipe.foo.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

  private SimpleMath simpleMath = new SimpleMath();

  //somar
  @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {

    if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
  }

  //subtração
  @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{

    if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
  }

  //multiplicação
  @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{

    if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
  }

  //Divisão
  @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{

    if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.division(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
  }

  //Media
  @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception{

    if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
  }

  //Raiz Quadrada
  @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
  public Double squareRoot(@PathVariable("number") String number) throws Exception{

    if (!NumberConverter.isNumeric(number)){
      throw new UnsupportedOperationException("Please set a numeric value!");
    }
    return simpleMath.squareRoot(NumberConverter.convertToDouble(number));
  }

}

/**
 *  Para verificar o resultado no browser,
 *  digite a url: localhost:8080/sum/num1/num2
 *  substitua num1 e num2 pelo numero desejado
 *
 *  Caso seja digitado letra ou caracteres diferentes, será apresentado uma mensagem de erro.
 */
