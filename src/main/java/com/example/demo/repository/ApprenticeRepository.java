package com.example.demo.repository;

import com.example.demo.model.Apprentice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ApprenticeRepository extends JpaRepository<Apprentice, Long> {
}