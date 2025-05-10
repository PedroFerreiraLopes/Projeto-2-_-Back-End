package br.com.projeto2.aajjl.service;

import br.com.projeto2.aajjl.model.Paciente;
import br.com.projeto2.aajjl.model.User;
import br.com.projeto2.aajjl.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente create(Paciente paciente) {
        paciente.setAtivo(true);
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> getAll() {
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> getById(Long id) {
        return pacienteRepository.findById(id);
    }

    public Optional<Paciente> update(Long id, Paciente newData) {
        return pacienteRepository.findById(id).map(paciente -> {
            paciente.setNome(newData.getNome());
            paciente.setCpf(newData.getCpf());
            paciente.setDoenca(newData.getDoenca());
            paciente.setObservacao(newData.getObservacao());
            paciente.setCEP(newData.getCEP());
            paciente.setRua(newData.getRua());
            paciente.setNumero(newData.getNumero());
            paciente.setBairro(newData.getBairro());
            paciente.setComplemento(newData.getComplemento());
            paciente.setCidade(newData.getCidade());
            paciente.setEstado(newData.getEstado());
            paciente.setPrioridade(newData.getPrioridade());
            return pacienteRepository.save(paciente);
        });
    }

    public boolean delete(Long id) {
        return pacienteRepository.findById(id).map(paciente -> {
            paciente.setAtivo(false); //Aqui eu nao deleto do BD, eu atualizo o atributo para false
            pacienteRepository.save(paciente);
            return true;
        }).orElse(false);
    }

    public List<Paciente> getAllAtivos() {
        return pacienteRepository.findByAtivoTrue();
    }

    public List<Paciente> getAllInativos() {
        return pacienteRepository.findByAtivoFalse();
    }

    public List<Paciente> findByNome(String nome) {
        return pacienteRepository.findByNome(nome)
                .stream()
                .filter(Paciente::getAtivo)
                .toList();
    }
}

