package com.sanchangbackstage.sanchang.controller;

import com.sanchangbackstage.sanchang.Aspect.Aspect;
import com.sanchangbackstage.sanchang.Model.*;
import com.sanchangbackstage.sanchang.Model.Interface.TBADMINISTRATORSINTERFACE;
import com.sanchangbackstage.sanchang.Model.Interface.TBINTERPEOPLEINTERFACE;
import com.sanchangbackstage.sanchang.StatusMessage.StatusMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.MultipartConfigElement;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

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

    private final static Logger logger = LoggerFactory.getLogger(Aspect.class);

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

    @PostMapping(value = "/uploadfile")
    public String videoUpload(@RequestParam(value = "file") MultipartFile file){

        if (file.isEmpty()){
            return "上传了空文件";
        }else {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd/HH/mm/ss");//
            String path = baseUrl+df.toString()+file.getOriginalFilename();
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
            return file.getOriginalFilename();
        }
    }



    //获得所有视频
    @GetMapping(value = "/getAllVideo")
    public StatusMessage getAllVideo() throws Exception {
        try {
            return new StatusMessage(tbvideoinfointerface.findAll());
        }catch (Exception e){
            throw new Exception(e);
        }


    }
    //获得指定id的视频
    @GetMapping(value = "/getVideoById/{id}")
    public StatusMessage getVideoById(@PathVariable(value = "id") Integer id) throws Exception {
        try {
            return new StatusMessage(tbvideoinfointerface.findById(id).get()) ;
        }catch (Exception e){
            throw new Exception(e);
        }

    }
    //添加一条视频
    @PostMapping(value = "/uploadVideo")
    public StatusMessage uploadVideo(@RequestParam(value = "file") MultipartFile file,
                               @RequestParam(value = "videoContent")String videoContent,
                               @RequestParam(value = "videoName")String videoName
                            ) throws Exception {

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
            return new StatusMessage();

        }catch (Exception e){
            throw new Exception(e);
        }



    }
    //删除视频
    @PostMapping(value = "/deleteVideo/{id}")
    public StatusMessage deleteVideo(@PathVariable(value = "id")int id) throws Exception {
        try {
            TBVIDEOINFO tbvideoinfo = new TBVIDEOINFO();
            tbvideoinfo.setVIDEOID(id);
            tbvideoinfointerface.delete(tbvideoinfo);
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }

    }
    //删除多个视频
    @PostMapping(value = "/deleteMultipleVideo")
    public StatusMessage deleteMultipleVideo(@RequestParam(value = "idList") int[] idList) throws Exception {
        try {
//            logger.info("16551561");
            for (int i : idList){

                TBVIDEOINFO tbvideoinfo = new TBVIDEOINFO();
                tbvideoinfo.setVIDEOID(i);
                tbvideoinfointerface.delete(tbvideoinfo);
            }
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }
    }



    //获得所有文章
    @GetMapping(value = "/getAllTextAndImg")
    public StatusMessage getAllText() throws Exception {
        try {
            return new StatusMessage(tbtextimageinterface.findAll());
        }catch (Exception e){
            throw new  Exception(e);
        }

    }

    //获得指定id的文章
    @GetMapping(value = "/getTextAndImgById/{id}")
    public StatusMessage getTextAndImgById(@PathVariable(value = "id") int id) throws Exception {
        try {
            return new StatusMessage(tbtextimageinterface.findById(id).get());
        }catch (Exception e){
            throw new Exception(e);
        }

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
    public StatusMessage deleteTextAndImg(@PathVariable(value = "id")int id) throws Exception {
        try {
            TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
            tbtextimage.setTIID(id);
            tbtextimageinterface.delete(tbtextimage);
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }

    }
    //删除多个图文
    @PostMapping(value = "/deleteMultipleTextAndImg")
    public StatusMessage deleteMultipleTextAndImg(@RequestParam(value = "idList") int[] idList) throws Exception {
        try {
            for (int id : idList){
                TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
                tbtextimage.setTIID(id);
                tbtextimageinterface.delete(tbtextimage);
            }

            return  new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    //修改图文
    @PostMapping(value = "/updateTextAndImg")
    public StatusMessage updateTextAndImg(@RequestParam(value = "id")String id,
                                 @RequestParam(value = "name",required = false)String name,
                                 @RequestParam(value = "content",required = false)String content,
                                 @RequestParam(value = "praisesum",required = false)String praisesum,
                                 @RequestParam(value = "visit",required = false)String visit) throws Exception {
        try {
            TBTEXTIMAGE tbtextimageOld = tbtextimageinterface.findById(Integer.parseInt(id)).get();
            TBTEXTIMAGE tbtextimage = new TBTEXTIMAGE();
            tbtextimage.setTIID(Integer.parseInt(id));
            tbtextimage.setTINAME(name==""?null:name);
            tbtextimage.setTICONTENT(content==""?null:content);

            tbtextimage.setTIPRAISESUM(praisesum==""?tbtextimageOld.getTIPRAISESUM():Integer.parseInt(praisesum));
            tbtextimage.setTIVISITSUM(visit==""?tbtextimageOld.getTIVISITSUM():Integer.parseInt(visit));
            tbtextimageinterface.save(tbtextimage);
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }


    }



    //获得所有人员
    @GetMapping(value = "/getAllPeopleInfo")
    public StatusMessage getallPeopleInfo() throws Exception {
        try {
            return new StatusMessage(tbpeopleinfointerface.findAll());
        }catch (Exception e){
            throw new Exception(e);
        }

    }

    //根据id获取人员
    @GetMapping(value = "/getPeoPleById/{id}")
    public StatusMessage getPeopleById(@PathVariable(value = "id") String id) throws Exception {
        try {
            return new StatusMessage(tbpeopleinfointerface.findById(id).get());

        }catch (Exception e){
            throw new Exception(e);
        }
    }

    //添加一个人员
    @PostMapping(value = "/addPeopleInfo")

    public StatusMessage addPeopleInfo(@RequestBody TBPEOPLEINFO tbpeopleinfo) throws Exception {

        try {
            tbpeopleinfo.setID(UUID.randomUUID().toString().replace("-",""));
            tbpeopleinfointerface.save(tbpeopleinfo);
            return new StatusMessage();
        }catch (Exception e){

            throw new Exception(e);
        }

    }
    //删除一个人员信息
    @PostMapping(value = "/deletePeopleInfo/{id}")
    public StatusMessage deletePeopleInfo(@PathVariable(value = "id")String id) throws Exception {
        try {
            TBPEOPLEINFO tbpeopleinfo = new TBPEOPLEINFO();
            tbpeopleinfo.setID(id);
            tbpeopleinfointerface.delete(tbpeopleinfo);
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }

    }

    //获得所有关系
    @GetMapping(value = "/getAllPeopleInter")
    public StatusMessage getAllPeopleInter() throws Exception {
        try {
            return new StatusMessage(tbinterpeopleinterface.findAll());
        }catch (Exception e){
            throw new Exception(e);
        }

    }

    //查询单个人员关系
    @GetMapping(value = "/getPeopleInterById/{id}")
    public StatusMessage getPeopleInterById(@PathVariable(value = "id") String id) throws Exception {
        try {
            return new  StatusMessage(tbinterpeopleinterface.findById(id).get());
        }catch (Exception e){
            throw new Exception(e);
        }

    }

    //添加一个人员关系
    @PostMapping(value = "/addPeopleInter")
    public StatusMessage addPeopleInter(@RequestBody()TBINTERPEOPLE tbinterpeople) throws Exception {
        try {
            tbinterpeopleinterface.save(tbinterpeople);
            return new StatusMessage();

        }catch (Exception e){
            throw new Exception(e);
        }


    }

    //删除一个人员关系
    @PostMapping(value = "/deletePeopleInter/{id}")
    public StatusMessage deletePeopleInter(@PathVariable(value = "id")String id) throws Exception {
        try {
            TBINTERPEOPLE tbinterpeople = new TBINTERPEOPLE();
            return new StatusMessage();

        }catch (Exception e){
            throw new Exception(e);
        }


    }
    //相亲点赞接口
    @GetMapping(value = "/praise/{id}")
    public StatusMessage praiseMessage(@PathVariable(value = "id")String id) throws Exception {
        try{
            TBPEOPLEINFO tbpeople=tbpeopleinfointerface.findById(id).get();
            int quantty= tbpeople.getQUANTITY()+1;
            tbpeople.setQUANTITY(quantty);
            tbpeopleinfointerface.save(tbpeople);
            return new StatusMessage();
        }catch (Exception e){
           throw new Exception(e);

        }
    }
    //相亲浏览量接口
    @GetMapping(value = "/views/{id}")
    public StatusMessage viewMessage (@PathVariable(value = "id")String id) throws Exception {
        try {
            TBPEOPLEINFO tbpeople=tbpeopleinfointerface.findById(id).get();
            int quantty= tbpeople.getPAGEVIEW()+1;
            tbpeople.setPAGEVIEW(quantty);
            tbpeopleinfointerface.save(tbpeople);
            return new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }

    }
    //视频点赞接口
    @GetMapping(value = "/praiseVideo/{id}")
    public StatusMessage praiseVideo(@PathVariable(value = "id")int id) throws Exception {
        try {
            TBVIDEOINFO tbviode=tbvideoinfointerface.findById(id).get();
            int parse=tbviode.getPRAISESUM()+1;
            tbviode.setPRAISESUM(parse);
            tbvideoinfointerface.save(tbviode);
            return  new StatusMessage();
        }catch (Exception e){
            throw new Exception(e);
        }
    }
    //视频浏览量接口
    @GetMapping(value = "/viewsVideo/{id}")
    public StatusMessage viewsVideo(@PathVariable(value = "id")int id)throws Exception{
        try {
            TBVIDEOINFO tbvideo=tbvideoinfointerface.findById(id).get();
            int playsum=tbvideo.getVIDEOPLAYSUM()+1;
            tbvideo.setVIDEOPLAYSUM(playsum);
            tbvideoinfointerface.save(tbvideo);
            return  new StatusMessage();
        }catch (Exception e) {
            throw new Exception(e);
        }
    }





}
