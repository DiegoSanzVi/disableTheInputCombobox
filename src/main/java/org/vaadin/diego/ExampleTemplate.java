package org.vaadin.diego;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.vaadin.diego.ExampleTemplate.ExampleModel;

import java.util.List;

/**
 * Simple template example.
 */
@Tag("example-template")
@HtmlImport("src/example-template.html")
public class ExampleTemplate extends PolymerTemplate<ExampleModel> {


    public ExampleTemplate() {

    }

    public interface ExampleModel extends TemplateModel {

        void setEmployees(List<Employee> employeeList);
    }

    public void setEmployees(List<Employee> employeeList){
        getModel().setEmployees(employeeList);
    }
}
