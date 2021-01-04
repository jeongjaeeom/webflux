package io.jeongjaeeom.hello.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class HelloService {

  private final WebClient webClient;

  public void hello() {
    Mono<String> stringMono = webClient
        .get()
        .uri("http://localhost:8080/hello?name=jeongjae")
        .retrieve()
        .bodyToMono(String.class);

    //String block = stringMono.block();

    stringMono.subscribe(s -> log.info("stringMono!!!: {}", s));

    //log.info("stringMono: {}", block);
  }

}
