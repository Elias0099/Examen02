$(document).ready(function () {

    listarVentas();
    listarSucursales();
    listarClientes();
    listarProductos();
    listarVendedor();
    

});
let xx;
var precio;
function listarVentas() {


    $.get("Tablon", {"opc": 1}, function (data) {

        let x = JSON.parse(data);
        $("#tablon tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablon").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idventa + "</td><td>" + x[i].sucursal +
                    "</td><td>" + x[i].vendedor + "</td><td>" + x[i].cliente + "</td><td>" + x[i].fecha + "</td><td><a href='#'><i id='ojito' class='fa-solid fa-eye'></i></a></td>");
        }

        $("#ojito").click(function () {
            alert("oliuwu");
        });

    });
}
function listarSucursales() {
    $.get("Sucursales", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {



            $("#sucursal").append($("<option>", {
                value: x[i],
                text: x[i].direccion

            })
                    );


        }

    });

}
function listarClientes() {
    $.get("Clientes", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {



            $("#clientes").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre


            })
                    );


        }

    });

}

function listarVendedor() {
    $.get("Vendedor", {"opc": 1}, function (data)
    {

        let x = JSON.parse(data);

        for (let i = 0; i < x.length; i++) {



            $("#vendedor").append($("<option>", {
                value: x[i].idvendedor,
                text: x[i].nombre


            })
                    );


        }

    });

}




function listarProductos() {



    $.get("Productos", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        precio = x;
        for (let i = 0; i < x.length; i++) {



            $("#productos").append($("<option>", {
                value: x[i].idproducto,
                text: x[i].nombre

            })
                    );


        }

    });

}
let mostrar = () => {
    


    var selected = $("#productos :selected").val();
    
        console.log(selected);

    precio.forEach(function (elemento, indice, array) {

        if (elemento.idproducto == selected) {

            $('#productosP').val(elemento.nombre);
            $('#precio').val("S/ " + elemento.precio);
            $('#stock').val(elemento.stock);



        }

    })
};


$('#agregarpipi').click(mostrar);