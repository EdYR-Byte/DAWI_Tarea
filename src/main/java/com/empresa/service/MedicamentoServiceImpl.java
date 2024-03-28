package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	
	@Autowired
	private MedicamentoRepository repository;

	@Override
	public List<Medicamento> listaMedicamentos() {
		
		return repository.findAll();
		
	}

	@Override
	public List<Medicamento> listarMedicamentePorNombre(String nombre) {
		
		return repository.findByNombreLike(nombre);
		
	}

	@Override
	public List<Medicamento> ListarPorIdMedicamento(int id) {
		
		return repository.findByIdMedicamento(id);
	}

	@Override
	public List<Medicamento> ListarPorLaboratorio(String laboratorio) {
		
		return repository.findByLaboratorio(laboratorio);
		
	}

}
