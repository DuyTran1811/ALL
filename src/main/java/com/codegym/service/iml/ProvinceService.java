package com.codegym.service.iml;

import com.codegym.model.Province;
import com.codegym.prepositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceService implements IProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public Iterable<Province> findName(Province province) {
        return null;
    }
}
