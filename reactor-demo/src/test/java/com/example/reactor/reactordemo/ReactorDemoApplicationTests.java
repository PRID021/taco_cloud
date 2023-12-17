package com.example.reactor.reactordemo;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
class ReactorDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void createAFlux_just(){
		Flux<String> fruitFlux = Flux.just("Apple","Orange","Grape","Banana","Strawberry");
		// fruitFlux.subscribe(f -> System.out.println("Here's some fruit: " +f));
		StepVerifier.create(fruitFlux)
		.expectNext("Apple")
		.expectNext("Orange")
		.expectNext("Grape")
		.expectNext("Banana")
		.expectNext("Strawberry")
		.verifyComplete();
	}

	@Test
	public void createAFlux_stream() {
		Stream<String> fruitStream = Stream.of("Apple","Orange","Grape","Banana","Strawberry");
		Flux<String>  fruitFlux = Flux.fromStream(fruitStream);
		StepVerifier.create(fruitFlux)
		.expectNext("Apple")
		.expectNext("Orange")
		.expectNext("Grape")
		.expectNext("Banana")
		.expectNext("Strawberry")
		.verifyComplete();

	}

}
