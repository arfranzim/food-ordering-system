package com.food.ordering.system.domain.valueObject;

import java.util.UUID;

public class OrderId extends BaseId<UUID> {
    protected OrderId(UUID value) { super(value); }
}