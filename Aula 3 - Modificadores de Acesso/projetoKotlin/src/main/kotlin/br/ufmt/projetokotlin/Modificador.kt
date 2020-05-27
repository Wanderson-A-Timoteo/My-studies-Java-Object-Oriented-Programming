/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.projetokotlin

/*

  @author raphael
  Created on 07/04/2018
*/

open class Cliente {
    
    public var nome: String = "";
    
    public var idade: Int = 0
        protected set(value) {
            if (value >= 0) {
                field = value;
            }
        };
}