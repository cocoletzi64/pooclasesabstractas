package org.ericksantillan.pooclasesabst.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="formato de email invalido";
    private final static String email="^(.+)@(.+)$";
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
        return valor.matches(email);
    }
}
