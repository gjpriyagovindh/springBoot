package springboot.VerizonSpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class catalogController {
@GetMapping("/api/catalog")
//@ResponseBody
    // Method
public ArrayList<String>getCatalog() {
	Employee e = new Employee();
	return e.getCatalogList();
}
@PostMapping("/api/catalog")
String postCatalog(@RequestBody  String data) {
	return "Data posted " + data;
}
@PostMapping("/api/catalog2")
String postCatalog2(@RequestBody Employee data) {
 return "Data posted " + data.getUserid()+" "+data.getName();
 
}
@PostMapping("/api/catalog3")
String postCatalog3(@RequestBody List<Employee> data) {
 return "Data posted " + data.get(0).getUserid()+" "+data.get(0).getName()+" "+data.get(1).getUserid()+" "+data.get(1).getName();
}
@PutMapping("/api/catalog/{id}")
   String putCatalog(@PathVariable int id) {
	return "Data posted " + id;
	}
@DeleteMapping("/api/catalog/{id}")
boolean deleteCatalog(@PathVariable int id) {
	return true;
}

}