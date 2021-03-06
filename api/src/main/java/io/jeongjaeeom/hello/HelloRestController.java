package io.jeongjaeeom.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloRestController {

  @GetMapping("/hello")
  public ResponseEntity<?> hello(@RequestParam String name) {
    return ResponseEntity.ok("hello " + name);
  }

}
