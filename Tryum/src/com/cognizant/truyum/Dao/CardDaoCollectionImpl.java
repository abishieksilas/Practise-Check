
package com.cognizant.truyum.Dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;


public class CardDaoCollectionImpl implements CartDao{
	
	HashMap<Long,Cart>userCarts;
	public CardDaoCollectionImpl(){
		if(userCarts==null)
		{
			userCarts=new HashMap<Long,Cart>();
		}
	}

	
	@Override
	public void addCartItem(long userid, long menuItemId) {
		List<MenuItem> menuItemList;
		MenuItemDaoCollectionImpl menuitemdaocollectionimpl=new MenuItemDaoCollectionImpl();
		MenuItemDao menuitemdao=menuitemdaocollectionimpl;
	    menuitemdao.getMenuItem(menuItemId);
	    MenuItem menuItem=menuitemdao.getMenuItem(menuItemId);
	    if(userCarts.containsValue(userid))
	    {
	      Cart cart=userCarts.get(userid);
	      menuItemList=cart.getMenuItemList();
	      menuItemList.add(menuItem);
	      cart.setMenuItemList(menuItemList);
	      userCarts.put(userid,cart);
	    }
	    else
	    {
	    	menuItemList=new ArrayList<MenuItem>();
	    	menuItemList.add(menuItem);
	    	Cart cart=new Cart(menuItemList,menuItem.getPrice());
	    	userCarts.put(userid,cart);
	    }
	}

	@Override
	public List<MenuItem> getAllCartItems(long userid)
			throws CartEmptyException {
		Cart cart=userCarts.get(userid);
		List<MenuItem>menuItemList=cart.getMenuItemList();
		if(menuItemList==null||menuItemList.size()==0)
		{
			throw new CartEmptyException("Cart is Empty");
		}
	       double total=0.0;
	       for(MenuItem menuitem:menuItemList)
	       {
			total=total+menuitem.getPrice();
	       }
	       cart.setTotal(total);
		return menuItemList;
	}
	public void removeCartItem(long userId, long menuitemid) {
		if (userCarts.containsKey(userId)) {
			Cart cart = userCarts.get(userId);
			List<MenuItem> menuItemList = cart.getMenuItemList();
			for (MenuItem menuItem : menuItemList) {
				if(menuItem.getId() == menuitemid){
					menuItemList.remove(menuItem);
				}

			}

			cart.setMenuItemList(menuItemList);
			userCarts.put(userId, cart);

		}
		}

}
