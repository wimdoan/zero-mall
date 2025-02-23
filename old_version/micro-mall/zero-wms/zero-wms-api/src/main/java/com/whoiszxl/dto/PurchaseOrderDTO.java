package com.whoiszxl.dto;

import com.whoiszxl.bean.AbstractObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 采购订单表
 * </p>
 *
 * @author whoiszxl
 * @since 2021-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PurchaseOrder DTO对象", description="采购订单表")
public class PurchaseOrderDTO extends AbstractObject implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "供应商ID")
    private Long supplierId;

    @ApiModelProperty(value = "预计到货时间")
    private Date expectArrivalTime;

    @ApiModelProperty(value = "实际到货时间")
    private Date arrivalTime;

    @ApiModelProperty(value = "采购联系人")
    private String purchaseContactor;

    @ApiModelProperty(value = "采购人联系电话")
    private String purchaseContactPhoneNumber;

    @ApiModelProperty(value = "采购人联系邮箱")
    private String purchaseContactEmail;

    @ApiModelProperty(value = "说明备注")
    private String comment;

    @ApiModelProperty(value = "采购员")
    private String purchaser;

    @ApiModelProperty(value = "采购单状态，1：编辑中，2：待审核，3：已审核，4：待入库，5：待结算，6：已完成")
    private Integer purchaseOrderStatus;

    @ApiModelProperty(value = "采购订单详情")
    private List<PurchaseOrderItemDTO> items;

}
