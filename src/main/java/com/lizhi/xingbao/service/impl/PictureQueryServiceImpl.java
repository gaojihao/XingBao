package com.lizhi.xingbao.service.impl;

import com.lizhi.xingbao.model.Picture;
import com.lizhi.xingbao.respository.PictureRepository;
import com.lizhi.xingbao.service.PictureQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

@Service("PictureQueryService")
public class PictureQueryServiceImpl implements PictureQueryService {

    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public List<Picture> queryAll(Picture picture, Pageable pageable) {
        return  pictureRepository.findAll();
    }

    class Spec implements Specification<Picture> {

        private Picture picture;

        public Spec(Picture picture){
            this.picture = picture;
        }

        @Override
        public Predicate toPredicate(Root<Picture> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
            List<Predicate> list = new ArrayList<>();

            if (!ObjectUtils.isEmpty(picture.getFilename())){
                list.add(cb.like(root.get("filename").as(String.class), "%"+picture.getFilename()+"%"));
            }

            Predicate [] p = new Predicate[list.size()];
            return cb.and(list.toArray(p));
        }
    }
}
