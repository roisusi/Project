package Model;

import java.util.Date;

public class ActivationFormPri extends ActivationForm{
    private String codeLine;

    public ActivationFormPri(int customerID, String customerName, String contactName, String customerPhoneNumber, String customerEmail, String customerTechName, String customerTechPhoneNumber, String pbxType, String typeOfCalls, String identificationType, int totalNumbers, String snbNumber, String numberRange, String areaCode, String emergencyCity, String callOutSideCountry, String crNumber, String trunkNumber, Date datePicker, String codeLine) {
        super(customerID, customerName, contactName, customerPhoneNumber, customerEmail, customerTechName, customerTechPhoneNumber, pbxType, typeOfCalls, identificationType, totalNumbers, snbNumber, numberRange, areaCode, emergencyCity, callOutSideCountry, crNumber, trunkNumber, datePicker);
        this.codeLine = codeLine;
    }

    public String getCodeLine() {
        return codeLine;
    }

    @Override
    public int getCustomerID() {
        return super.getCustomerID();
    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public String getContactName() {
        return super.getContactName();
    }

    @Override
    public String getCustomerPhoneNumber() {
        return super.getCustomerPhoneNumber();
    }

    @Override
    public String getCustomerEmail() {
        return super.getCustomerEmail();
    }

    @Override
    public String getCustomerTechName() {
        return super.getCustomerTechName();
    }

    @Override
    public String getCustomerTechPhoneNumber() {
        return super.getCustomerTechPhoneNumber();
    }

    @Override
    public String getPbxType() {
        return super.getPbxType();
    }

    @Override
    public String getTypeOfCalls() {
        return super.getTypeOfCalls();
    }

    @Override
    public String getIdentificationType() {
        return super.getIdentificationType();
    }

    @Override
    public int getTotalNumbers() {
        return super.getTotalNumbers();
    }

    @Override
    public String getSnbNumber() {
        return super.getSnbNumber();
    }

    @Override
    public String getNumberRange() {
        return super.getNumberRange();
    }

    @Override
    public String getAreaCode() {
        return super.getAreaCode();
    }

    @Override
    public String getEmergencyCity() {
        return super.getEmergencyCity();
    }

    @Override
    public String getCallOutSideCountry() {
        return super.getCallOutSideCountry();
    }

    @Override
    public String getCrNumber() {
        return super.getCrNumber();
    }

    @Override
    public String getTrunkNumber() {
        return super.getTrunkNumber();
    }

    @Override
    public Date getDatePicker() {
        return super.getDatePicker();
    }
}
