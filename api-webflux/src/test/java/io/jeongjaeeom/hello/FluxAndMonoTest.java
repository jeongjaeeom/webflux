package io.jeongjaeeom.hello;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxAndMonoTest {

  @Test
  public void test() {
    List<Integer> elements = new ArrayList<>();

    Flux.just(1, 2, 3, 4)
        .log()
        .subscribe(elements::add);

    System.out.println(elements);
  }
}
