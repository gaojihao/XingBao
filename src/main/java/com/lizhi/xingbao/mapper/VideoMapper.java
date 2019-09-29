package com.lizhi.xingbao.mapper;

import com.lizhi.xingbao.dto.VideoDto;
import com.lizhi.xingbao.entity.Video;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface VideoMapper extends EntityMapper<VideoDto, Video> {

}
