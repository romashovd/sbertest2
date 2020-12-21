package com.sbrtest.app2.controller;

import com.sbrtest.app2.dto.MessageDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


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
}
