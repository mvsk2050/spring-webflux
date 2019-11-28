
package com.ex.springwebflux.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ex.springwebflux.entity.Orders;
import com.ex.springwebflux.service.OrderService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/save")
	public void saveOrder(@RequestBody Orders o) {
		
		orderService.saveOrder(o);
	}
	
	@GetMapping("/getOrder/{orderId}")
	public Mono<Optional<Orders>> getOrder(@PathVariable("orderId") Integer orderId ) {

		return orderService.getOrder(orderId);
	}
	
	@GetMapping("/getAll")
	public Flux<List<Orders>> getOrders() {

		return orderService.getOrders();
	}
}
