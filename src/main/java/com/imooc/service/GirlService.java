package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Min;
import java.util.Optional;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();

        girlA.setCupSize("A");
        girlA.setAge(18);

        girlRepository.save(girlA);

        Girl girlB = new Girl();

        girlB.setCupSize("BBBB");
        girlB.setAge(19);

        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).orElse(null);
        if (girl != null) {
            Integer age = girl.getAge();
            if (age < 10) {
                //你在上小学吧
                throw new GirlException(ResultEnum.PRIMARY_SCHOOL);

            } else if (age < 16) {
                //你可能上初中
                throw new GirlException(ResultEnum.MIDDLE_SCHOOL);

            }
        } else {
            throw new GirlException(ResultEnum.NOTEXIST);
        }

    }
}
