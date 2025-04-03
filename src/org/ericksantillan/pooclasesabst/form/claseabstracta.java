package org.ericksantillan.pooclasesabst.form;

import org.ericksantillan.pooclasesabst.form.elemtos.ElementosForm;
import org.ericksantillan.pooclasesabst.form.elemtos.InputForm;
import org.ericksantillan.pooclasesabst.form.elemtos.SelectForm;
import org.ericksantillan.pooclasesabst.form.elemtos.TextAreaForm;
import org.ericksantillan.pooclasesabst.form.elemtos.select.Opcion;

import javax.swing.text.Element;

public class claseabstracta {
    public static void main(String[] args) {
        InputForm username=new InputForm("username");
        InputForm password=new InputForm("clase","password");
        InputForm email=new InputForm("email","email");
        InputForm edad=new InputForm("edad","number");


        TextAreaForm experienci=new TextAreaForm("exp",5, 9);

        SelectForm lenguaje=new SelectForm("lenguaje");
        Opcion java=new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","Java Script"));
        lenguaje.addOpcion(new Opcion("4","Type Script"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        username.setValor("erick.doe");
        username.setTipo("a1b2c3");
        email.setValor("erickalbertosantillancocoletzi@gmail.com");
        edad.setValor("28");
        java.setSelected(true);
    }
}
