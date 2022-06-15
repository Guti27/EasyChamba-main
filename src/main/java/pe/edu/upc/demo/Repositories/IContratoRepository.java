package pe.edu.upc.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.demo.Entities.Contrato;

public interface IContratoRepository extends JpaRepository<Contrato, Integer> {

}
