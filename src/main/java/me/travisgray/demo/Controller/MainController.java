package me.travisgray.demo.Controller;

import me.travisgray.demo.Models.Resume;
import me.travisgray.demo.Repositories.EducationRepository;
import me.travisgray.demo.Repositories.ExperinceRepository;
import me.travisgray.demo.Repositories.ResumeRepository;
import me.travisgray.demo.Repositories.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @Autowired
    SkillsRepository skillsRepository;

    @Autowired
    EducationRepository educationRepository;

    @Autowired
    ExperinceRepository experinceRepository;

    @Autowired
    ResumeRepository resumeRepository;


    @RequestMapping("/")
    public String showIndex(Model model){
        model.addAttribute("getskills", skillsRepository.count());
        model.addAttribute("skilllist",skillsRepository.findAll());
        model.addAttribute("geteducation",educationRepository.count());
        model.addAttribute("educationlist",educationRepository.findAll());
        model.addAttribute("getexperince",experinceRepository.count());
        model.addAttribute("experincelist",experinceRepository.findAll());
        model.addAttribute("resume",resumeRepository.count());
        model.addAttribute("resumelist",resumeRepository.findAll());
        return "index";

    }


    


}