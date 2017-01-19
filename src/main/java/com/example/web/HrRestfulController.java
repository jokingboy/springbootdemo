package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.HrRepository;
import com.example.vo.Hr;

@RestController
@RequestMapping("/hr")
public class HrRestfulController {

	@Autowired
	private HrRepository hrRepository;


	// 사용법 : http://localhost:8080/hr/add?name=b
		
	@RequestMapping("/add")
	public Hr add(Hr hr) {

		Hr helloData = hrRepository.save(hr);

		return helloData;
	}

	@RequestMapping("/list")
	public List<Hr> list(Model model) {

		List<Hr> helloList = hrRepository.findAll();

		return helloList;
	}
	
	//http://localhost:8080/hr/강복영
	@RequestMapping("{name}")
	public List<Hr> getHr(@PathVariable String name) {

		List<Hr> helloList = hrRepository.findByName(name);

		return helloList;
	}
	
	
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}
}
