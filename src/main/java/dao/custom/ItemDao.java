package dao.custom;

import dao.CrudDao;
import dto.EmployeeDto;
import dto.ItemDto;
import entity.Employee;
import entity.Item;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao extends CrudDao<Item> {
    List<ItemDto> allItems() throws SQLException, ClassNotFoundException;
}
