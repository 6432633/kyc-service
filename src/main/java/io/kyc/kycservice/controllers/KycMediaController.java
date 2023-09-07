package io.kyc.kycservice.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;


@RestController
public class KycMediaController {
    private final String videoPath = "src/main/resources/video";
    private final String imagesPath = "src/main/resources/images";

    @PostMapping(path = "/{id}/video", consumes = {MediaType.APPLICATION_OCTET_STREAM_VALUE},
            headers = "Accept=application/octet-stream")
    public void storeVideoContent(@RequestBody byte[] videoContent) {
        //verify api key exist if not throw invalidapikeyexception
        try {
            File video = new File(videoPath + "/video.mp4");
            OutputStream os = new FileOutputStream(video);
            os.write(videoContent);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @PostMapping(path="/{id}/image", headers = "Accept=application/form-data")
    public void storeImageContent(@RequestBody MultipartFile image){
        try {
            File screenshot = new File(imagesPath + "/" + image.getName() + ".jpeg");
            OutputStream os = new FileOutputStream(screenshot);
            os.write(image.getBytes());
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
