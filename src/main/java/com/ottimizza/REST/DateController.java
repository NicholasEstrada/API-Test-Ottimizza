package com.ottimizza.REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class DateController {

    @PostMapping("/formatDate")
    public String formatData(@RequestBody String data) {
        return formatDateyyyyMM(data);
    }

    @PostMapping("/nameConcatenate")
    public ResponseEntity<String> nameConcatenate(@RequestBody String[] name ){

        if(name != null){
            String nameFull = arrayNameConcatenate(name);
            return ResponseEntity.ok(nameFull);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PostMapping("/foundHighest")
    public ResponseEntity<Integer> foundHighestNumber(@RequestBody int[] numbers){

        if (numbers != null){
            int highestNumber = highestNumberFounder(numbers);
            return ResponseEntity.ok(highestNumber);
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

    }

    private String formatDateyyyyMM(String data) {
        String[] formats = {"dd/MM/yyyy","dd MM yyyy","ddMMyyyy","yyyy MM dd","yyyy MM"};
        SimpleDateFormat formatOut = new SimpleDateFormat("yyyy MM");

        for (String format : formats) {
            SimpleDateFormat formatIn = new SimpleDateFormat(format);
            try {
                Date formattedDate = formatIn.parse(data);
                return formatOut.format(formattedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private String arrayNameConcatenate(String[] name) {
        StringBuilder result = new StringBuilder();

        for(String element : name) {
            result.append(element).append(" ");
        }
        return result.toString().trim();
    }

    private int highestNumberFounder(int[] numbers) {
        int highValue = Integer.MIN_VALUE;

        for( int value : numbers){
            if (value > highValue) {
                highValue = value;
            }
        }

        return highValue;
    }
}
