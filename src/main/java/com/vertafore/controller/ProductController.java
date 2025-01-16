package com.vertafore.controller;

import com.vertafore.beans.Product;
import com.vertafore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @RequestMapping("/")
    public String welcomePage(){
        return "welcome";
    }
    @RequestMapping(value = "/addproducts",method = RequestMethod.GET)
    public String showAddForm(ModelMap model)
    {
        model.addAttribute("product",new Product());
        return "addproducts";
    }

    @RequestMapping(value = "/searchproducts",method = RequestMethod.GET)
    public String showSearchForm(ModelMap model)
    {
        model.addAttribute("product",new Product());
        return "searchproducts";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addProduct(Product product,ModelMap model)
    {
       Product p = productService.addProduct(product);
       if(p!= null)
           model.addAttribute("status","Product inserted successfully");
       else
           model.addAttribute("status", "Product could not be added");
       return "status";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String searchProduct(Product product,ModelMap model)
    {

        Product p = productService.searchProduct(product.getPid());
        System.out.println(p);
        if(p!= null) {
            model.addAttribute("product", p);
            return "productdetails";
        }
        else {
            model.addAttribute("status", "Product not found");
            return "status";
        }

    }

}
