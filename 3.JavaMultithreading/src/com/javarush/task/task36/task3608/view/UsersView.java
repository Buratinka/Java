package com.javarush.task.task36.task3608.view;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.controller.Controller;
import com.javarush.task.task36.task3608.model.ModelData;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.List;

public class UsersView implements View {

    private Controller controller;
    private UserService userService = new UserServiceImpl();

    private ModelData modelData;


    private View view;

    @Override
    public void refresh(ModelData modelData) {
        if (modelData.isDisplayDeletedUserList() == true)
        {
            System.out.println("All deleted users:");
        }
        if (modelData.isDisplayDeletedUserList() == false)
        {
            System.out.println("All users:");
        }

        for(User u : modelData.getUsers())
        {
            if(u != null)
            {
                System.out.println("\t" + u.toString());
            }
        }

        System.out.println("===================================================");

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers()
    {
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long userId) { controller.onOpenUserEditForm(userId); }





}
