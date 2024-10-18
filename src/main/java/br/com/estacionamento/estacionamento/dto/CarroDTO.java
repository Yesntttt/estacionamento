package br.com.estacionamento.estacionamento.dto;

import br.com.estacionamento.estacionamento.model.Carro;
import lombok.Data;

@Data
public class CarroDTO {

    private Long id;

    private String marca;

    private String modelo;

    private String placa;

    public CarroDTO() {

    }

    public CarroDTO(Carro carro) {
        this.id = carro.getId();
        this.marca = carro.getMarca();
        this.modelo = carro.getModelo();
        this.placa = carro.getPlaca();
    }
}
