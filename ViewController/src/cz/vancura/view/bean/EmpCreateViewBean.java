package cz.vancura.view.bean;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class EmpCreateViewBean {
    private RichInputText employeeName;

    public EmpCreateViewBean() {
    }

    public void setEmployeeName(RichInputText employeeName) {
        this.employeeName = employeeName;
    }

    public RichInputText getEmployeeName() {
        return employeeName;
    }
}
