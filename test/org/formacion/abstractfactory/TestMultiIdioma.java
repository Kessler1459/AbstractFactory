package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.formacion.abstractfactory.factory.FactoryMaker;
import org.formacion.abstractfactory.factory.MessageFactory;
import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		MessageFactory factory= FactoryMaker.makeFactory(FactoryMaker.Language.ES);
		Preguntas preguntas=factory.createPreguntas();

		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );

		Saludos saludos=factory.createSaludos();

		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		MessageFactory factory= FactoryMaker.makeFactory(FactoryMaker.Language.EN);
		Preguntas preguntas=factory.createPreguntas();

		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );

		Saludos saludos=factory.createSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}


}
