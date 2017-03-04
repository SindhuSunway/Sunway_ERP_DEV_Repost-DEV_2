package erp.view;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class QuantityUpdate {
    private RichInputText updateQua;

    public QuantityUpdate() {
    }

    public void setUpdateQua(RichInputText updateQua) {
        this.updateQua = updateQua;
    }

    public RichInputText getUpdateQua() {
        System.out.println("Qua  "+updateQua.getValue());  
        return updateQua;
    }
}
