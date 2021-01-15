package com.sbrtest.app2.controller;

import com.sbrtest.app2.Message;
import com.sbrtest.app2.MessageRepo;
import com.sbrtest.app2.dto.MessageDto;
import com.sbrtest.app2.service.Greeting;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@RestController
@RequestMapping("/")
public class WebController {
    @Autowired
    private MessageRepo messageRepo;

    public ResponseEntity<MessageDto> getMessage() {
        URI resourceURI = URI.create("http://localhost:8081/recived_message/get_message");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<MessageDto> messageDto = restTemplate.exchange(resourceURI, HttpMethod.GET, null, MessageDto.class);
        return messageDto;
    }


    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }


    @GetMapping("/greetings")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greetings";
    }

    @PostMapping
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);

        messageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }


    /*
    @PostMapping
    public Date dateNow = new Date() {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy kk:mm:ss");
    System.out.println("Текущая дата "+formatForDateNow.format(dateNow));
    }*/
}







    //private MessageRepo messageRepo;
    //Вывод Страницы приветствия с названием сервера
   /* @Autowired
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="servername", required=false, defaultValue="Server") String servername,
            Map<String, Object> model)
    {
        model.put("servername", servername);
        return "greeting";
    }
    //Вывод сообщений веб
    /*@GetMapping("/")
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }
    //Запись сообщений веб
    @PostMapping
    public String add(@RequestParam String name,
                      @RequestParam String secondname,
                      @RequestParam String body,
                      Map<String, Object> model) {
        Message message = new Message(name, secondname, body);

        MessageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }*/

