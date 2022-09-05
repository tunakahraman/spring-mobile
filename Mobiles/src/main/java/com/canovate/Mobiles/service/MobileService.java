package com.canovate.Mobiles.service;

import com.canovate.Mobiles.model.Mobile;

import java.util.List;

public interface MobileService {

    public String createMobile(Mobile mobile);
    public String updateMobile(Mobile mobile);
    public String deleteMobile(Integer id);
    public Mobile getMobile(Integer id);
    public List<Mobile> getAllMobile();


}
