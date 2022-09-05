package com.canovate.Mobiles.service;

import com.canovate.Mobiles.exception.NotFoundException;
import com.canovate.Mobiles.model.Mobile;
import com.canovate.Mobiles.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService{

    @Autowired
    MobileRepository mobileRepository;

    public MobileServiceImpl(MobileRepository mobileRepository) {

        this.mobileRepository = mobileRepository;
    }



    @Override
    public String createMobile(Mobile mobile) {
        mobileRepository.save(mobile);
        return "Data saved successfully";
    }

    @Override
    public String updateMobile(Mobile mobile) {
        mobileRepository.save(mobile);
        return "Data updated successfully";
    }

    @Override
    public String deleteMobile(Integer id) {
        mobileRepository.deleteById(id);
        return "Data deleted successfully";
    }


    @Override
    public Mobile getMobile(Integer id) {

        if (mobileRepository.findById(id).isEmpty())
            throw new NotFoundException("Requested device does not exist");
        return mobileRepository.findById(id).get();

    }


    @Override
    public List<Mobile> getAllMobile() {

        return mobileRepository.findAll();
    }




}
