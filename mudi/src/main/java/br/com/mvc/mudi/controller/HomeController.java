package br.com.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mvc.mudi.Model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Fire TV Stick Lite");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/61i25ieP0OL._AC_SL1000_.jpg");
		pedido.setUrlProduto(
				"https://www.amazon.com.br/Fire-TV-Stick-Lite/dp/B091G767YB/?_encoding=UTF8&pd_rd_w=wGuyf&content-id=amzn1.sym.52e74d21-088e-4a9d-888d-8b14bf95d4ae&pf_rd_p=52e74d21-088e-4a9d-888d-8b14bf95d4ae&pf_rd_r=W299QT3BV8SKMBT6775Y&pd_rd_wg=JlGwC&pd_rd_r=21e2007c-f578-455d-b73c-9b5a8a0346c4&ref_=pd_gw_crs_zg_bs_16333486011");
		pedido.setDescricaoPedido("Streaming em Full HD com Alexa | Com Controle Remoto Lite por Voz com Alexa");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
