package com.leandroab.financas.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter//lotação do lombok
@Setter//lotação do lombok
@EqualsAndHashCode//lotação do lombok
@ToString//lotação do lombok
@NoArgsConstructor//lotação do lombok
@AllArgsConstructor//lotação do lombok
@Builder//lotação do lombok
@Data//lotação do lombok
@Entity
@Table(name = "usuario", schema = "financas")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private String senha;
	
	
}
