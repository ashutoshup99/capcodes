package com.cap.userspwejp.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.userspwejp.entities.Userg;


public interface UsergRepository extends JpaRepository<Userg, Integer> {
	Optional<Userg> findByEmail(String email);
	Optional<Userg> findByEmailAndPassword(String email,String password);
}
