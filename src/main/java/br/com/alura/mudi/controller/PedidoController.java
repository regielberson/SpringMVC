package br.com.alura.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mudi.dto.RequisicaoNovoPedido;
import br.com.alura.mudi.model.Pedido;
import br.com.alura.mudi.repository.PedidoRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	 @Autowired
	private PedidoRepository repository;
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoPedido requisicaoNovoPedido) {
		
	return "pedido/formulario";
		
	}
	
	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao, BindingResult result) {
		
		Pedido pedido = requisicao.toPedido();
		repository.save(pedido);
		
			
		return "redirect:/home";
	}
}
	