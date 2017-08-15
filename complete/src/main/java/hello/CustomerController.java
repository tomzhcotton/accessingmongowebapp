package hello;

import java.util.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CustomerController {
  @Autowired
  private CustomerRepository repository;

  @RequestMapping("/customers")
  public List<Customer> customers() {
    return repository.findAll();
  }

  @RequestMapping("/lastname")
  public List<Customer> customerLastName(
    @RequestParam(value="name") String name) {
    return repository.findByLastName(name);
  }
  @RequestMapping("/firstname")
  public Customer customerFirstName(
    @RequestParam(value="name", defaultValue="Smith") String name) {
    return repository.findByFirstName(name);
  }

}
