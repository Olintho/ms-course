package br.com.orei.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.orei.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
