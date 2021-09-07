Nuestro sistema necesita acceder a distintos mensajes en distintos idiomas.

Para ello creamos un sistema de interfaces para cada conjunto de mensajes
relacionados, y clases que lo implementan para cada idioma.
Las clases tienen un sufijo que indica el idioma (es y en, por ahora, *aunque pensamos ampliarlo*).

Si observamos el test, veremos que en cada test se tienen que instanciar clases para cada
idioma, para cada conjunto de mensajes.

Queremos agrupar la decision de que idioma usar en una unica invocacion a un 
abstract factory.

Crear este abstract factory, con una implementacions para "es" y otra para "en" y
despues adapta el test para que use este factory.

El resultado debe ser, evidentemente, que el test pase, pero ademas cada metodo debe
"decidir" una sola vez que idioma usar (ahora lo hace dos veces, una para cada clase).