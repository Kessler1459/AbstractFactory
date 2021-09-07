package org.formacion.abstractfactory.factory;

import org.formacion.abstractfactory.Preguntas;
import org.formacion.abstractfactory.Saludos;

public interface MessageFactory {
    Preguntas createPreguntas();
    Saludos createSaludos();
}
