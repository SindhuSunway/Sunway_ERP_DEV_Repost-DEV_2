package erp.view;

import oracle.adf.view.rich.component.rich.input.RichInputText;

public class DiscountUpdate {
    private RichInputText updateDis;

    public DiscountUpdate() {
    }

    public void setUpdateDis(RichInputText updateDis) {
        this.updateDis = updateDis;
    }

    public RichInputText getUpdateDis() {
        System.out.println("Dis  "+updateDis.getValue());  
        return updateDis;
    }
}
