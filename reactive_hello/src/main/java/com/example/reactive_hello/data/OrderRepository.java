package com.example.reactive_hello.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.reactive_hello.domain.TacoOrder;

public interface OrderRepository extends ReactiveCrudRepository<TacoOrder, Long>{

}