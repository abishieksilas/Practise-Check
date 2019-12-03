
package com.cognizant.truyum.Dao;
import com.cognizant.truyum.model.MenuItem;
import java.util.List;


public interface CartDao {

	void addCartItem(long userid , long menuItemId);
	List<MenuItem> getAllCartItems(long userid) throws CartEmptyException;
	void removeCartItem(long userid,long menuItemId);
}
