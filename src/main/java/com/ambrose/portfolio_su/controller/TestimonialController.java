package com.ambrose.portfolio_su.controller;

import com.ambrose.portfolio_su.entities.Testimonials;
import com.ambrose.portfolio_su.repository.TestimonialRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/testimonials")
public class TestimonialController {
  private final TestimonialRepository testimonialRepository;

  @GetMapping
  public List<Testimonials> getAll() {
    return testimonialRepository.findAll();
  }

  @PostMapping
  public Testimonials create(@RequestBody Testimonials testimonial) {
    return testimonialRepository.save(testimonial);
  }

  @GetMapping("healthcheck")
  public String healthCheck() {
    return "OK";
  }
}
