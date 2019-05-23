package br.unisul.pweb.quarta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.quarta.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	List<Categoria> findDistinctByNomeContainingOrderByNome(String nome);

}
