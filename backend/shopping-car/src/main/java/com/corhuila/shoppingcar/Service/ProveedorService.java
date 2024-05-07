package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Document.Proveedor;

import java.util.List;

public interface ProveedorService {
    Proveedor guardarProveedor(Proveedor proveedor);

    List<Proveedor> obtenerTodosLosProveedores();

    Proveedor buscarProveedorPorId(String id);

    Proveedor actualizarProveedor(String id, Proveedor proveedor);

    void eliminarProveedor(String id);
}
