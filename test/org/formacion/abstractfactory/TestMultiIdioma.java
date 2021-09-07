package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.formacion.abstractfactory.factory.EnFactory;
import org.formacion.abstractfactory.factory.FactoryMaker;
import org.formacion.abstractfactory.factory.MessageFactory;
import org.junit.Test;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		Preguntas preguntas = new PreguntasEs();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = new SaludosEs();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		Preguntas preguntas = new PreguntasEn();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		Saludos saludos = new SaludosEn();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

	@Test
	public void test(){
		MessageFactory enFactory= FactoryMaker.makeFactory(FactoryMaker.Language.EN);
		MessageFactory esFactory= FactoryMaker.makeFactory(FactoryMaker.Language.ES);

		Preguntas enPreguntas=enFactory.createPreguntas();
		Saludos enSaludos=enFactory.createSaludos();
		assertEquals("what time is it?", enPreguntas.preguntaHora());
		assertEquals("how is the weather?", enPreguntas.preguntaTiempo());
		assertEquals("good morning", enSaludos.buenosDias());
		assertEquals("good afternoon", enSaludos.buenasTardes());

		Preguntas esPreguntas=esFactory.createPreguntas();
		Saludos esSaludos=esFactory.createSaludos();
		assertEquals("¿qué hora es?", esPreguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", esPreguntas.preguntaTiempo() );
		assertEquals("buenos días", esSaludos.buenosDias());
		assertEquals("buenas tardes", esSaludos.buenasTardes());
	}

}
