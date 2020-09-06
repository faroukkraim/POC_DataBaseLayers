package io.gethub.cepr0.demo;

import io.gethub.cepr0.demo.entity.Client;
import io.gethub.cepr0.demo.service.IService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By Farouk-Kraiem
 *
 * @Date 05/09/2020
 * @Time 23:45
 **/
@Service
public abstract class AbstractService<S, D> implements IService<D> {
    protected final JpaRepository<S, Long> repo;
    ModelMapper modelMapper=new ModelMapper();
    private final Class<D> type;

    @Autowired
    public AbstractService(JpaRepository<S, Long> repo, Class<D> type) {
        this.repo = repo;
        this.type = type;
    }

    public AbstractService(JpaRepository<S, Long> repo) {
        this.repo = repo;
        type = null;
    }

    public Class<D> getMyType() {
        return this.type;
    }



    public List<D> getList() {
        List<D> categoryList = new ArrayList<>();
        List<S> categories = repo.findAll();
        if (categories != null && !categories.isEmpty()) {
            List<D> list = new ArrayList<>();
            for (S category : categories) {
                D dClass = copyProperties(category, getMyType());
                list.add(dClass);
            }
            categoryList.addAll(list);
        }
        return categoryList;
    }

    private <T, R> R copyProperties(T source, Class<R> destination) {
        modelMapper.map(source, destination);
        return (R) destination;
    }

}
