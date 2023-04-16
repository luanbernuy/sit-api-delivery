package com.delivery.apidelivery.controller;

import com.delivery.apidelivery.entities.Food;
import com.delivery.apidelivery.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delivery")

public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }
    @GetMapping("/platos")
    public ResponseEntity<List<Food>> getListaPlatos(){
        return ResponseEntity.ok(this.orderService.getListaPlatos());

    }

    @PostMapping("/platos")
    public ResponseEntity<Food> agregarPlatos(Food food){
        this.orderService.agregarPlatos(food);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }
}
