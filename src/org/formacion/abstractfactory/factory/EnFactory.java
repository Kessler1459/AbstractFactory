package org.formacion.abstractfactory.factory;

import org.formacion.abstractfactory.*;

public class EnFactory implements MessageFactory{
    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEn();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEn();
    }
}
