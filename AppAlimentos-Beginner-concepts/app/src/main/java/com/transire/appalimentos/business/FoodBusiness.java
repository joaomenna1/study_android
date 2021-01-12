package com.transire.appalimentos.business;

import com.transire.appalimentos.model.FoodEntity;
import com.transire.appalimentos.repository.FoodRepository;

import java.util.List;

public class FoodBusiness {

    public FoodEntity get(int id) {
        return new FoodRepository().get(id);
    }

    public List<FoodEntity> getList() {
        return new FoodRepository().getList();
    }
}
