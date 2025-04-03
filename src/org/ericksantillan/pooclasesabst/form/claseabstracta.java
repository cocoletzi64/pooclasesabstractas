package org.ericksantillan.pooclasesabst.form;

import org.ericksantillan.pooclasesabst.form.elemtos.ElementosForm;
import org.ericksantillan.pooclasesabst.form.elemtos.InputForm;
import org.ericksantillan.pooclasesabst.form.elemtos.SelectForm;
import org.ericksantillan.pooclasesabst.form.elemtos.TextAreaForm;
import org.ericksantillan.pooclasesabst.form.elemtos.select.Opcion;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

public class claseabstracta {
    public static void main(String[] args) {
        InputForm username=new InputForm("username");
        InputForm password=new InputForm("clase","password");
        InputForm email=new InputForm("email","email");
        InputForm edad=new InputForm("edad","number");


        TextAreaForm experiencia=new TextAreaForm("exp",5, 9);

        SelectForm lenguaje=new SelectForm("lenguaje");
        Opcion java=new Opcion("1","Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2","Python"));
        lenguaje.addOpcion(new Opcion("3","Java Script"));
        lenguaje.addOpcion(new Opcion("4","Type Script"));
        lenguaje.addOpcion(new Opcion("5","PHP"));

        username.setValor("erick.doe");
        password.setValor("a1b2c3");
        email.setValor("erickalbertosantillancocoletzi@gmail.com");
        edad.setValor("28");
        experiencia.setValor(" aproximadamente 7 mese de experiencia");
        java.setSelected(true);

        List<ElementosForm> elementos=new ArrayList<>();

        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);

        for(ElementosForm e:elementos){
            System.out.println(e.dibujarhtml());
        }


    }
}
