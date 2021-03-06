package LogisticApp.view.vo;

import java.util.List;

public class RotaPanelInfoVO {

	private int idOrigem;
	private int idDestino;
	private double capacidadeTotal;
	private double custoGrama;
	private int tempoEntrega;
	private List<Integer> trechos;

	public RotaPanelInfoVO() {
		this.idOrigem = 0;
		this.idDestino = 0;
		this.capacidadeTotal = 0;
		this.custoGrama = 0;
		this.tempoEntrega = 0;
		this.trechos = null;
	}

	public int getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(int idOrigem) {
		this.idOrigem = idOrigem;
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public double getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(double capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public double getCustoGrama() {
		return custoGrama;
	}

	public void setCustoGrama(double custoGrama) {
		this.custoGrama = custoGrama;
	}

	public int getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}

	public List<Integer> getTrechos() {
		return trechos;
	}

	public void setTrechos(List<Integer> trechos) {
		this.trechos = trechos;
	}

}
