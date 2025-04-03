package org.ericksantillan.pooclasesabst.form.elemtos;

public class InputForm extends ElementosForm{

    private String tipo="text";

    //constructor
    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    //getter and setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //metodos
    @Override
    public String dibujarhtml() {
        return "<input type= \""+this.tipo+"\""
                +" name= \""+this.nombre+"\""
                + "value= \""+this.valor+"\""+">";
    }
}
