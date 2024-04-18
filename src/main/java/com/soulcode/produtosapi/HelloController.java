package com.soulcode.produtosapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
//    @RequestMapping(value ="/elastech", method = RequestMethod.GET)
//    @ResponseBody
//    public String paginaElasTech(@RequestParam String nome, @RequestParam int idade){
//        if(idade >=18) {
//        return String.format("Olá %s, sua idade é %d e você está na página ElasTech", nome, idade);
//        } else {
//            return String.format("%S Você não tem idade para fazer o cadastro. Idade = %d", nome, idade);
//        }
//
//
//    }
@RequestMapping(value ="/elastech", method = RequestMethod.POST)
    public String paginaElasTech(@RequestParam String nome, @RequestParam int idade, Model model){
    int faltaIdade = 18 - idade;
        model.addAttribute("name", nome);
        model.addAttribute("idade", idade);
    model.addAttribute("faltaIdade", faltaIdade);
        return idade >= 18 ? "maior-idade" : "menor-idade";
    }


    @GetMapping("/soulcode")
    @ResponseBody
    public String paginaSoulcode(){
        return "Olá eu sou a pagina Soulcode";
    }

    @GetMapping("/cadastro-produto")
    public String cadastroProduto(){
        return "cadastro";
    }

    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario(){
        return "cadastro-usuario";
    }

    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }


}
