package br.com.estacionamento.estacionamento.service;

import br.com.estacionamento.estacionamento.model.Carro;
import br.com.estacionamento.estacionamento.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public List<Carro> buscarTodosCarros() {
        return carroRepository.findAll();
    }

    public Carro buscarCarroPorId(Long id) {
        return carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carro não encontrado!"));
    }

    public Carro editarCarro(Long id, Carro carro) {
        if (!id.equals(carro.getId())) {
            throw new RuntimeException("O id não corresponde a esse carro!");
        }
        Carro carroEditado = buscarCarroPorId(id);
        carroEditado.setMarca(carro.getMarca());
        carroEditado.setPlaca(carro.getPlaca());
        carroEditado.setModelo(carro.getModelo());
        carroRepository.save(carroEditado);
        return carroEditado;
    }

    public void deletarCarro(Long id) {
        Carro carro = buscarCarroPorId(id);
        carroRepository.delete(carro);
    }
}
