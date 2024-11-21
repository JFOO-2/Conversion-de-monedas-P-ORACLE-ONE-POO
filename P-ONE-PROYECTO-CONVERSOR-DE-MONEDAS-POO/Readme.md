<h1> Conversion de monedas </h1>

<p>
Para este proyecto se creara un conversor de monedas, el cual implementará los conocimientos del curso de POO del programa  ONE-ORACLE.
</p>

<h1> API </h1>

`API`
se implementara una API para la obtencion de los datos de los costos de las monedas en tiempo actual.

`Usando HttpRequest` Y `HttpResponse<T>`

----------
<h1>Bibliotecas</h1>

`Biblioteca--> Gson`
se usara la biblioteca Gson para la modificacion y el manejo de los datos del archivo Json que otorga la API, dicha biblioteca se encuentra en MVN REPOSITORY.

Implementandola con
`return new Gson().fromJson(response.body(), DatosRequeridosApi.class);`

<h1>Comprobacion de API</h1>

`Postman` se utiliza para verificar que la API funciona y ver como trabajar con la misma, sabiendo como implementar tu URL y para saber que datos te proporciona por si misma.

-------------------

<h1>Clase In datos</h1>


Esta clase es para solicitar los datos a ingresar
al usuario, mismos que se envian al metodo de la 
api para que mande a llamar a record

------------------------


<h1>Clase principal</h1>

Y por ultimo la clase principal que instancea
a las clases para usar los metodos y entrelazar 
las clases
`ALURA - G7 - ONE`