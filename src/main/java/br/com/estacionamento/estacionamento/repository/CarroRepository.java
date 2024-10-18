package br.com.estacionamento.estacionamento.repository;

import br.com.estacionamento.estacionamento.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}
