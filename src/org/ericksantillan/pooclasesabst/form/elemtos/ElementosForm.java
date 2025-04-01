package org.ericksantillan.pooclasesabst.form.elemtos;

abstract public class ElementosForm {

    protected String valor;
    protected String nombre;

    //constructores
    public ElementosForm() {
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    //setter

    public void setValor(String valor) {
        this.valor = valor;
    }

    //metodos
    abstract public  String dibujarhtml();
}
