package lk.ijse.dep9.app.service;

import lk.ijse.dep9.app.service.custom.impl.ProjectTaskServiceImpl;
import lk.ijse.dep9.app.service.custom.impl.UserServiceImpl;

import java.io.Serializable;

public class ServiceFactory  {

    private static ServiceFactory serviceFactory;

    public ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        return (serviceFactory == null) ? (serviceFactory = new ServiceFactory()) : serviceFactory;
    }

    public <T extends SuperService> T getService(ServiceTypes serviceTypes, Class<T> clazz){
        switch (serviceTypes){
            case USER:
                return clazz.cast(new UserServiceImpl());
            case PROJECT_TASK:
                return clazz.cast(new ProjectTaskServiceImpl());
            default:
                return null;
        }
    }
}
