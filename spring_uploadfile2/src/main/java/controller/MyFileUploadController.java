package controller;

import form.MyUploadForm;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

@Controller
public class MyFileUploadController {
    @InitBinder
    public void InitBinder(WebDataBinder dataBinder) {
        Object taget = dataBinder.getTarget();
        if (taget == null) {
            return;
        }
        System.out.println("Taget: "+taget);
        if (taget.getClass() == MyUploadForm.class) {
            dataBinder.registerCustomEditor(byte[].class,new ByteArrayMultipartFileEditor());
        }
    }

    @RequestMapping(value = "/uploadOneFile", method = RequestMethod.GET)
    public String uploadOneFileHandle(Model model) {
        MyUploadForm myUploadForm = new MyUploadForm();
        model.addAttribute("myUploadForm", myUploadForm);
        return "uploadOneFile";
    }

    @RequestMapping(value = "/uploadOneFile",method = RequestMethod.POST)
    public String uploadOneFileHandlePost(HttpRequest request, Model model, @ModelAttribute("myUploadFile") MyUploadForm myUploadForm) {
        return this.doUpload(request,model,myUploadForm);
    }

    private String doUpload(Se request, Model model, MyUploadForm myUploadForm) {
        String description = myUploadForm.getDescription();
        System.out.println("Description: " +description);

        String uploadRootPath =  request.getServletContext().getRealParth("upload");
    }
}
