package com.jendarey.jendareytech.repository;

import com.jendarey.jendareytech.model.DevopsTools;
import com.jendarey.jendareytech.model.Voter;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter, Long> {

/*
    @Query(value = "select devops_tools from voter",nativeQuery = true)
    public List<String> findAllDevops();
*/


}
