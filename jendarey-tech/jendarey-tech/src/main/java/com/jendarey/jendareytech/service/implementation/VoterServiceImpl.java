package com.jendarey.jendareytech.service.implementation;

import com.jendarey.jendareytech.model.Voter;
import com.jendarey.jendareytech.repository.VoterRepository;
import com.jendarey.jendareytech.service.VoterService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VoterServiceImpl implements VoterService {


    private final VoterRepository voterRepository;


    @Override
    public void save(Voter voter) {
        voterRepository.save(voter);
    }

    @Override
    public String getIpAddress() {
        InetAddress ip = null;

        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        hostname = ip.getHostName();
        log.info("{}", "Your current IP address : " + ip);


        System.out.println("Your current Hostname : " + hostname);


        return ip.toString();
    }

    @Override
    public String getHostName() {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }


        String hostAddress = address.toString();
        return hostAddress;
    }





    @Override
    public List<Voter> getVoteDetails() {
      return  voterRepository.findAll();

    }
}
