package gr.aueb.cf.springstarter4.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler (value = {RuntimeException.class})
    public String handleBadRequestException(RuntimeException ex, Model model) {
        model.addAttribute("msg", "Runtime exception" + ex.getMessage());
        return "error";
    }

    @ExceptionHandler (value = {Exception.class})
    public String handleException(Exception ex, Model model) {
        model.addAttribute("msg", "E" +
                "exception" + ex.getMessage());
        return "error";
    }
}
