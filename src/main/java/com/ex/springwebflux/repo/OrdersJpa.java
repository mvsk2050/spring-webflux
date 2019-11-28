
package com.ex.springwebflux.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ex.springwebflux.entity.Orders;

@Repository
public interface OrdersJpa extends JpaRepository<Orders, Integer>{

}
