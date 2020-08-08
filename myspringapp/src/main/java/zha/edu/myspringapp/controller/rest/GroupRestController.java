package zha.edu.myspringapp.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zha.edu.myspringapp.model.Group;
import zha.edu.myspringapp.service.group.GroupService;

import java.util.List;

@RequestMapping("/api/group")
@RestController
public class GroupRestController {

    @Autowired
    GroupService groupService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<Group> getGroups() {
        return groupService.getAll();
    }
}
