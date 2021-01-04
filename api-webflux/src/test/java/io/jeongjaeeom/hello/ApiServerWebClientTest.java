package io.jeongjaeeom.hello;

import io.jeongjaeeom.hello.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootTest
public class ApiServerWebClientTest {

  @Autowired
  private HelloService helloService;

  @Test
  public void testHello() throws InterruptedException {
    helloService.hello();
    /*WebClient client1 = WebClient.create();
    Mono<String> stringMono = client1
        .get()
        .uri("http://localhost:8080/hello?name=jeongjae")
        .retrieve()
        .bodyToMono(String.class);

    log.info("stringMono: {}", stringMono);*/

    Thread.sleep(5000);
  }

}
