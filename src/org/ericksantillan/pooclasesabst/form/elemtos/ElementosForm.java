package org.ericksantillan.pooclasesabst.form.elemtos;

import org.ericksantillan.pooclasesabst.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementosForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadors;
    private List<String> errores;

    //constructores
    public ElementosForm() {
        this.validadors =new ArrayList<>();
        this.errores=new ArrayList<>();
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementosForm addValidador(Validador validador){
        this.validadors.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    //setter

    public void setValor(String valor) {
        this.valor = valor;
    }

    public  boolean esValido(){
        for(Validador v: validadors){
            if (!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    //metodos
    abstract public  String dibujarhtml();
}
