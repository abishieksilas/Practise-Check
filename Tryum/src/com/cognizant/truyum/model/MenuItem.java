package com.cognizant.truyum.model;
import java.util.*;
public class MenuItem {
long id;
String name;
float price;
boolean active;
Date dateoflaunch;
String category;
boolean freedelivery;

public MenuItem(long id, String name, float price, boolean active,
		Date dateoflaunch, String category, boolean freedelivery) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.active = active;
	this.dateoflaunch = dateoflaunch;
	this.category = category;
	this.freedelivery = freedelivery;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (active ? 1231 : 1237);
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	result = prime * result
			+ ((dateoflaunch == null) ? 0 : dateoflaunch.hashCode());
	result = prime * result + (freedelivery ? 1231 : 1237);
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + Float.floatToIntBits(price);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MenuItem other = (MenuItem) obj;
	if (active != other.active)
		return false;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	if (dateoflaunch == null) {
		if (other.dateoflaunch != null)
			return false;
	} else if (!dateoflaunch.equals(other.dateoflaunch))
		return false;
	if (freedelivery != other.freedelivery)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
		return false;
	return true;
}

@Override
public String toString() {
	return "MenuItem [id=" + id + ", name=" + name + ", price=" + price
			+ ", active=" + active + ", dateoflaunch=" + dateoflaunch
			+ ", category=" + category + ", freedelivery=" + freedelivery + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public Date getDateoflaunch() {
	return dateoflaunch;
}
public void setDateoflaunch(Date dateoflaunch) {
	this.dateoflaunch = dateoflaunch;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public boolean isFreedelivery() {
	return freedelivery;
}
public void setFreedelivery(boolean freedelivery) {
	this.freedelivery = freedelivery;
}

}
