<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/3c0bd07c85.js" crossorigin="anonymous"></script>
        <title>Categoria</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilitos.css"/>
    </head>
    <body>
        <div class="container ">
            <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
                <a class="navbar-brand" href="home">Examen02 - Universidad Peruana Unión</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"">Features</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"">Pricing</a>
                        </li>
                       
                    </ul>
                </div>
            </nav>
        </div>
        <div class="container p-5">
                <div class="row pt-4" >
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color:  white"><i class="fa-solid fa-shop"></i> Sucursal:</label>
                            <select name="sucursal" id="sucursal" class="form-control">
                                <option value="0">Seleccionar Sucursal</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white"><i class="fa-solid fa-user"></i> Cliente:</label>
                            <select name="cliente" id="clientes" class="form-control">
                                <option value="0">Seleccionar Cliente</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white"><i class="fa-solid fa-user-tie"></i> Vendedor:</label>
                            <select name="vendedor" id="vendedor" class="form-control">
                                <option value="0">Seleccionar vendedor</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white"><i class="fa-brands fa-product-hunt"></i> Producto:</label>
                            <select name="producto" id="productos" class="form-control">
                                <option value="0">Seleccionar Producto</option>
                            </select>
                        </div>

                    </div>


                </div>
                <div class="row col-1 col-lg-1">

                    <button id="agregarpipi"  class="btn btn-danger " type="submit">Agregar</button>

                </div>
                <div class="row pt-4">
                    <div class="col">
                        <label for="sucursal" style="background-color:  white"><i class="fa-solid fa-arrow-down-short-wide"></i> Cantidad:</label>
                        <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                            <option selected>Cantidad</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="1">4</option>
                            <option value="2">5</option>
                            <option value="3">6</option> 
                            <option value="4">7</option>
                        </select>
                    </div>
                    <div class="col">
                        <label for="sucursal" style="background-color:  white"><i class="fa-brands fa-product-hunt"></i> Producto:</label>
                        <input id="productosP" type="text" class="form-control" placeholder="Producto" readonly="readonly">
                    </div>
                    <div class="col">
                        <label for="sucursal" style="background-color:  white"><i class="fa-solid fa-hand-holding-dollar"></i> Precio:</label>
                        <input type="text" id="precio" class="form-control" placeholder="Precio" readonly="readonly">
                    </div>
                    <div class="col">
                        <label for="sucursal" style="background-color:  white"><i class="fa-solid fa-boxes-stacked"></i> Stock:</label>
                        <input type="text" id="stock" class="form-control" placeholder="Stock" readonly="readonly">
                    </div>
                    <div class="col">
                        <button type="button" class="btn btn-primary btn-lg m-3">Registrar Venta</button>
                    </div>
                </div>    
                <br>
                <table class="table table-striped " id="tablon">
                    <thead class="thead-dark">
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">ID</th>
                            <th scope="col">SUCURSAL</th>
                            <th scope="col">VENDEDOR</th>
                            <th scope="col">CLIENTES</th>
                            <th scope="col">FECHA</th>
                            <th scope="col" colspan="2">Detalle venta</th>
                        </tr>
                    </thead>
                    <tbody>                
                    </tbody>
                </table>

            </div>
        </div>
        <div class="modal  " id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-xl ">
                    <div class="modal-content ">
                        <div class="modal-header">
                            <h5 id="exampleModalLabel"><i class="fa-solid fa-list"></i> &nbsp Detalles de Ventas </h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <table class="table my-auto mx-auto" id="tablon2">

                                <tr><BR>
                                <th scope="col">#</th>
                                <th scope="col">ID</th>
                                <th scope="col">PRODUCTO</th>
                                <th scope="col">PRECIO</th>
                                <th scope="col">CANTIDAD</th>
                                <th scope="col">TOTAL</th>
                                </tr>

                            </table>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar Detalle</button>
                        </div>
                    </div>
                </div>
            </div>
        
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/5.5.2/bootbox.min.js"></script>
        <script src="js/cate.js"></script>  
    </body>
</html>
