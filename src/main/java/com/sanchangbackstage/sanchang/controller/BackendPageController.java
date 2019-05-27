package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.HTTPmessage.Message;
import com.sanchangbackstage.sanchang.Model.*;
import com.sanchangbackstage.sanchang.Model.Interface.TBADMINISTRATORSINTERFACE;
import com.sanchangbackstage.sanchang.Model.Interface.TBINTERPEOPLEINTERFACE;
import com.sanchangbackstage.sanchang.StatusMessage.StatusMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class BackendPageController {

    //    解除文件大小限制
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小
        factory.setMaxFileSize("102400KB");
        /// 总上传数据大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }



    @Value(value = "${baseUrl}")
    public String baseUrl;

    @Autowired
    public TBVIDEOINFOINTERFACE tbvideoinfointerface;

    @Autowired
    public TBTEXTIMAGEINTERFACE tbtextimageinterface;

    @Autowired
    public TBPEOPLEINFOINTERFACE tbpeopleinfointerface;

    @Autowired
    public TBINTERPEOPLEINTERFACE tbinterpeopleinterface;





//    public BackendPage backendPageService = new BackendPage();
    //      上传视频
//    @PostMapping(value = "/uploadVideo")
//    public String uploadVideo(@RequestParam(value = "file") MultipartFile file){
//        String url = backendPageService.saveVideo(file);
//        return url;
//    }

    @PostMapping(value = "/video")
    public String videoUpload(@RequestParam(value = "file") MultipartFile file){

        if (file.isEmpty()){
            return "上传了空文件";
        }else {
            String path = baseUrl+file.getOriginalFilename();
            File desFile = new File(path);
            if (!desFile.getParentFile().exists()){
                desFile.mkdir();
            }else {
                try {
                    file.transferTo(desFile);
                } catch (IOException e) {
                    return "上传出现错误";
                }
            }
            return path;
        }
    }


    //获得所有视频
    @GetMapping(value = "/getAllVideo")
    public StatusMessage getAllVideo(){
        StatusMessage statusMessage = new StatusMessage();
        statusMessage.setData(tbvideoinfointerface.findAll());
       return statusMessage;
    }
    //获得指定id的视频
    @GetMapping(value = "/getVideoById/{id}")
    public TBVIDEOINFO getVideoById(@PathVariable(value = "id") Integer id){
        return tbvideoinfointerface.findById(id).get();
    }
    //添加一条视频
    @PostMapping(value = "/uploadVideo")
    public Message uploadVideo(@RequestParam(value = "file") MultipartFile file,
                               @RequestParam(value = "videoContent")String videoContent,
                               @RequestParam(value = "videoName")String videoName
                            ){
        Message message = new Message();
        try {
            String path = this.videoUpload(file);
            TBVIDEOINFO tbvideoinfo = new TBVIDEOINFO();
            tbvideoinfo.setPRAISESUM(0);
            tbvideoinfo.setVIDEOCONTENT(videoContent);
            tbvideoinfo.setVIDEONAME(videoName);
            tbvideoinfo.setVIDEOPATH(path);
            tbvideoinfo.setVIDEOPLAYSUM(0);
            tbvideoinfo.setVIDEODATE(new Date());
            tbvideoinfo.setVIDEOFLAG("视频");
            message.message="视频添加成功！";
        }catch (Exception e){
            message.message=e.toString();
        }


        return message;
    }
    //删除视频
    @PostMapping(value = "/deleteVideo/{id}")
    public void deleteVideo(@PathVariable(value = "id")int id){
        TBVIDEOINFO tbvideoinfo = new TBVIDEOINFO();
        tbvideoinfo.setVIDEOID(id);
        tbvideoinfointerface.delete(tbvideoinfo);
    }



    //获得所有文章
    @GetMapping(value = "/getAllTextAndImg")
    public List<TBTEXTIMAGE> getAllText(){
        return tbtextimageinterface.findAll();
    }

    //获得指定id的文章
    @GetMapping(value = "/getTextAndImgById/{id}")
    public TBTEXTIMAGE getTextAndImgById(@PathVariable(value = "id") int id){
        return tbtextimageinterface.findById(id).get();
    }

    //添加文章
    @PostMapping(value = "/addTextAndImg")
    public StatusMessage addTextAndImg(@RequestParam(value = "name")String name,
                              @RequestParam(value = "content")String content,
                              @RequestParam(value = "flag")String flag,
                              @RequestParam(value = "img",required = false)MultipartFile img){
        StatusMessage statusMessage;
        try {
            TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
            tbtextimage.setTINAME(name);
            tbtextimage.setTIDATE(new Date());
            if(flag.equals("图片")){
                String path = this.videoUpload(img);
                tbtextimage.setTIPATH(path);
            }else {
                tbtextimage.setTIPATH("");
            }

            tbtextimage.setTICONTENT(content);
            tbtextimage.setTIFLAG(flag);
            tbtextimage.setTIPRAISESUM(0);
            tbtextimage.setTIVISITSUM(0);
            tbtextimageinterface.save(tbtextimage);
            statusMessage = new StatusMessage();
        }catch (Exception e){
            statusMessage = new StatusMessage(e.toString());
        }
        return statusMessage;

    }
    //删除图文
    @PostMapping(value = "/deleteTextAndImg/{id}")
    public void deleteTextAndImg(@PathVariable(value = "id")int id){
        TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
        tbtextimage.setTIID(id);
        tbtextimageinterface.delete(tbtextimage);
    }
    //修改图文
    @PostMapping(value = "/updateTextAndImg")
    public void updateTextAndImg(@RequestParam(value = "id")String id,
                                 @RequestParam(value = "name",required = false)String name,
                                 @RequestParam(value = "content",required = false)String content,
                                 @RequestParam(value = "praisesum",required = false)String praisesum,
                                 @RequestParam(value = "visit",required = false)String visit){
        TBTEXTIMAGE tbtextimageOld = this.getTextAndImgById(Integer.parseInt(id));
        TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
        tbtextimage.setTIID(Integer.parseInt(id));
        tbtextimage.setTINAME(name==""?null:name);
        tbtextimage.setTICONTENT(content==""?null:content);

        tbtextimage.setTIPRAISESUM(praisesum==""?tbtextimageOld.getTIPRAISESUM():Integer.parseInt(praisesum));
        tbtextimage.setTIVISITSUM(visit==""?tbtextimageOld.getTIVISITSUM():Integer.parseInt(visit));
        tbtextimageinterface.save(tbtextimage);

    }



    //获得所有人员
    @GetMapping(value = "/getAllPeopleInfo")
    public List<TBPEOPLEINFO>getallPeopleInfo(){
        return tbpeopleinfointerface.findAll();
    }

    //根据id获取人员
    @GetMapping(value = "/getPeoPleById/{id}")
    public TBPEOPLEINFO getPeopleById(@PathVariable(value = "id") String id){
        return tbpeopleinfointerface.findById(id).get();
    }

    //添加一个人员
    @PostMapping(value = "/addPeopleInfo")
    public void addPeopleInfo(@RequestBody()TBPEOPLEINFO tbpeopleinfo){

        tbpeopleinfointerface.save(tbpeopleinfo);

    }

    @PostMapping(value = "/deletePeopleInfo/{id}")
    public StatusMessage deletePeopleInfo(@PathVariable(value = "id")String id){
        try {
            TBPEOPLEINFO tbpeopleinfo = new TBPEOPLEINFO();
            tbpeopleinfo.setID(id);
            tbpeopleinfointerface.delete(tbpeopleinfo);
        }catch (Exception e){
            return new StatusMessage(e.toString());
        }
        return new StatusMessage();
    }

    //获得所有关系
    @GetMapping(value = "/getAllPeopleInter")
    public List<TBINTERPEOPLE> getAllPeopleInter(){
        return tbinterpeopleinterface.findAll();
    }

    //查询单个人员关系
    @GetMapping(value = "/getPeopleInterById/{id}")
    public TBINTERPEOPLE getPeopleInterById(@PathVariable(value = "id") String id){
        return tbinterpeopleinterface.findById(id).get();
    }

    //添加一个人员关系
    @PostMapping(value = "/addPeopleInter")
    public StatusMessage addPeopleInter(@RequestBody()TBINTERPEOPLE tbinterpeople){
        try {
            tbinterpeopleinterface.save(tbinterpeople);
        }catch (Exception e){
            return new StatusMessage(e.toString());
        }
        return new StatusMessage();

    }

    //删除一个人员关系
    @PostMapping(value = "/deletePeopleInter/{id}")
    public StatusMessage deletePeopleInter(@PathVariable(value = "id")String id){
        try {
            TBINTERPEOPLE tbinterpeople = new TBINTERPEOPLE();

        }catch (Exception e){
            return new StatusMessage(e.toString());
        }
        return new StatusMessage();

    }








}
