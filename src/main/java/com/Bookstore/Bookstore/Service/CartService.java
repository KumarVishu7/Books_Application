package com.Bookstore.Bookstore.Service;

import com.Bookstore.Bookstore.Entities.Cart;
import com.Bookstore.Bookstore.Repo.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private  CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void removeCartItem(Long id) {
        cartRepository.deleteById(id);
    }
}
