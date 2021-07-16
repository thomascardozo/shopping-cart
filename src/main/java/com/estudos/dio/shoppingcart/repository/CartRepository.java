package com.estudos.dio.shoppingcart.repository;

import com.estudos.dio.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
