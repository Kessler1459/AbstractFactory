package org.formacion.abstractfactory.factory;

public class FactoryMaker {
    public enum Language{ ES,EN }

    public static MessageFactory makeFactory(Language lang){
        switch (lang){
            case EN:
                return new EnFactory();
            case ES:
                return new EsFactory();
            default: throw new IllegalArgumentException("Language not supported");
        }
    }
}
