package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IRepository.IProveedorRepository;
import com.corhuila.shoppingcar.Service.ProveedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProveedorService implements ProveedorService {

    @Autowired
    private IProveedorRepository proveedorRepository;

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public List<Proveedor> obtenerTodosLosProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor buscarProveedorPorId(String id) {
        return proveedorRepository.findById(id)
                .orElse(null); // O manejar la excepción como sea necesario
    }

    @Override
    public Proveedor actualizarProveedor(String id, Proveedor proveedor) {
        // Comprueba si el proveedor con el ID dado existe
        if (proveedorRepository.existsById(id)) {
            // Asigna el ID al proveedor proporcionado y guárdalo
            proveedor.setId(id);
            return proveedorRepository.save(proveedor);
        } else {
            return null; // O manejar la excepción como sea necesario
        }
    }

    @Override
    public void eliminarProveedor(String id) {
        proveedorRepository.deleteById(id);
    }
}
