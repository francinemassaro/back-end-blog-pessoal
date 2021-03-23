package com.blogpessoal.francine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.francine.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long> {
	
	/*Aqui dentro temos vários contratos, como FindAll, FindById, Save, Delete.
	Só que existem algumas alterações que naõ temos com essa interface, então
	nós mesmos criamos os métodos.
	
	 				- Consulta pelo título da postagem.*/
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
	//findAllByTitulo nome exato que o método vai fazer
	//ContainingIgnoreCase, é pra ignorar a diferença entre
	//letras maiúsculas de minúsculas.

}
