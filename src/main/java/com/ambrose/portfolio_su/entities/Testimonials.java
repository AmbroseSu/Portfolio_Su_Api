package com.ambrose.portfolio_su.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
@Table(name = "testimonials")
public class Testimonials {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, length = 100)
  private String name;

  @Column(length = 100)
  private String position;

  @Column(length = 100)
  private String company;

  @Column(name = "image_url", length = 255)
  private String imageUrl;

  @Column(nullable = false)
  private Integer rating;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String content;

  @Column(name = "result_summary", length = 100)
  private String resultSummary;

  @Column(name = "created_at", nullable = false)
  private LocalDateTime createdAt = LocalDateTime.now();

  @Column(name = "updated_at", nullable = false)
  private LocalDateTime updatedAt = LocalDateTime.now();
}
