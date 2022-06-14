package pe.edu.upc.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.Entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	public Users findByUsername(String username);
}