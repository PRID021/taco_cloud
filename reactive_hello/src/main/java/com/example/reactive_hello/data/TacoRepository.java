package com.example.reactive_hello.data;
import com.example.reactive_hello.domain.Taco;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface TacoRepository extends ReactiveCrudRepository<Taco,Long>{

    
}