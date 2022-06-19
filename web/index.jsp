<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/3c0bd07c85.js" crossorigin="anonymous"></script>
        <title>Categoria</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-light" style="background-color: #e3f2fd;">
                <a class="navbar-brand" href="home">Navbar</a>
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
                            <label for="sucursal" style="background-color:  white">Sucursal:</label>
                            <select name="sucursal" id="sucursal" class="form-control">
                                <option value="0">Seleccionar Sucursal</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white">Cliente:</label>
                            <select name="cliente" id="clientes" class="form-control">
                                <option value="0">Seleccionar Cliente</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white">Vendedor:</label>
                            <select name="vendedor" id="vendedor" class="form-control">
                                <option value="0">Seleccionar vendedor</option>
                            </select>
                        </div>

                    </div>
                    <div class="col">
                        <div class="form-group">
                            <label for="sucursal" style="background-color: white">Producto:</label>
                            <select name="producto" id="productos" class="form-control">
                                <option value="0">Seleccionar Producto</option>
                            </select>
                        </div>

                    </div>


                </div>
                <div class="row col-1 col-lg-1">

                    <button id="agregarpipi"  class="btn btn-danger" type="submit">Agregar</button>

                </div>
                <div class="row pt-4">
                    <div class="col">
                        <label for="sucursal" style="background-color:  white">Cantidad:</label>
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
                        <label for="sucursal" style="background-color:  white">Producto:</label>
                        <input id="productosP" type="text" class="form-control" placeholder="Producto" readonly="readonly">
                    </div>
                    <div class="col">
                        <label for="sucursal" style="background-color:  white">Precio:</label>
                        <input type="text" id="precio" class="form-control" placeholder="Precio" readonly="readonly">
                    </div>
                    <div class="col">
                        <label for="sucursal" style="background-color:  white">Stock:</label>
                        <input type="text" id="stock" class="form-control" placeholder="Stock" readonly="readonly">
                    </div>
                    <div class="col">
                        <button type="button" class="btn btn-primary btn-lg m-3">Registrar Venta</button>
                    </div>
                </div>    
                <br>
                <table class="table w-75" id="tablon">
                    <thead>
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
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootbox.js/5.5.2/bootbox.min.js"></script>
        <script src="js/cate.js"></script>  
    </body>
</html>
