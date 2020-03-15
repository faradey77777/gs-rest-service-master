package com.example.restservice.repo;

import com.example.restservice.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessegeRepo extends JpaRepository<Message, Integer> {


//    Message getByText();

}
