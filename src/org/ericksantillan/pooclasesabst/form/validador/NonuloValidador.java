package org.ericksantillan.pooclasesabst.form.validador;

public class NonuloValidador extends Validador{
    protected String mensaje="el campo no pude ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor !=null);
    }
}
