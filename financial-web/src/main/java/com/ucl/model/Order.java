package com.ucl.model;

import com.ucl.common.ExcelAttribute;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jiang.zheng on 2017/9/13.
 */
public class Order implements Serializable {

    @ExcelAttribute(skip = true)
    private static final long serialVersionUID = -1L;

    @ExcelAttribute(name = "订单号")
    private String serialNumber;

    @ExcelAttribute(name = "代理名称")
    private String departmentName;

    @ExcelAttribute(name = "代理编码")
    private String departmentCode;

    @ExcelAttribute(name = "订单类型")
    private String orderType;


    @ExcelAttribute(name = "业务员部门")
    private String staffDept;

    @ExcelAttribute(name = "创建日期")
    private Date createDate;

    @ExcelAttribute(name = "出国日期")
    private Date startDate;

    @ExcelAttribute(name = "回国日期")
    private Date endDate;

    @ExcelAttribute(name = "使用天数")
    private Integer useDays;

    @ExcelAttribute(name = "套餐名称")
    private String packageName;

    @ExcelAttribute(name = "套餐类别")
    private String packageType;

    @ExcelAttribute(name = "套餐单价")
    private Long packagePrice;

    @ExcelAttribute(name = "客户名称")
    private String customerName;

    @ExcelAttribute(name = "客户电话")
    private String customerPhone;

    @ExcelAttribute(name = "订单状态")
    private String orderStatus;

    @ExcelAttribute(name = "订单进度")
    private String orderProgress;

    @ExcelAttribute(name = "应收押金")
    private Long depositAmount;

    @ExcelAttribute(name = "应收租金")
    private Long rentAmount;

    @ExcelAttribute(name = "应收续租租金")
    private Long releRentAmount;

    @ExcelAttribute(name = "应收快递费用")
    private Long expressAmount;

    @ExcelAttribute(name = "提前发货费用")
    private Long deliverAdvanceAmount;

    @ExcelAttribute(name = "退款费用")
    private Long refundPrice;

    @ExcelAttribute(name = "应收金额")
    private Long receiveAmount;

    @ExcelAttribute(name = "设备号")
    private String imei;

    @ExcelAttribute(name = "租金支付方式")
    private String rentPayType;

    @ExcelAttribute(name = "押金支付流水")
    private String depositTransactionId;

    @ExcelAttribute(name = "租金实收金额")
    private Long rentReceivedAmount;

    @ExcelAttribute(name = "租金支付流水")
    private String rentTransactionId;

    @ExcelAttribute(name = "创建人")
    private String createUserName;

    @ExcelAttribute(name = "退款日期")
    private Date refundDate;

    @ExcelAttribute(name = "退款原因")
    private String refundReason;

    @ExcelAttribute(name = "区域")
    private String imeiPositionName;

    @ExcelAttribute(name = "取货方式")
    private String takeType;

    @ExcelAttribute(name = "运单号")
    private String expressCode;

    @ExcelAttribute(name = "邮递方式")
    private String expressPayType;

    @ExcelAttribute(name = "发货日期")
    private Date deliverDate;

    @ExcelAttribute(name = "发货人")
    private String deliverUserName;


    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStaffDept() {
        return staffDept;
    }

    public void setStaffDept(String staffDept) {
        this.staffDept = staffDept;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getUseDays() {
        return useDays;
    }

    public void setUseDays(Integer useDays) {
        this.useDays = useDays;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Long getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(Long packagePrice) {
        this.packagePrice = packagePrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderProgress() {
        return orderProgress;
    }

    public void setOrderProgress(String orderProgress) {
        this.orderProgress = orderProgress;
    }

    public Long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Long getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(Long rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Long getReleRentAmount() {
        return releRentAmount;
    }

    public void setReleRentAmount(Long releRentAmount) {
        this.releRentAmount = releRentAmount;
    }

    public Long getExpressAmount() {
        return expressAmount;
    }

    public void setExpressAmount(Long expressAmount) {
        this.expressAmount = expressAmount;
    }

    public Long getDeliverAdvanceAmount() {
        return deliverAdvanceAmount;
    }

    public void setDeliverAdvanceAmount(Long deliverAdvanceAmount) {
        this.deliverAdvanceAmount = deliverAdvanceAmount;
    }

    public Long getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Long refundPrice) {
        this.refundPrice = refundPrice;
    }

    public Long getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(Long receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getRentPayType() {
        return rentPayType;
    }

    public void setRentPayType(String rentPayType) {
        this.rentPayType = rentPayType;
    }

    public String getDepositTransactionId() {
        return depositTransactionId;
    }

    public void setDepositTransactionId(String depositTransactionId) {
        this.depositTransactionId = depositTransactionId;
    }

    public Long getRentReceivedAmount() {
        return rentReceivedAmount;
    }

    public void setRentReceivedAmount(Long rentReceivedAmount) {
        this.rentReceivedAmount = rentReceivedAmount;
    }

    public String getRentTransactionId() {
        return rentTransactionId;
    }

    public void setRentTransactionId(String rentTransactionId) {
        this.rentTransactionId = rentTransactionId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getImeiPositionName() {
        return imeiPositionName;
    }

    public void setImeiPositionName(String imeiPositionName) {
        this.imeiPositionName = imeiPositionName;
    }

    public String getTakeType() {
        return takeType;
    }

    public void setTakeType(String takeType) {
        this.takeType = takeType;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressPayType() {
        return expressPayType;
    }

    public void setExpressPayType(String expressPayType) {
        this.expressPayType = expressPayType;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getDeliverUserName() {
        return deliverUserName;
    }

    public void setDeliverUserName(String deliverUserName) {
        this.deliverUserName = deliverUserName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "serialNumber='" + serialNumber + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", orderType='" + orderType + '\'' +
                ", staffDept='" + staffDept + '\'' +
                ", createDate=" + createDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", useDays=" + useDays +
                ", packageName='" + packageName + '\'' +
                ", packageType='" + packageType + '\'' +
                ", packagePrice=" + packagePrice +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderProgress='" + orderProgress + '\'' +
                ", depositAmount=" + depositAmount +
                ", rentAmount=" + rentAmount +
                ", releRentAmount=" + releRentAmount +
                ", expressAmount=" + expressAmount +
                ", deliverAdvanceAmount=" + deliverAdvanceAmount +
                ", refundPrice=" + refundPrice +
                ", receiveAmount=" + receiveAmount +
                ", imei='" + imei + '\'' +
                ", rentPayType='" + rentPayType + '\'' +
                ", depositTransactionId='" + depositTransactionId + '\'' +
                ", rentReceivedAmount=" + rentReceivedAmount +
                ", rentTransactionId='" + rentTransactionId + '\'' +
                ", createUserName='" + createUserName + '\'' +
                ", refundDate=" + refundDate +
                ", refundReason='" + refundReason + '\'' +
                ", imeiPositionName='" + imeiPositionName + '\'' +
                ", takeType='" + takeType + '\'' +
                ", expressCode='" + expressCode + '\'' +
                ", expressPayType='" + expressPayType + '\'' +
                ", deliverDate=" + deliverDate +
                ", deliverUserName='" + deliverUserName + '\'' +
                '}';
    }
}
