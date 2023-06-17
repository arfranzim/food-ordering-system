package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueObject.Money;
import com.food.ordering.system.domain.valueObject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money money;

    public Product(ProductId productId, String name, Money money) {
        super.setId(productId);
        this.name = name;
        this.money = money;
    }

    public String getName() { return name; }
    public Money getMoney() { return money; }
}