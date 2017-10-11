package com.ucl.field;

/**
 * Created by jiang.zheng on 2017/9/21.
 */
public class OrderField {

    public static final String[] header = new String[]{"订单号", "代理名称", "代理编码", "订单类型", "业务员部门", "创建日期",
            "出国日期", "回国日期", "使用天数", "套餐名称", "套餐类别", "套餐单价", "客户名称", "客户电话", "订单状态", "订单进度",
            "应收押金", "应收租金", "应收续租租金", "应收快递费用", "提前发货费用", "退款费用", "应收金额", "设备号", "租金支付方式",
            "押金支付流水", "租金实收金额", "租金支付流水", "创建人", "退款日期", "退款原因", "区域",
            "取货方式", "运单号", "邮递方式", "发货日期", "发货人"};
    public static final String[] fields = new String[]{"serialNumber", "departmentName", "departmentCode", "orderType", "staffDept", "createDate",
            "startDate", "endDate", "useDays", "packageName", "packageType", "packagePrice", "customerName", "customerPhone", "orderStatus", "orderProgress",
            "depositAmount", "rentAmount", "releRentAmount", "expressAmount", "deliverAdvanceAmount", "refundPrice", "receiveAmount", "imei", "rentPayType",
            "depositTransactionId", "rentReceivedAmount", "rentTransactionId", "createUserName", "refundDate", "refundReason", "imeiPositionName",
            "takeType", "expressCode", "expressPayType", "deliverDate", "deliverUserName"};
}
