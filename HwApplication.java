/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;


// JavaFX Imports. You can simply copy/paste these
// into each new JavaFX Application you create.
import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// These imports help with our PieChart, TableView
import java.util.*;
import javafx.collections.*;
import javafx.geometry.Pos;
import javafx.scene.chart.*;
import javafx.scene.control.cell.*;

// Our database imports.
import java.sql.*;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import oracle.jdbc.pool.*;
import oracle.jdbc.pool.OracleDataSource;

public class HwApplication extends Application {
    
    
    TabPane tbPane = new TabPane();
    Tab tab1 = new Tab("Employee");
    Tab tab2 = new Tab("Store Area");
    Tab tab3 = new Tab("Products");
    Tab tab4 = new Tab("Suppliers");
    Tab tab5 = new Tab("Inventory");
    
    
    //Employee tab contents
    Button createEmployeeBtn = new Button("Create Employee");
    Button editEmployeeBtn = new Button("Edit Employee");
    Button saveEmployeeBtn = new Button("Save");
    ListView employeeList = new ListView();
    Label employeeNameLbl = new Label("Employee Name");
    Label employeeAddressLbl = new Label("Employee Address");
    Label employeeEmailLbl = new Label("Employee Email");
    Label employeePhoneLbl = new Label("Employee Phone");
    Label employeeSalaryLbl = new Label("Employee Salary");
    Label employeeTypeLbl = new Label("Employee Type");
    TextField employeeNameField = new TextField();
    TextField employeePhoneField = new TextField();
    TextField employeeAddressField = new TextField();
    TextField employeeEmailField = new TextField();
    TextField employeeSalaryField = new TextField();
    TextField employeeTypeField = new TextField();
    
    //StoreArea tab contents
    Button createStoreAreaBtn = new Button("Create Store Area");
    Button editStoreAreaBtn = new Button("Edit Store Area");
    Button saveStoreAreaBtn = new Button("Save");
    ListView storeAreaList = new ListView();
    Label storeIDLbl = new Label("Store ID");
    Label aisleNumberLbl = new Label("Aisle Number");
    Label areaDescriptionLbl = new Label("Area Description");
    TextField storeIDField = new TextField();
    TextField aisleNumberField = new TextField();
    TextField areaDescriptionField = new TextField();

    //Supplier tab contents
    Button createSupplierBtn = new Button("Create Supplier");
    Button editSupplierBtn = new Button("Edit Supplier");
    Button saveSupplierBtn = new Button("Save");
    ListView supplierList = new ListView();
    Label supplierNameLbl = new Label("Supplier Name");
    Label supplierAddressLbl = new Label("Supplier Address");
    Label startDateLbl = new Label("Start Date");
    Label contactNameLbl = new Label("Contact Name");
    Label contactPhoneLbl = new Label("Contact Phone");
    Label contactEmailLbl = new Label("Contact Email");  
    TextField supplierNameField = new TextField();
    TextField supplierAddressField = new TextField();
    TextField startDateField = new TextField();
    TextField contactNameField = new TextField();
    TextField contactPhoneField = new TextField();
    TextField contactEmailField = new TextField();
    
    //Product tab contents
    Button createProductBtn = new Button("Create Product");
    Button editProductBtn = new Button("Edit Product");
    Button saveProductBtn = new Button("Save");
    ListView productList = new ListView();
    Label suppplierIDLbl = new Label("Supplier ID");
    Label productNameLbl = new Label("Product Name");
    Label productDescriptionLbl = new Label("Product Description");
    Label purchaseAmountLbl = new Label("Purchase Amount");
    Label sellPriceLbl = new Label("Sell Price");
    TextField supplierIDField = new TextField();
    TextField productNameField = new TextField();
    TextField productDescriptionField = new TextField();
    TextField purchaseAmountField = new TextField();
    TextField sellPriceField = new TextField();
    
    //Copy paste 
    //Button createBtn = new Button();
    //Button editBtn = new Button();
    //Button saveBtn = new Button("Save");
    //ListView List = new ListView();
    //Label Lbl = new Label();
    //TextField Field = new TextField();
    
    // Menu Bar
    MenuBar mnuBar = new MenuBar();
    
    GridPane mainPane = new GridPane();
    GridPane employeePane = new GridPane();
    GridPane storeAreaPane = new GridPane();
    GridPane productsPane = new GridPane();
    GridPane supplierPane = new GridPane();
    //GridPane inventoryPPane = new GridPane();
    
    @Override
    public void start(Stage primaryStage) {
        
        tab1.setClosable(false);
        tab2.setClosable(false);
        tab3.setClosable(false);
        tab4.setClosable(false);
        tab5.setClosable(false);
        
        
        //Employee Pane Additions
        employeePane.setHgap(10);
        employeePane.setVgap(10);
        employeePane.setPadding(new Insets(30,15,15,15));
        employeePane.add(employeeList, 0, 0, 1, 7);
        employeePane.add(employeeNameField, 2, 0);
        employeePane.add(employeeAddressField, 2, 1);
        employeePane.add(employeePhoneField, 2, 2);
        employeePane.add(employeeSalaryField, 2, 3);
        employeePane.add(employeeEmailField, 2, 4);
        employeePane.add(employeeTypeField, 2, 5);
        employeePane.add(employeeNameLbl, 1, 0);
        employeePane.add(employeeAddressLbl, 1, 1);
        employeePane.add(employeePhoneLbl, 1, 2);
        employeePane.add(employeeSalaryLbl, 1, 3);
        employeePane.add(employeeEmailLbl, 1, 4);
        employeePane.add(employeeTypeLbl, 1, 5);
        employeePane.add(createEmployeeBtn, 1, 6);
        employeePane.add(editEmployeeBtn, 2, 6);
        employeePane.add(saveEmployeeBtn, 3, 6);
        saveEmployeeBtn.setVisible(false);
        
        //StoreArea Pane Additions
        storeAreaPane.setHgap(10);
        storeAreaPane.setVgap(10);
        storeAreaPane.setPadding(new Insets(30,15,15,15));
        storeAreaPane.add(storeAreaList, 0, 0, 1, 7);
        storeAreaPane.add(storeIDField, 2, 0);
        storeAreaPane.add(areaDescriptionField, 2, 1);
        storeAreaPane.add(aisleNumberField, 2, 2);
        storeAreaPane.add(storeIDLbl, 1, 0);
        storeAreaPane.add(areaDescriptionLbl, 1, 1);
        storeAreaPane.add(aisleNumberLbl, 1, 2);
        storeAreaPane.add(createStoreAreaBtn, 1, 4);
        storeAreaPane.add(editStoreAreaBtn, 2, 4);
        storeAreaPane.add(saveStoreAreaBtn, 3, 4);
        saveStoreAreaBtn.setVisible(false);
        
        //Suppliers Pane Additions
        supplierPane.setHgap(10);
        supplierPane.setVgap(10);
        supplierPane.setPadding(new Insets(30,15,15,15));
        supplierPane.add(supplierList, 0, 0, 1, 7);
        supplierPane.add(supplierNameField, 2, 0);
        supplierPane.add(supplierAddressField, 2, 1);
        supplierPane.add(startDateField, 2, 2);
        supplierPane.add(contactNameField, 2, 3);
        supplierPane.add(contactPhoneField, 2, 4);
        supplierPane.add(contactEmailField, 2, 5);
        supplierPane.add(supplierNameLbl, 1, 0);
        supplierPane.add(supplierAddressLbl, 1, 1);
        supplierPane.add(startDateLbl, 1, 2);
        supplierPane.add(contactNameLbl, 1, 3);
        supplierPane.add(contactPhoneLbl, 1, 4);
        supplierPane.add(contactEmailLbl, 1, 5);
        supplierPane.add(createSupplierBtn, 1, 6);
        supplierPane.add(editSupplierBtn, 2, 6);
        supplierPane.add(saveSupplierBtn, 3, 6);
        saveSupplierBtn.setVisible(false);
        
        //Products Pane Additions
        productsPane.setHgap(10);
        productsPane.setVgap(10);
        productsPane.setPadding(new Insets(30,15,15,15));
        productsPane.add(productList, 0, 0, 1, 7);
        productsPane.add(supplierIDField, 2, 0);
        productsPane.add(productNameField, 2, 1);
        productsPane.add(productDescriptionField, 2, 2);
        productsPane.add(purchaseAmountField, 2, 3);
        productsPane.add(sellPriceField, 2, 4);
        productsPane.add(suppplierIDLbl, 1, 0);
        productsPane.add(productNameLbl, 1, 1);
        productsPane.add(productDescriptionLbl, 1, 2);
        productsPane.add(purchaseAmountLbl, 1, 3);
        productsPane.add(sellPriceLbl, 1, 4);
        productsPane.add(createProductBtn, 1, 6);
        productsPane.add(editProductBtn, 2, 6);
        productsPane.add(saveProductBtn, 3, 6);
        saveProductBtn.setVisible(false);
        
        // Adding our GridPanes to each tab.
        tab1.setContent(employeePane);
        tab2.setContent(storeAreaPane);
        tab3.setContent(productsPane);
        tab4.setContent(supplierPane);
        //tab5.setContent();
        
        // Adding the Tabs to the TabPane
        tbPane.getTabs().add(tab1);
        tbPane.getTabs().add(tab2);
        tbPane.getTabs().add(tab3);
        tbPane.getTabs().add(tab4);
        //tbPane.getTabs().add(tab5);
        
        // Create each overall Menu
        Menu menuCalcTotal = new Menu("Reports");
        Menu menuDescribe = new Menu("View");
        
        //Add a MenuItem which is a "sub-menu"
        menuCalcTotal.getItems().add(new MenuItem("Employees from a store"));
        menuCalcTotal.getItems().add(new MenuItem("Inventory from a store"));
        menuCalcTotal.getItems().add(new MenuItem("Workers that worked a range of dates"));
        menuDescribe.getItems().add(new MenuItem("Status - All Sprockets"));
        
        mnuBar.getMenus().addAll(menuCalcTotal, menuDescribe);
        
        mainPane.setAlignment(Pos.CENTER);
        mainPane.add(mnuBar, 0, 0);
        mainPane.add(tbPane, 0, 1);
        
        Scene primaryScene = new Scene(mainPane,800,650);
        primaryStage.setScene(primaryScene);
        primaryStage.setTitle("HW 1 Pane Test");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
