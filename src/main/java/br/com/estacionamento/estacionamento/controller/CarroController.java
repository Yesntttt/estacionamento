package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.dto.CarroDTO;
import br.com.estacionamento.estacionamento.model.Carro;
import br.com.estacionamento.estacionamento.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @PostMapping("/")
    public CarroDTO cadastrarCarro(@RequestBody Carro carro) {
        Carro retorno = carroService.cadastrarCarro(carro);
        return new CarroDTO(retorno);
    }

    @GetMapping()
    public List<Carro> buscarTodosCarros() {
        return carroService.buscarTodosCarros();
    }

    @GetMapping("/{id}")
    public Carro buscarCarroPorId(@PathVariable Long id) {
        return carroService.buscarCarroPorId(id);
    }

    @PutMapping("/{id}")
    public Carro editarCarro(@PathVariable Long id, @RequestBody Carro carro) {
        return carroService.editarCarro(id, carro);
    }

    @DeleteMapping("/{id}")
    public void deletarCarro(@PathVariable Long id) {
        carroService.deletarCarro(id);
    }
}
