
package com.ex.springwebflux.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ex.springwebflux.entity.Orders;
import com.ex.springwebflux.repo.OrdersJpa;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class OrderService {

	@Autowired
	OrdersJpa ordersJpa;

	public void saveOrder(Orders o) {

		ordersJpa.save(o);
	}
	
	public Mono<Optional<Orders>> getOrder(Integer orderId) {

		return Mono.just(ordersJpa.findById(orderId));
	}
	
	public Flux<List<Orders>> getOrders() {

		return Flux.just(ordersJpa.findAll());
	}
}
