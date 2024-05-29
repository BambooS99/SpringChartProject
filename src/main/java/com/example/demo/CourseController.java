package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CourseController {

    @GetMapping("/charts")
    public String retrieveAllCharts(Model model) {
        List<Chart> charts = List.of(
            new Chart(1, "John", new String[]{"Monday", "Wednesday", "Friday"}),
            new Chart(2, "Rob", new String[]{"Monday", "Wednesday", "Friday"}),
            new Chart(3, "Thomas", new String[]{"Tuesday", "Thursday"}),
            new Chart(4, "Matthew", new String[]{"Tuesday", "Thursday"}),
            new Chart(5, "Nathan", new String[]{"Saturday", "Sunday", "Monday"})
        );
        model.addAttribute("charts", charts);
        return "charts"; // Refers to charts.html in the templates directory
    }
}
