package ge.edu.sangu.geo_symbol_converter.controller;

import ge.edu.sangu.geo_symbol_converter.model.ConvertRequest;
import ge.edu.sangu.geo_symbol_converter.service.AsciiToGeoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private AsciiToGeoConverter asciiToGeoConverter;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("convertRequest", new ConvertRequest());
        model.addAttribute("convertedText", "");
        return "index";
    }

    @PostMapping
    public String index(Model model, @ModelAttribute ConvertRequest convertRequest) {
        String convertedText = asciiToGeoConverter.convertText(convertRequest.getText());
        model.addAttribute("convertedText", convertedText);
        return "index";
    }

}
