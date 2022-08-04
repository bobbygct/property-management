package com.mycompany.propertymanagement.service;

import com.mycompany.propertymanagement.entity.PropertyEntity;
import com.mycompany.propertymanagement.model.PropertyDTO;
import com.mycompany.propertymanagement.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService{

    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public PropertyService saveProp(PropertyDTO propertyDTO) {
        PropertyEntity ent = new PropertyEntity();

        ent.setAddress(propertyDTO.getAddress());
        ent.setDesc(propertyDTO.getDesc());
        ent.setOwnerEmail(propertyDTO.getOwnerEmail());
        ent.setOwnerName(propertyDTO.getOwnerName());
        ent.setTitle(propertyDTO.getTitle());
        ent.setPrice(propertyDTO.getPrice());

        propertyRepository.save(ent);


        return null;
    }
}
