package com.blogpessoal.francine.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Pra classe ser reconhecida no banco de dados como entidade, preciso avisar:
@Table(name="Postagem") //Significa que a entidade no DB será uma tabela com nome Postagem.
public class Postagem {
	
	@Id //Id para explicar que se trata da Id de uma tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) // aqui crio a chave primária
	private long id;
	 
	@NotNull
	@Size (min=5, max=30)
	private String titulo;
	@NotNull
	@Size (min=8, max=50)
	private String subtitulo;
	@NotNull
	@Size (min=10, max=550)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)//Especificação de que estamos trabalhando com tempo
	private Date date = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


	
	
	

	
	
}
