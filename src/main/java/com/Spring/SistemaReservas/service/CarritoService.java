package com.Spring.SistemaReservas.service;

import com.Spring.SistemaReservas.entities.Carrito;

import com.Spring.SistemaReservas.repository.CarritoRepository;
import com.Spring.SistemaReservas.service.impl.ICarritoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService implements ICarritoService {

    private CarritoRepository carritoRepository;

    public CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    @Override
    public boolean eliminar(Long id) {
        return carritoRepository.eliminar(id);
    }

    @Override
    public Optional<Carrito> findById(Long id) {
        return carritoRepository.findById(id);
    }

    @Override
    public List<Carrito> findAll() {
        return carritoRepository.findAll();
    }

    @Override
    public Carrito crear(int cantidad, float precio) {
        Carrito carrito = new Carrito();
        carrito.setCantidad(cantidad);
        carrito.setPrecio(precio);
        return carritoRepository.guardar(carrito);

    }

    @Override
    public Carrito actualizar(Long id, int cantidad, float precio) {
        Optional<Carrito> actualizar = findById(id);
        if (actualizar.isPresent()){
            Carrito carrito = actualizar.get();
            if (carrito != null){
                carrito.setCantidad(cantidad);
                carrito.setPrecio(precio);
                return carrito;
            }
        }
        return null;
    }

}
