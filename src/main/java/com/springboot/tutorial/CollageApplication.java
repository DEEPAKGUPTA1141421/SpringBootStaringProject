package com.springboot.tutorial;
import com.springboot.tutorial.userData;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.*;
@RestController
@RequestMapping("/api/v1/employee")
public class CollageApplication{
	public Map<String,userData>ourmap;
	public Map<userData,String>userobjmap;
	public CollageApplication() {
		//comment
		ourmap=new HashMap<>();
		userobjmap=new HashMap<>();
	}
	@GetMapping("/getspecificuser/{id}")
	public userData getaSpecificUser(@PathVariable String id){
		return ourmap.get(id);
	}
	@PostMapping("/createstudent")
	public String CreateStudent(String name,String roll,int age) {
		userData obj=new userData(name,roll,age);
		ourmap.put(obj.id,obj);
		userobjmap.put(obj,obj.id);
		return obj.id;
	}
	@GetMapping("/getallstudent/{university}")
	public List<userData> getAllStudent(@PathVariable String university) {
        List<userData> studentList = new ArrayList<>();
        for (Map.Entry<String, userData> entry : ourmap.entrySet()) {
            studentList.add(entry.getValue());
        }
        return studentList;
    }
}
