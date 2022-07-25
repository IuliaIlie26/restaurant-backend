package com.ibm.restaurant.domain;

public interface IngredienteRepository {

    void createIngrediente(Ingrediente ingrediente);

    Ingrediente getIngredienteById(int id);
}
