package com.example.restservice;

import com.example.restservice.domain.Message;
import com.example.restservice.repo.MessegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
	@Autowired
	private MessegeRepo messegeRepo;
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/put")
	public Greeting greeting(@RequestParam String name) {
		Message message = new Message();
		message.setText(name);
		messegeRepo.save(message);
//		Optional<String> first = massegeRepo.findAll()
//				.stream()
//				.filter(message1 -> message1.getId() != null && message1.getId().equals(1))
//				.map(message1 -> message1.getText())

//				.findFirst();
		return new Greeting(message.getId(), message.getText());
	}

	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id){
//		Message message = messegeRepo.findById(id);
//		messegeRepo.delete(messege);
		return "null";
	}

}
