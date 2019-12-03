
package com.cognizant.truyum.Dao;
import java.util.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl  implements MenuItemDao{



	List<MenuItem> menuItemList ; 

	public MenuItemDaoCollectionImpl(){
		if(menuItemList == null){
			try {
				menuItemList = new ArrayList<MenuItem>();
				menuItemList.add(new MenuItem(000001,"Sandwich",99.00f,true,DateUtil.convertToDate("15/03/2017"),"Main Course",true)); 
                menuItemList.add(new MenuItem(000002, "Burger", 129.00f, true,DateUtil.convertToDate("15/03/2017"), "Main Course",false));
				menuItemList.add(new MenuItem(000003, "Pizza", 149.00f, true,DateUtil.convertToDate("15/03/2017"), "Main Course",false)); 


			}
			catch(ParseException pe){

				System.out.println("Parse exception "+pe.getMessage());

			}


		}
	}
	
	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}


	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		List<MenuItem> menuItemListCust = new ArrayList<MenuItem>();

		Date today = new Date();
		for (MenuItem menuItem : menuItemList) {
			if (menuItem.getDateoflaunch().getTime() <= today.getTime()
					&& menuItem.isActive()) {
				menuItemListCust.add(menuItem);
			}
		}

		return menuItemListCust;
	}

	
	@Override
	public void modifyMenuItem(MenuItem menuItem) {
	for(MenuItem menuitems:menuItemList)
	{
		if(menuitems.getId()==menuItem.getId())
		{
			menuitems.setName(menuItem.getName());
			menuitems.setCategory(menuItem.getCategory());
			menuitems.setDateoflaunch(menuItem
					.getDateoflaunch());
			menuitems.setFreedelivery(menuItem
					.isFreedelivery());
			menuitems.setPrice(menuItem.getPrice());
			menuitems.setActive(menuItem.isActive());
		}
		}
	}
	@Override
	public MenuItem getMenuItem(long menuitemId) {
	
		for(MenuItem menuitem:menuItemList)
		{
			if(menuitem.getId()==menuitemId)
			{
				
				return menuitem;
				
			}
		}
		return null;

}
}
