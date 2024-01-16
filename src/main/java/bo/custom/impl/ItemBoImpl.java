package bo.custom.impl;

import bo.custom.ItemBo;
import dao.CrudDao;
import dao.DaoFactory;
import dao.util.DaoType;
import dto.EmployeeDto;
import dto.ItemDto;
import entity.Employee;
import dao.custom.ItemDao;
import entity.Item;

import java.sql.SQLException;
import java.util.List;

public class ItemBoImpl implements ItemBo {
    private ItemDao itemDao = DaoFactory.getInstance().getDao(DaoType.ITEM);
    public boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException {
        return itemDao.save(new Item(
                dto.getItemId(),
                dto.getName(),
                dto.getFault(),
                dto.getItemCategory(),
                dto.getImg()
        ));
    }

    @Override
    public boolean updateCustomer(EmployeeDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<EmployeeDto> allEmployees() throws SQLException, ClassNotFoundException {
        return null;
    }
}
