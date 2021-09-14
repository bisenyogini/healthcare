package com.healthcare.service;

import com.healthcare.entity.Specialize;

import java.util.List;

public interface SpecializeService {
    void createUser(Specialize specialize);

 //   void updateUser(Specialize specialize, Integer id);

    void removeById(Integer id);

    List<Specialize> getAllSpecialize();
}
