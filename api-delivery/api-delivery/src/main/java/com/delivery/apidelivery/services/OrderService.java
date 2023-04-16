package com.delivery.apidelivery.services;

import com.delivery.apidelivery.entities.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Food> listaPlatos;

    public OrderService(){
        this.listaPlatos= new ArrayList<>();
    }

    //Como usuario, quiero poder ver un menú de comida para seleccionar lo que
    //quiero pedir.
    //Como usuario, quiero ver una lista de los platos disponibles para ordenar,
    //incluyendo nombre, descripción y precio.


    public List<Food> getListaPlatos() {
        return this.listaPlatos;
    }

    public void agregarPlatos(Food food){
        this.listaPlatos.add(food);
    }
}
