package org.ericksantillan.pooclasesabst.form.elemtos;

public class TextAreaForm extends ElementosForm{

    private int filas;
    private int columnas;

    //constructor

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    //getter and setter
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    //metodo
    @Override
    public String dibujarhtml() {
        return "<textarea name='"+this.nombre+"'"
                + "cols='"+this.columnas+"'"
                +" rows='"+this.filas+"'>"
                +this.valor+"</textarea>";
    }
}
