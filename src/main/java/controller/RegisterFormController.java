package controller;

import bo.BoFactory;
import bo.custom.EmployeeBo;
import bo.custom.ItemCategoryBo;
import dao.util.BoType;
import dto.EmployeeDto;
import dto.ItemCategoryDto;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class RegisterFormController {

    @FXML
    private BorderPane pane;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnItemCategory;

    @FXML
    private Button btnItem;

    @FXML
    private Button btnUser;

    @FXML
    private Button btnReport;

    @FXML
    private Label txtSelectAdminEmployee;

    @FXML
    private Text txtFullName;

    @FXML
    private Text txtEmail;

    @FXML
    private Text txtContactNumber;

    @FXML
    private Text txtUsername;

    @FXML
    private Text txtPassword;

    @FXML
    private Text txtConfirmPassword;

    @FXML
    private TextField txtFieldFullName;

    @FXML
    private TextField txtFieldEmail;

    @FXML
    private TextField txtFieldContactNumber;

    @FXML
    private TextField txtFieldUsername;

    @FXML
    private TextField txtFieldPassword;

    @FXML
    private TextField txtFieldConfirmPassword;

    @FXML
    private Button btnSubmit;

    @FXML
    private ComboBox<?> comboBoxSelectAdminEmployee;

    @FXML
    private TableView tblEmpDetilas;

    @FXML
    private TableColumn colId;

    @FXML
    private TableColumn colName;

    @FXML
    private TableColumn colContact;

    @FXML
    private TableColumn colEmail;

    @FXML
    private TableColumn colDelete;

    @FXML
    private Text txtName;

    @FXML
    private TextField txtFieldName;

    @FXML
    private Text txtEmployeeId;

    @FXML
    private TextField txtFieldEmployeeId;

    @FXML
    private Button btnSearchName;

    @FXML
    private Button btnSearchEmpId;

    @FXML
    private Label txtTitle;

    private EmployeeBo employeeBo = BoFactory.getInstance().getBo(BoType.EMPLOYEE);

    public void submitButtonOnAction(javafx.event.ActionEvent actionEvent) {
        try {
            boolean isSaved = employeeBo.saveEmployee(
                    new EmployeeDto(txtFieldEmployeeId.getText(),
                            txtFieldFullName.getText(),
                            txtFieldEmail.getText(),
                            txtFieldContactNumber.getText(),
                            txtFieldUsername.getText(),
                            txtFieldPassword.getText()
                    ));
            if (isSaved){
                new Alert(Alert.AlertType.INFORMATION,"Item Category Saved!").show();
            }
        } catch (SQLIntegrityConstraintViolationException ex){
            new Alert(Alert.AlertType.ERROR,"Duplicate Entry").show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public void homeButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void OrderButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void itemCategoryButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void itemButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void userButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }

    public void reportButtonOnAction(javafx.event.ActionEvent actionEvent) {

    }
}

