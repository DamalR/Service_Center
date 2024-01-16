package controller;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;

public class AddCustomerFormController {

    public BorderPane pane2;
    @FXML
    private BorderPane pane;

    @FXML
    private Tab tabAddCustomer;

    @FXML
    private Text txtSearchCustomer;

    @FXML
    private TextField txtFieldSearchCustomer;

    @FXML
    private Button btnSearchCustomer;

    @FXML
    private TextField txtFieldOrderId;

    @FXML
    private Text txtCustomerName;

    @FXML
    private Text txtAddress;

    @FXML
    private TextField txtFieldCustomerName;

    @FXML
    private TextField txtFieldCustomerContactNum;

    @FXML
    private Text txtContactNumber;

    @FXML
    private Text txtEmail;

    @FXML
    private Text txtCustomerId;

    @FXML
    private TextField txtFieldEmail;

    @FXML
    private TextField txtFiledAddress;

    @FXML
    private Button btnAddCustomer;

    @FXML
    private Tab tabUpdateCustomer;

    @FXML
    private TableView<?> tblEmpDetilas;

    @FXML
    private TableColumn<?, ?> colCustomerId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colContactNumber;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colDelete;

    @FXML
    private Text txtSearchCustomerT2;

    @FXML
    private TextField txtFieldSearchCustomerT2;

    @FXML
    private Button btnSearchCustomerT2;

    @FXML
    private Label txtTitle;

    @FXML
    void SearchButtonOnActionT1(ActionEvent event) {

    }

    @FXML
    void addCustomerButtonOnAction(ActionEvent event) {

    }

    @FXML
    void searchButtonOnActionT2(ActionEvent event) {

    }

}
