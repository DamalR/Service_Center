package bo.custom;

import bo.SuperBo;
import dto.EmployeeDto;
import dto.ItemDto;

import java.sql.SQLException;
import java.util.List;

public interface ItemBo extends SuperBo {
    boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    boolean updateCustomer(EmployeeDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
    List<EmployeeDto> allEmployees() throws SQLException, ClassNotFoundException;

}
