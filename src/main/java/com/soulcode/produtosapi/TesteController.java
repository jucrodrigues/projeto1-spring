package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TesteController {
    @GetMapping("/elastechv2")
    @ResponseBody
    public String paginaElasTechv2(){
        return "Página ElasTech versão 2";
    }
}
