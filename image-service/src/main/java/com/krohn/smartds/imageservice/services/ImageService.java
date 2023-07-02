package com.krohn.smartds.imageservice.services;

import com.krohn.smartds.imageservice.entities.Image;
import com.krohn.smartds.imageservice.repositories.ImageRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ImageService {

    private ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

   public String addImage(String name, MultipartFile file) throws IOException{
       Image image = new Image(name);
       image.setImage(new Binary(BsonBinarySubType.BINARY,file.getBytes()));
       image = imageRepository.insert(image);
       return image.getId();

   }
   public Image getImage(String id){
        return imageRepository.findById(id).get();
   }

   public List<Image> getAllImages(){
        return imageRepository.findAll();
   }
   public void deleteImage(String id){
       //Image image = imageRepository.deleteById(id);
   }
}
