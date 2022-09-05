package com.canovate.Mobiles.controller;

import com.canovate.Mobiles.model.Mobile;
import com.canovate.Mobiles.service.MobileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;


@RestController
@RequestMapping("/mobiles")
public class MobileController {

    MobileService mobileService;

    public MobileController(MobileService mobileService) {
        this.mobileService = mobileService;
    }



    //Gets all mobiles
    @GetMapping("/all")
    public List<Mobile> allMobileList() {
        return mobileService.getAllMobile();
    }


     //Gets specific mobile
      @GetMapping("/find/{id}")
       public ResponseEntity<Mobile> getMobile(@RequestParam(value = "id", required = false)  Integer id) {

          if (null == id)
          {
              return new ResponseEntity<Mobile>(HttpStatus.NOT_FOUND);
          }
              try {
                  Mobile mobile = mobileService.getMobile(id);
                  return new ResponseEntity<Mobile>(mobile, HttpStatus.OK);
              } catch (NoSuchElementException e) {
                  return new ResponseEntity<Mobile>(HttpStatus.NOT_FOUND);
              }
          }




    //Creates new mobile
    @PostMapping("/add")
    public String addMobile(@RequestBody @Valid Mobile mobile) {

        mobileService.createMobile(mobile);
        return "Device Created Successfully.Id no: " + mobile.getId();

    }


    //Updates existing mobile
    @PutMapping("/update/{id}")
    public String updateMobile(@RequestBody Mobile mobile, @PathVariable Integer id) {
        try {
            Mobile existMobile = mobileService.getMobile(id);
            mobileService.updateMobile(mobile);

            return "Device Updated Successfully.Id No: " + mobile.getId();
        }
        catch (NoSuchElementException e) {
            return "Could Not Update the Device";
        }
    }


    //Deletes specific mobile
    @DeleteMapping("/delete/{mobileId}")
    public String deleteMobile(@PathVariable("mobileId") Integer id) {

        mobileService.deleteMobile(id);
        return "Device deleted Successfully";
    }


}
