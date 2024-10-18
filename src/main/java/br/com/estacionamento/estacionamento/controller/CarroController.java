package br.com.estacionamento.estacionamento.controller;

import br.com.estacionamento.estacionamento.dto.CarroDTO;
import br.com.estacionamento.estacionamento.model.Carro;
import br.com.estacionamento.estacionamento.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
