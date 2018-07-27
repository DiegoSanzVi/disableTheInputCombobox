package org.vaadin.diego;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        ExampleTemplate exampleTemplate = new ExampleTemplate();

        List<Employee> employeeList = new ArrayList<>();

        for ( int i = 1; i <= 10    ; i++){
            Employee e = new Employee();
            e.setFirst("Tatu first " + i);
            e.setLast("Tatu last " + i);
            employeeList.add(e);
        }

        exampleTemplate.setEmployees( employeeList );

        add(exampleTemplate);
    }



    /*
        setClassName("main-layout");
        /*
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.setItems( Stream.of("John","Diego","Richard").collect(Collectors.toList()));
        comboBox.setValue("Diego");
        //comboBox.setEnabled(false);

        comboBox.setReadOnly(true);
        //comboBox.setAllowCustomValue(false);
        //comboBox.setPreventInvalidInput(true);
        add(comboBox);

        for (Component c : comboBox.getChildren().collect(Collectors.toList()) ){
            System.out.print(c);
        }
        System.out.print(comboBox.getChildren().count());*/
}
