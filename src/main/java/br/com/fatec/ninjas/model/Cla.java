package br.com.fatec.ninjas.model;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="cla")
@Valid
public class Cla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cla;

    @Column (name = "nome_cla", nullable=false)
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres.")
    private String nome;

    @Column (name = "descricao_cla", nullable=false)
    @NotBlank(message = "O nome é obrigatório.")
    private String descricao;

    @Column (name = "habilidade_cla", nullable=false)
    @NotBlank(message = "O nome é obrigatório.")
    private String habilidade;
}
