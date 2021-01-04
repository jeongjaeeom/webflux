package io.jeongjaeeom.hello.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class HelloController {

  private final WebClient webClient;

  @GetMapping("/hello")
  private Mono<String> hello() {
    return webClient
        .get()
        .uri("http://localhost:8080/hello?name=jeongjae")
        .retrieve()
        .bodyToMono(String.class);
  }

}
