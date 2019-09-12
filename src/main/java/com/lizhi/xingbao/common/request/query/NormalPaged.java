package com.lizhi.xingbao.common.request.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class NormalPaged extends BasePaged {

    private static final long serialVersionUID = -7246012034971217725L;
}
