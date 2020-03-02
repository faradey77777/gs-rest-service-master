package com.example.restservice.repo;

import com.example.restservice.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MessegeRepo extends JpaRepository<Message, Integer> {



}
