
package com.cognizant.truyum.Dao;

import com.cognizant.truyum.model.MenuItem;
import java.util.List;


public interface MenuItemDao {
	
	List<MenuItem> getMenuItemListAdmin();
	List<MenuItem> getMenuItemListCustomer();
	void modifyMenuItem(MenuItem menuItem);
	MenuItem getMenuItem(long menuitemId);

}
