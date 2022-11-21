package br.com.orei.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.orei.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
