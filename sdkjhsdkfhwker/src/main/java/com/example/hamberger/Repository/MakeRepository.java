package com.example.hamberger.Repository;

import com.example.hamberger.domain.StudyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakeRepository extends JpaRepository<StudyEntity, Long> {

}
