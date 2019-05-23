package br.unisul.pweb.quarta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Cidade;
import br.unisul.pweb.quarta.repositories.CidadeRepository;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository rep;
	
	@Autowired
	private EstadoService estadoService;
	

	public List<Cidade> findByEstado(Integer estadoId) {
		return rep.findCidades(estadoId);
	}
	
	public Cidade insert (Cidade obj) {
		obj.setId(null);
		obj.setEstado(estadoService.find(obj.getEstado().getId()));
		obj = rep.save(obj);
		return obj;
	}
}
