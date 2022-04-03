package bd.org.spcbl.inventorymanagement;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String getHome(){
        return "home.html";
    }
    @RequestMapping("/addInventory")
    public ModelAndView addInventory(@ModelAttribute Inventory inventory1){
       //System.out.println("Inventory Name:"+txt_name);
       //model.addAttribute("empname",txt_name);
        System.out.println(inventory1.getEname());
        ModelAndView model = new ModelAndView();
        model.setViewName("inventory.html");
        return model;
    }
}
