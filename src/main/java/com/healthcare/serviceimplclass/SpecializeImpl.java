package com.healthcare.serviceimplclass;

import com.healthcare.entity.Specialize;
import com.healthcare.repository.SpecializeRepository;
import com.healthcare.service.SpecializeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecializeImpl implements SpecializeService {
    @Autowired
    private SpecializeRepository specializeRepository;

    @Override
    public void createUser(Specialize specialize) {
        specializeRepository.save(specialize);

    }

   /* @Override
    public void updateUser(Specialize specialize, Integer id) {
        Optional<Specialize>opt=specializeRepository.findById(id);
        specialize=opt.get();
        specializeRepository.updateSpecialize(specialize);

    }*/

    @Override
    public void removeById(Integer id) {
        specializeRepository.deleteById(id);
    }

    @Override
    public List<Specialize> getAllSpecialize() {
 List<Specialize> list=specializeRepository.findAll();
 return list;
    }
}
