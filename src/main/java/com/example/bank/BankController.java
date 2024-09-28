package com.example.bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {
    @GetMapping("/")
    public String home() {
        return "home";  
    }
    

   
    @GetMapping("/branches")
    public String getBranches(Model model) {
        List<Branch> branches = Arrays.asList(
                new Branch("GandhiNagar Branch", "Gandhi Nagar, Vijayawada"),
                new Branch("Indiranagar Branch", "Indiranagar, Vijayawada"),
                new Branch("Jayanagar Branch", "Jayanagar, Vijayawada"),
                new Branch("KPuram", "KPuram, Vijayawada"),
                new Branch("E City Branch", "E City, Vijayawada"),
                new Branch("MG Road Branch", "MG Road, Vijayawada"),
                new Branch("Mahanadu Branch", "Mahanadu, Vijayawada"),
                new Branch("Rajajinagar Branch", "Rajajinagar, Vijayawada"),
                new Branch("Hindu Branch", "Hindu, Vijayawada"),
                new Branch("JP Nagar Branch", "JP Nagar, Vijayawada")
        );
        model.addAttribute("bankName", "YES Bank");
        model.addAttribute("branches", branches);
        return "branches";
    }

    @GetMapping("/services")
    public String getServices(Model model) {
        List<Service> services = Arrays.asList(
                new Service("Savings Account"),
                new Service("Current Account"),
                new Service("Fixed Deposit"),
                new Service("Loan Services"),
                new Service("Credit Cards"),
                new Service("Debit Cards"),
                new Service("Internet Banking"),
                new Service("Mobile Banking"),
                new Service("Insurance Services"),
                new Service("Wealth Management")
        );
        model.addAttribute("bankName", "YES BANK");
        model.addAttribute("services", services);
        return "services";
    }
}
