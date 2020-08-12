package code.elif.controller;

import code.elif.model.TodoData;
import code.elif.service.TodoService;
import code.elif.util.Mappings;
import code.elif.util.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TodoItemController {

    private final TodoService todoService;

    @Autowired
    public TodoItemController(TodoService todoService) {
        this.todoService = todoService;
    }

    @ModelAttribute
    public TodoData todoData() {
        return todoService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items() {
        return Views.ITEMS_LIST;
    }

}
