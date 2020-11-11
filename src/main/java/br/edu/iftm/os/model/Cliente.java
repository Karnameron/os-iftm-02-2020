/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter @Setter
public class Cliente implements Serializable {
    
    private String nome_fantasia,sobrenome_razao,cpf_cnpj,rg_inscricao,email,sexo;
    private Integer id;
    private Date data_nascimento, data_cadastro;
    
}
