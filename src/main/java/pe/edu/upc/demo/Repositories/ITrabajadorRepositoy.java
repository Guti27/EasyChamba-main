package pe.edu.upc.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.demo.Entities.Trabajador;

public interface ITrabajadorRepositoy extends JpaRepository<Trabajador, Integer> {

}
