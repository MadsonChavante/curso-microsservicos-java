package com.curso.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
