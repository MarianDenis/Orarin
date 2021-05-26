package com.orarin.orarin.controller;

import com.orarin.orarin.model.Marks;
import com.orarin.orarin.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private MarksService marksService;

    @PostMapping(value="/addmarks/{id}")
    public Marks addMarks(@RequestBody Marks marks, @PathVariable Integer id) {
        return marksService.addMarks(marks,id);
    }

    @DeleteMapping(value="/delete/{id}")
    public void delete(@PathVariable Integer id){
        marksService.deleteMarks(id);
    }
}
