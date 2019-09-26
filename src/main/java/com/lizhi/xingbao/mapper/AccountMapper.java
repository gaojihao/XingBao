package com.lizhi.xingbao.mapper;

import com.lizhi.xingbao.dto.AccountDto;
import com.lizhi.xingbao.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AccountMapper extends EntityMapper<AccountDto, Account> {

}
