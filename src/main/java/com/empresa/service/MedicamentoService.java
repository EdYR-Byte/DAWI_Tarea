package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract List<Medicamento> listaMedicamentos();
	public abstract List<Medicamento> listarMedicamentePorNombre(String nombre);
	public abstract List<Medicamento> ListarPorIdMedicamento(int id);
	public abstract List<Medicamento> ListarPorLaboratorio(String laboratorio);

}
