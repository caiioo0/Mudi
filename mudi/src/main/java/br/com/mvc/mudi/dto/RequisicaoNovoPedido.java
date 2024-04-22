package br.com.mvc.mudi.dto;

import br.com.mvc.mudi.Model.Pedido;
import br.com.mvc.mudi.Model.StatusPedido;
import jakarta.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String urlImagem;
	@NotBlank
	private String urlProduto;

	private String descricaoPedido;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getDescricaoPedido() {
		return descricaoPedido;
	}
	public void setDescricaoPedido(String descricaoPedido) {
		this.descricaoPedido = descricaoPedido;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlProduto);
		pedido.setDescricaoPedido(descricaoPedido);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}
	
	
	
}
