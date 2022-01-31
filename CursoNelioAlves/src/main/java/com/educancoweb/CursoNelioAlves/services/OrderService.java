package com.educancoweb.CursoNelioAlves.services;

import com.educancoweb.CursoNelioAlves.entities.Order;
import com.educancoweb.CursoNelioAlves.entities.User;
import com.educancoweb.CursoNelioAlves.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

        @Autowired
        private OrderRepository repository;

        public List<Order> findAll(){
            return repository.findAll();
        }
        public Order findById(Long id){
            Optional<Order> obj = repository.findById(id);
            return obj.get();
        }
    }

