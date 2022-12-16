package com.DW.DiscoverWeakly;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public abstract class Default {
    public Model setModel(Model model) {
        return model;
    }

}