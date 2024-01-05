package com.example.study01.repository;

import com.example.study01.entity.MakeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MakeRepository  extends JpaRepository<MakeEntity, Long> {

    Optional<MakeEntity> findById(Long sid);
}
