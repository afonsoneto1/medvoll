package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome,
        String email,
        String crm,
        String telefone,
        Endereco endereco) {

    public DadosDetalhamentoPaciente(med.voll.api.domain.paciente.Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(),  paciente.getTelefone(),
        paciente.getEndereco());
    }


}
