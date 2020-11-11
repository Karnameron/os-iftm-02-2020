/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Endereco implements Serializable {
    
    private Integer cliente_id;
    private String descricao,logradouro,numero,complemento,bairro,cep,cidade,estado;
}
