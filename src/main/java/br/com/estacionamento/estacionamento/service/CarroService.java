package br.com.estacionamento.estacionamento.service;

import br.com.estacionamento.estacionamento.model.Carro;
import br.com.estacionamento.estacionamento.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro) {
        return carroRepository.save(carro);
    }
}
