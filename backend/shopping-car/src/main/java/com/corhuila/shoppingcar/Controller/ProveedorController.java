package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Document.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private Proveedor proveedorService;

    @PostMapping("/")
    public Proveedor crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.guardarProveedor(proveedor);
    }

    @GetMapping("/")
    public List<Proveedor> obtenerTodosLosProveedores() {
        return proveedorService.obtenerTodosLosProveedores();
    }

    @GetMapping("/{id}")
    public Proveedor obtenerProveedorPorId(@PathVariable String id) {
        return proveedorService.buscarProveedorPorId(id);
    }

    @PutMapping("/{id}")
    public Proveedor actualizarProveedor(@PathVariable String id, @RequestBody Proveedor proveedor) {
        return proveedorService.actualizarProveedor(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminarProveedor(@PathVariable String id) {
        proveedorService.guardarProveedor(id);
    }
}
