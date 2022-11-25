package entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Teste {

	@Test
	public void test() {
		
		Hotel hotel = new Hotel();
		
		//Teste que define que minha lista de hospedes é igual a 0
		assertEquals(hotel.getHospede().size(), 0);
		
		
		//Adicionar hospedes para teste
		hotel.cadastrarHospede(new Hospede("Murilo", "43258499803", 27, 1234567));
		hotel.cadastrarHospede(new Hospede("Sarah", "44512389799", 26, 2234567));
		
		//Teste para ver se os hospedes foram cadastrados
		assertEquals(hotel.getHospede().size(), 2);
		
		
		//Buscar hospedes
		Hospede hospedeEncontrado = hotel.buscarHospedePorCpf("44512389799");
		
		//Teste para ver se encontra hospede
		assertEquals(hospedeEncontrado.getCpf(), "44512389799");
		
		//Teste que define a lista de quartos, que é igual a 0
		assertEquals(hotel.getQuarto().size(), 0);
		
		//Adicionar quartos
		hotel.cadastrarQuarto(new Quarto("Suite", 302, 3, new Reserva(3, 302)));
		hotel.cadastrarQuarto(new Quarto("Simples", 404, 4, new Reserva(4, 405)));
		
		//Teste para ver se os quartos foram cadastrados
		assertEquals(hotel.getQuarto().size(), 2);
		
		//Teste para ver se encontra quarto
		Quarto quartoEncontrado = hotel.buscarQuarto(404);
		
		//Teste para ver se encontra Quarto
		assertEquals(quartoEncontrado.getNumero(), 404);
	}

}
