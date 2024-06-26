package com.commerce.backend.modules.order.application.service;

import com.commerce.backend.modules.cart.application.useCases.dto.CartResponse;
import com.commerce.backend.modules.cart.application.useCases.dto.ConfirmCartRequest;
import com.commerce.backend.modules.cart.infra.entity.Cart;

public interface CartService {
    CartResponse addToCart(Long id, Integer amount);
    CartResponse incrementCartItem(Long cartItemId, Integer amount);
    CartResponse decrementCartItem(Long cartItemId, Integer amount);
    CartResponse fetchCart();
    CartResponse removeFromCart(Long id);
    boolean confirmCart(ConfirmCartRequest confirmCartRequest);
    Cart getCart();
    void saveCart(Cart cart);
    void emptyCart();
    Cart calculatePrice(Cart cart);
}