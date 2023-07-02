package com.krohn.smartds.imageservice.controllers;

import com.krohn.smartds.imageservice.entities.Image;
import com.krohn.smartds.imageservice.services.ImageService;
import org.bson.types.Binary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
public class ImageController {

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    private ImageService imageService;

    @PostMapping("/images/addImage")
    public String addImage(@RequestParam("name") String name, @RequestParam("image")MultipartFile image, Model model)throws IOException{
        String id = imageService.addImage(name,image);
        return "redirect:/images/" + id;
    }
    @GetMapping("/images/{id}")
    public Image getImages(@PathVariable String id, Model model){
        Image image = imageService.getImage(id);
        model.addAttribute("name",image.getName());
        model.addAttribute("image", Base64.getEncoder().encodeToString(image.getImage().getData()));
        return image;
    }
    @GetMapping("/allImages")
    public List<Image> getAllImages(){
        return imageService.getAllImages();
    }
}

