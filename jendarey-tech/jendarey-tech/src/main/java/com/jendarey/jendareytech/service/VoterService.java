package com.jendarey.jendareytech.service;


import com.jendarey.jendareytech.model.Voter;
import java.util.List;
import java.util.Map;


public interface VoterService {

  public void save(Voter voter);

  public String getIpAddress();
  public String getHostName();

  public List<Voter> getVoteDetails();
}
