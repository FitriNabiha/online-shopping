package com.isolutions4u.onlineshopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.isolutions4u.onlineshopping.model.Cart;
import com.isolutions4u.onlineshopping.model.UserModel;
import com.isolutions4u.onlineshopping.repository.CartRepository;

@Service("cartService")
public class CartServiceImpl implements CartService {

	@Qualifier("cartRepository")
	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private HttpSession httpSession;

	@Override
	public boolean saveCart(Cart cart) {
		cartRepository.saveAndFlush(cart);
		return true;
	}

	@Override
	public boolean updateCart(Cart cart) {
		return saveCart(cart);
	}

	@Override
	public Cart findCart() {
		return ((UserModel) httpSession.getAttribute("userModel")).getCart();
	}

}
