package org.ericksantillan.pooclasesabst.form.elemtos;

import org.ericksantillan.pooclasesabst.form.elemtos.select.Opcion;
import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementosForm{
    private List<Opcion> opciones;
    //constructor

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones=new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //getter and setter
    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }
    //metodos
    @Override
    public String dibujarhtml() {
        StringBuilder sb=new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion: this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor= opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");

        }
        sb.append("</select>");
        return sb.toString();
    }
}
