package com.transire.appalimentos.repository;

import com.transire.appalimentos.model.FoodEntity;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

    private List<FoodEntity> mListFood;

    public FoodRepository() {
        this.mListFood = new ArrayList<>();

        this.mListFood.add(new FoodEntity(0, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(1, "Alface Americana", 8));
        this.mListFood.add(new FoodEntity(2, "Tomati", 8));
        this.mListFood.add(new FoodEntity(3, "Feijao carioca", 8));
        this.mListFood.add(new FoodEntity(4, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(5, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(6, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(7, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(8, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(9, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(10, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(11, "Alface crespa", 8));
        this.mListFood.add(new FoodEntity(12, "Carne assada de panela", 8));
        this.mListFood.add(new FoodEntity(13, "Macarrão cozido", 8));
    }

    public FoodEntity get(int id) {
        return this.mListFood.get(id);
    }

    public List<FoodEntity> getList() {
        return this.mListFood;
    }
}
