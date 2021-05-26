package com.orarin.orarin.service;

import com.orarin.orarin.model.Marks;

public interface MarksService {

    Marks addMarks(Marks marks, Integer id);

    void deleteMarks(Integer id);
}
