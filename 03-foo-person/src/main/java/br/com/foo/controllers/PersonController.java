package br.com.foo.controllers;

import br.com.foo.model.Person;
import br.com.foo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  private PersonService personService;

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Person> findAll(){
    return personService.findAll();
  }

  //Retorna person pelo id
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Person findById(@PathVariable("id") String id){
    return personService.findById(id);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Person create(@RequestBody Person person){
    return personService.create(person);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Person update(@RequestBody Person person){
    return personService.update(person);
  }

  //Deleta person pelo id
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable("id") String id){
    personService.delete(id);
  }

}

/**
 *  Para verificar o resultado no browser,
 *  digite a url: localhost:8080/sum/num1/num2
 *  substitua num1 e num2 pelo numero desejado
 *
 *  Caso seja digitado letra ou caracteres diferentes, será apresentado uma mensagem de erro.
 */
