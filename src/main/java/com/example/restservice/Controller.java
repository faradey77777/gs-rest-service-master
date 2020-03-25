package com.example.restservice;

import com.example.restservice.domain.Message;
import com.example.restservice.repo.MessegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {
    @Autowired
    private MessegeRepo messegeRepo;

//    @PostMapping
//    public String add(@RequestParam String text,@RequestParam String tag , Map<String, Object> model) {
//        Message message = new Message(text,tag);
//        Iterable<Message> messages = messegeRepo.findAll();
//        model.put("messeges",messages);
//        return "main";
//    }

    @GetMapping("/{id}")
    public Message getMessege(@PathVariable Integer id) {
        return messegeRepo.findById(id).orElse(null);
    }

//    @PutMapping
    @PostMapping("/add")
    public String mapping(@RequestBody String name) {
        Message message = new Message();
        message.setText(name);
        messegeRepo.save(message);
        return "index";
        // в гайдах вот тут возвращают название формы которую нужно вызвать
    }

//    @DeleteMapping
//    @ResponseStatus(HttpStatus.OK)
//    public void deleteUser(@RequestBody Integer id) {
//        Message message1 = messegeRepo.findById(id).orElse(null);
//        messegeRepo.deleteById(id);
//    }



}
