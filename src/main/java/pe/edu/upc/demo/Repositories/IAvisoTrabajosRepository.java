package pe.edu.upc.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.demo.Entities.AvisoTrabajo;

public interface IAvisoTrabajosRepository extends JpaRepository<AvisoTrabajo, Integer> {

}
