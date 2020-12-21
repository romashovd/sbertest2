package com.sbrtest.app2.controller;

import com.sbrtest.app2.dto.MessageDto;
//import com.sbrtest.app2.repository.MessageRepo;
import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Map;

@RestController
@RequestMapping("/")
public class WebController {
    public ResponseEntity<MessageDto> getMessage(){
        URI resourceURI = URI.create("http://localhost:8081/recived_message/get_message");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<MessageDto> messageDto = restTemplate.exchange(resourceURI, HttpMethod.GET, null, MessageDto.class);
        return messageDto;
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
    public String add(@RequestParam String fname,
                      @RequestParam String lname,
                      @RequestParam String text,
                      Map<String, Object> model) {
        Message message = new Message(fname, lname, text);

        MessageRepo.save(message);

        Iterable<Message> messages = messageRepo.findAll();

        model.put("messages", messages);

        return "main";
    }*/
}
