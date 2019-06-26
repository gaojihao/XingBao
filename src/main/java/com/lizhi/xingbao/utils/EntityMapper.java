package com.lizhi.xingbao.utils;

import java.util.List;

public interface EntityMapper<D,E> {

    /**
     * DTO转Entity
     * @param dto
     * @return entity
     */
    E toEntity(D dto);

    /**
     * Entity转DTO
     * @param entity
     * @return dto
     */
    D toDto(E entity);

    /**
     * DTO集合转Entity集合
     * @param dtoList
     * @return
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * Entity集合转DTO集合
     * @param entityList
     * @return
     */
    List <D> toDto(List<E> entityList);
}
