package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService medicamentoService;
	
	@GetMapping
	public List<Medicamento> ListaMedicamento(){
		List<Medicamento> listMedicamento = medicamentoService.listaMedicamentos();
		return listMedicamento;
	}

	@GetMapping("/porNombre/{nombre}")
	public List<Medicamento> listaMedicamentoPorNombre(@PathVariable("nombre") String nombre){
		List<Medicamento> listMedicamento = medicamentoService.listarMedicamentePorNombre(nombre+ "%");
		return listMedicamento;
	}
	
	@GetMapping("/porId/{id}")
	public List<Medicamento> listaMedicamentoPorId(@PathVariable("id") int id){
		List<Medicamento> listMedicamento = medicamentoService.ListarPorIdMedicamento(id);
		return listMedicamento;
	}
	
	@GetMapping("/porLaboratorio/{lab}")
	public List<Medicamento> listaMedicamentoPorLaboratorio(@PathVariable("lab") String lab){
		List<Medicamento> listMedicamento = medicamentoService.ListarPorLaboratorio(lab);
		return listMedicamento;
	}
}
