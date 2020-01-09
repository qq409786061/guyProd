package com.klay.guyProd.service.impl;

import java.util.List;
import java.util.UUID;


import com.alibaba.dubbo.config.annotation.Service;
import com.klay.guyProd.mapper.GuyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.klay.guyProd.entity.Guy;
import com.klay.guyProd.repository.GuyRepository;
import com.klay.guyProd.service.GuyService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class GuyServiceImpl implements GuyService{
	
    @Autowired
    private GuyRepository guyRepository;

    @Autowired
    private GuyMapper guyMapper;

    @Value("${server.port}")
    private String serverPort;

    @Value("${dubbo.protocol.port}")
    private String dubboPort;

    public  void  saveGuy(Guy guy){
        guyRepository.save(guy);
    }

    public List<Guy> findAll(){
        return  guyRepository.findAll();
    }
    
    public void addTow() {
       Guy guy = new Guy();
       guy.setName("Ben");
       guy.setAge(18);
        guyRepository.save(guy);

       System.out.print(1/0);

       Guy guys = new Guy();
       guys.setName("NaNa");
       guys.setAge(18);
       guyRepository.save(guys);
    }

    @Override
    public Guy findById(String id) {
        /*Optional<Guy> guyOptional = guyRepository.findById(id);
        if(guyOptional!=null){
            return guyOptional.get();
        }else{
            return null;
        }*/
        return null;
    }

    @Override
    public Guy findByName(String name) {
        return guyMapper.findGuyByName(name);
    }

    @Override
    public void saveGuyMybatis(Guy guy) {
        guyMapper.insert(guy.getId(),guy.getAge(),guy.getName());
        System.out.println(1/0);
        String id = "";
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString();
        id=str.replace("-", "");
        guyMapper.insert(id,12,"laben");
    }

    @Override
    public String getPort() {
        return "serverPort:"+serverPort+",dubboPort:"+dubboPort;
    }
}
