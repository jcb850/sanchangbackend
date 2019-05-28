package com.sanchangbackstage.sanchang.Model.Interface;

import com.sanchangbackstage.sanchang.Model.TBADMINISTRATORS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TBADMINISTRATORSINTERFACE extends JpaRepository<TBADMINISTRATORS,Integer> {

       List<TBADMINISTRATORS> findByName(String name);

}
