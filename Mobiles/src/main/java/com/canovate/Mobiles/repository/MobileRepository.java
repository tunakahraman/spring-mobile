package com.canovate.Mobiles.repository;

import com.canovate.Mobiles.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer> {


}
