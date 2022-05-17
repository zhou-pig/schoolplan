package com.train.schoolplan.model;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 工程实践第8组
 * @since 2022-05-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Star对象", description="")
public class Star implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer postId;

    private Integer userId;


}
