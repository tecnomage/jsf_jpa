package br.com.Automovel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Automovel {
	
	@Id @GeneratedValue
	private  long id;
	private String marca;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String observacoes;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the anoFabricacao
	 */
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}
	/**
	 * @param anoFabricacao the anoFabricacao to set
	 */
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	/**
	 * @return the anoModelo
	 */
	public Integer getAnoModelo() {
		return anoModelo;
	}
	/**
	 * @param anoModelo the anoModelo to set
	 */
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}
	/**
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}
	/**
	 * @param observacoes the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
