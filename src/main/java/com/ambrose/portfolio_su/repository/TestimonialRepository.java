package com.ambrose.portfolio_su.repository;

import com.ambrose.portfolio_su.entities.Testimonials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestimonialRepository extends JpaRepository<Testimonials, Long> {
    // Các phương thức truy vấn tùy chỉnh có thể được thêm vào đây nếu cần

}
