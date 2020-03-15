package com.example.restservice;

import com.example.restservice.domain.Message;
import com.example.restservice.repo.MessegeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private MessegeRepo messegeRepo;

    @GetMapping("/{id}")
    public Message getMessege(@PathVariable Integer id) {
        return messegeRepo.findById(id).orElse(null);
    }

    @PostMapping @PutMapping("/")
    public Message mapping(@RequestBody String name) {
        Message message = new Message();
        message.setText(name);
        messegeRepo.save(message);
        return message;
    }

    @DeleteMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@RequestBody Integer id) {
        Message message1 = messegeRepo.findById(id).orElse(null);
        messegeRepo.deleteById(id);
    }

}
