package org.example.exercicio08.controller;

import org.example.exercicio08.dto.CarInfoDto;
import org.example.exercicio08.service.FipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class FipeController {

    private final FipeService fipeService;

    @Autowired
    public FipeController(FipeService fipeService) {
        this.fipeService = fipeService;
    }

    @GetMapping("/fipe/codigo/marca/{nameBrand}")
    @ResponseBody
    public String getCodeBrand(@PathVariable String nameBrand) {
        return fipeService.getBrandCode(nameBrand);
    }

    @GetMapping("/fipe/codigo/modelo/{codeBrand}/{nameModel}")
    @ResponseBody
    public String getCodeModel(@PathVariable String codeBrand, @PathVariable String nameModel) {
        return fipeService.getModelCode(codeBrand, nameModel);
    }

    @GetMapping("/fipe/codigo/ano/{codeBrand}/{codeModel}/{nameYear}")
    @ResponseBody
    public String getCodeYear(@PathVariable String codeBrand, @PathVariable String codeModel, @PathVariable String nameYear) {
        return fipeService.getYearCode(codeBrand, codeModel, nameYear);
    }

    @PostMapping("/fipe")
    @ResponseBody
    public HashMap<String, String> carValue(@RequestBody CarInfoDto carRequest) {
        String brandCode = fipeService.getBrandCode(carRequest.getMarca());
        String modelCode = fipeService.getModelCode(brandCode, carRequest.getModelo());
        String yearCode = fipeService.getYearCode(brandCode, modelCode, carRequest.getAno());

        return fipeService.getValue(brandCode, modelCode, yearCode);
    }
}
