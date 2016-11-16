package com.etong.information.data.model;


import java.io.Serializable;


/**
 * Created by Administrator on 2015/10/14.
 */
public class RepairInfo implements Serializable {
    private String workOrder;
    private String plateNum;
    private String brandName;
    private String carTypeName;
    private String custName;
    private String lationName;
    private String lationTel;
    private String busitype;
    private String repairType;
    private Double money;
    private String entryDate;
    private String finishDate;

    private String balanceDate;





    public String getEntryDate() {

        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }
    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(String balanceDate) {
        this.balanceDate = balanceDate;
    }

    private Integer mileage;

    public String getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(String workOrder) {
        this.workOrder = workOrder;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getLationName() {
        return lationName;
    }

    public void setLationName(String lationName) {
        this.lationName = lationName;
    }

    public String getLationTel() {
        return lationTel;
    }

    public void setLationTel(String lationTel) {
        this.lationTel = lationTel;
    }

    public String getBusitype() {
        return busitype;
    }

    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public RepairInfo(String workOrder, String plateNum, String brandName, String carTypeName, String custName, String lationName, String lationTel, String busitype, String repairType, Double money, String entryDate, String finishDate, String balanceDate, Integer mileage) {
        this.workOrder = workOrder;
        this.plateNum = plateNum;
        this.brandName = brandName;
        this.carTypeName = carTypeName;
        this.custName = custName;
        this.lationName = lationName;
        this.lationTel = lationTel;
        this.busitype = busitype;
        this.repairType = repairType;
        this.money = money;
        this.entryDate = entryDate;
        this.finishDate = finishDate;
        this.balanceDate = balanceDate;
        this.mileage = mileage;
    }

    public RepairInfo() {
    }
}
