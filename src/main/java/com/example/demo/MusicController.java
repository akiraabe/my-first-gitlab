package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MusicController
 */
@RequestMapping("/music")
@RestController
public class MusicController {

  /**
   * Play music.
   * 
   * @return message string.
   */
  @GetMapping("/play")
  public String play() {
    return "Playing music";
  }

  @GetMapping("/stop")
  public String stop() {
    return "Stopping music";
  }

}
