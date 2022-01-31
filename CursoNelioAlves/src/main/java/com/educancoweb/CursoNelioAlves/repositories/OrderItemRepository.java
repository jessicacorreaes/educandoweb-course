package com.educancoweb.CursoNelioAlves.repositories;


import com.educancoweb.CursoNelioAlves.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
