package Controller;

import Entity.Sedes;
import Repository.SedeRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping( "/sede")

public class SedesController {
    final SedeRepository sedeRepository;

    public SedesController(SedeRepository sedeRepository) {this.sedeRepository = sedeRepository;}

    @GetMapping(value="")
    public String sedes(){return "/sede/sedes";}

   @GetMapping(value = {"/list"})
    public String listaSedes(Model model){
     List<Sedes> lista = sedeRepository.findAll();
     model.addAttribute("sedeLista", lista);

  return "sede/list";}
}
