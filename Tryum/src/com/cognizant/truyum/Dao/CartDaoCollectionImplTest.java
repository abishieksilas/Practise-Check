package com.cognizant.truyum.Dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	public static void main(String args[]) throws CartEmptyException
	{
		
		testAddCartItem();
		testRemoveCartItem();
	}

static void testGetAllCartItems() throws CartEmptyException
{
	CardDaoCollectionImpl cartDaoCollectionImpl = new CardDaoCollectionImpl();
	CartDao cartDao = cartDaoCollectionImpl;
	List<MenuItem> menuItemList=cartDao.getAllCartItems(1);
	System.out.println("Menu Item List"+menuItemList);
}
static void testAddCartItem() throws CartEmptyException
{
	 
	CardDaoCollectionImpl cartDaoCollectionImpl = new CardDaoCollectionImpl();
	CartDao cartDao = cartDaoCollectionImpl;
	cartDao.addCartItem(1, 000004);
	List<MenuItem> menuItemList = cartDao.getAllCartItems(1);
	System.out.println("MenuItem list :" + menuItemList);

}
static void testRemoveCartItem() throws CartEmptyException
{
	
	CardDaoCollectionImpl cartDaoCollectionImpl = new CardDaoCollectionImpl();
	CartDao cartDao = cartDaoCollectionImpl;
	cartDao.removeCartItem(1,000004);
	try{
	List<MenuItem> menuItem=cartDao.getAllCartItems(1);
	}catch(Exception e)
	{
		throw new CartEmptyException("Cart is Empty");
	}
	}
}

