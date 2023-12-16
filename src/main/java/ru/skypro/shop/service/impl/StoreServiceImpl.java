package ru.skypro.shop.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.shop.service.ShoppingCart;
import ru.skypro.shop.service.StoreService;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService {
    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public List<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public List<Integer> get() {
        return shoppingCart.get();
    }
}
