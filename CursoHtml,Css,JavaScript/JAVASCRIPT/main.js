var nombre = "jheferson duvan villa";
var altura = 195;

function MuestraMiNombre(nombre, altura) {
  var misDatos = `
    <h1>Soy la caja de datos</h1>
    <h2>Mi nombre es: ${nombre}</h2>
    <h3>Mido: ${altura} cm</h3>
  `;
  return misDatos;
}

function imprimir() {
  var datos = document.getElementById("datos");
  datos.innerHTML = MuestraMiNombre("jheferson duvan villa", 190);
}

imprimir();

var nombres = ["victor", "Antonio", "juaquin"];
document.write("<h1>Listado de nombres</h1>");

nombres.forEach((nombre) => {
  document.write(nombre + "<br/>");
});


