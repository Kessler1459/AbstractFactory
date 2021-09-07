package org.formacion.abstractfactory.factory;

import org.formacion.abstractfactory.Preguntas;
import org.formacion.abstractfactory.PreguntasEs;
import org.formacion.abstractfactory.Saludos;
import org.formacion.abstractfactory.SaludosEs;

public class EsFactory implements MessageFactory{
    @Override
    public Preguntas createPreguntas() {
        return new PreguntasEs();
    }

    @Override
    public Saludos createSaludos() {
        return new SaludosEs();
    }
}
