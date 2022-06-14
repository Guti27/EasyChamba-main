package pe.edu.upc.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.demo.Entities.Postulante;

public interface IPostulanteRepository extends JpaRepository<Postulante, Integer> {

}
