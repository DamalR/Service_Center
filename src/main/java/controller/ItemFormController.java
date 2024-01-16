package controller;



import bo.BoFactory;
import bo.custom.EmployeeBo;
import dao.util.BoType;
import dto.EmployeeDto;
import bo.custom.ItemBo;
import dto.ItemDto;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class ItemFormController {

    public TableColumn colCategoryT3;
    public TableColumn colImageT3;
    public Text txtItemCategoryT2;
    public TextField txtFieldItemCategoryT2;
    public TableColumn colItemCategory;
    public TableColumn colImage;
    public ComboBox comboBoxItemCategory;
    public TextField txtFieldFault;
    public Text txtItemFault;
    public TextField txtFieldItemId;
    public Text txtItemId;
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
    private Tab tabAddItem;

    @FXML
    private Text txtItemCategory;

    @FXML
    private TextField txtFieldItemCategory;

    @FXML
    private Text txtItemName;

    @FXML
    private TextField txtFieldItemName;

    @FXML
    private Text txtItemCode;

    @FXML
    private TextField txtFieldItemCode;

    @FXML
    private Button btnSave;

    @FXML
    private Text txtImage;

    @FXML
    private TextField txtFieldImage;

    @FXML
    private Tab tabUpdateItem;

    @FXML
    private Text txtSearchItemIdT2;

    @FXML
    private TextField txtFieldSearchItemT2;

    @FXML
    private Button btnSearchItemT2;

    @FXML
    private TableView<?> tblItemT2;

    @FXML
    private TableColumn<?, ?> colItemId;

    @FXML
    private TableColumn<?, ?> colItemName;

    @FXML
    private TableColumn<?, ?> colManufacture;

    @FXML
    private TableColumn<?, ?> colFault;

    @FXML
    private TableColumn<?, ?> colCost;

    @FXML
    private TableColumn<?, ?> colDelete;

    @FXML
    private Text txtItemIdT2;

    @FXML
    private TextField txtFieldItemIdT2;

    @FXML
    private Text txtItemNameT2;

    @FXML
    private TextField txtFieldItemNameT2;

    @FXML
    private Text txtFaultT2;

    @FXML
    private TextField txtFieldFaultT2;

    @FXML
    private Text txtManufactureT2;

    @FXML
    private TextField txtFieldManufactureT2;

    @FXML
    private Text txtCostT2;

    @FXML
    private TextField txtFieldCostT2;

    @FXML
    private Tab tabDeleteItem;

    @FXML
    private Text txtSearchItem;

    @FXML
    private TextField txtFieldSearchItem;

    @FXML
    private Button btnSearchT3;

    @FXML
    private TableView<?> tblDeleteItem;

    @FXML
    private TableColumn<?, ?> colItemIdT3;

    @FXML
    private TableColumn<?, ?> colItemNameT3;

    @FXML
    private TableColumn<?, ?> colManufactureT3;

    @FXML
    private TableColumn<?, ?> colFaultT3;

    @FXML
    private TableColumn<?, ?> colCostT3;

    @FXML
    private TableColumn<?, ?> colDeleteT3;

    @FXML
    private Label txtTitle;
    private ItemBo itemBo = BoFactory.getInstance().getBo(BoType.ITEM);

    public void initialize(){
        comboBoxItemCategory.getItems().addAll("Electrical","Electronic");
    }

    @FXML
    void OrderButtonOnAction(ActionEvent event) {

    }

    @FXML
    void homeButtonOnAction(ActionEvent event) {

    }

    @FXML
    void itemButtonOnAction(ActionEvent event) {

    }

    @FXML
    void itemCategoryButtonOnAction(ActionEvent event) {

    }

    @FXML
    void reportButtonOnAction(ActionEvent event) {

    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {

    }

    @FXML
    void searchButtonT3OnAction(ActionEvent event) {

    }

    @FXML
    void userButtonOnAction(ActionEvent event) {

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

    public void saveButtonOnAction(javafx.event.ActionEvent actionEvent) {
        try {
            boolean isSaved = itemBo.saveItem(
                    new ItemDto(txtFieldItemId.getText(),
                            txtFieldItemName.getText(),
                            txtFieldFault.getText(),
                            comboBoxItemCategory.getSelectionModel().getSelectedItem().toString(),
                            txtFieldImage.getText().getBytes()
                    ));
            if (isSaved){
                new Alert(Alert.AlertType.INFORMATION,"Item Saved!").show();
            }
        } catch (SQLIntegrityConstraintViolationException ex){
            new Alert(Alert.AlertType.ERROR,"Duplicate Entry").show();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }

    public void searchButtonT3OnAction(javafx.event.ActionEvent actionEvent) {

    }
}

