package com.lizhi.xingbao.mapper;

import com.lizhi.xingbao.dto.AudioDto;
import com.lizhi.xingbao.entity.Audio;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AudioMapper extends EntityMapper<AudioDto, Audio>{
}
